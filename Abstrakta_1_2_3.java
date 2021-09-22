class Scratch {
    public static void main(String[] args) {

        /*
        Bank1 a = new Bank1(100);
        Bank2 b = new Bank2(150);
        Bank3 c = new Bank3(200);

        a.getBalance();
        b.getBalance();
        c.getBalance();
         */

        StudentA mikke = new StudentA(10, 25, 55);
        StudentB angela = new StudentB(35, 80, 69, 90);

        angela.getPercentage();
        mikke.getPercentage();


    }
}

abstract class Parent{
    //public abstract void message();
}
class Child1 extends Parent{

    public void message(){
        System.out.println("This is the first subclass");
    }
}
class Child2 extends Parent{
    public void message(){
        System.out.println("This is the second subclass");
    }
}

abstract class Bank{
    protected int balance;

}

class Bank1 extends Bank{

    public Bank1(int x){
        balance = x;
    }
    public void getBalance(){
        System.out.println("balance = " + balance + "$");
    }
}


class Bank2 extends Bank{
    public Bank2(int x){
        balance = x;
    }
    public void getBalance(){
        System.out.println("balance = " + balance + "$");
    }
}


class Bank3 extends Bank{
    public Bank3(int x){
        balance = x;
    }
    public void getBalance(){
        System.out.println("balance = " + balance + "$");
    }
}

abstract class Marks{
    int subj1;
    int subj2;
    int subj3;
    public abstract void getPercentage();
}

class StudentA extends Marks{
    public StudentA(int a, int b, int c){
        subj1 = a;
        subj2 = b;
        subj3 = c;
    }
    public void getPercentage() {
        int sum = (subj1+subj2+subj3)/3;
        System.out.println("Mikke "+sum+"%");
    }

}

class StudentB extends Marks{
    int subj4;

    public StudentB(int a, int b, int c, int d){
        subj1 = a;
        subj2 = b;
        subj3 = c;
        subj4 = d;
    }

    public void getPercentage() {
        int sum = (subj4+subj2+subj3+subj4)/4;
        System.out.println("Angela " + sum+"%");
    }

}
