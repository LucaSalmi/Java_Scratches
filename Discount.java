import java.time.Instant;
import java.util.Date;


class Scratch {
    public static void main(String[] args) {

        Customer angela = new Customer("Angela");
        angela.setMember();
        angela.setMemberType("Gold");
        System.out.println(angela.toString());

        Visit one= new Visit(Date.from(Instant.now()));
        one.setServiceExpense(200.0);
        one.setProductExpense(100.0);
        System.out.println(one.getTotalExpense(angela.isMember(), angela.getMemberType()));





    }
}

class Customer{
    protected String name;
    protected boolean member = false;
    protected String memberType;

    public Customer(){}

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isMember(){
        if (member == true){
            return true;
        }else return false;
    }

    public void setMember(){
        member = !member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberType() {
        return memberType;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}

class Visit extends Customer{

    Date date;
    double serviceExpense;
    double productExpense;
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold = 0.15;
    double serviceDiscountSilver = 0.1;
    double productDiscount = 0.1;


    public Visit(){}
    public Visit(Date date) {
        this.date = date;
    }

    public String getName() {
        return this.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(boolean checkMember, String memberType){
        double b = getServiceExpense();
        double a = getProductExpense();
        a = a - (a * productDiscount);
        if (checkMember == true){
            System.out.println("check 1 passed");
            b = b - (b * getServiceDiscountRate(memberType));
        }
        return a+b;
    }


    public double getServiceDiscountRate(String memberType) {

        switch (memberType) {
            case "Gold":
                return serviceDiscountGold;
            case "Silver":
                return serviceDiscountSilver;
            case "Premium":
                return serviceDiscountPremium;
            default:
                break;
        }
        return 1.0;
    }
}
