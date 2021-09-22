class Scratch {
    public static void main(String[] args) {

        Employee a = new Employee("Andrea", 1000.0);
        Manager b = new Manager("Marco", 15000.0, "Economy");
        Executive c = new Executive("Maria", 200000.0, "CEO");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return name +" "+ salary;
    }

}
class Manager extends Employee{
    String department;


    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    public String toString(){
        return super.toString()+" "+ department;
    }
}

class Executive extends Manager{
    String executive = " Executive";

    public Executive(String name, double salary, String department){
        super(name, salary, department);
    }

    public String toString(){
        return super.toString() + executive;
    }


}

