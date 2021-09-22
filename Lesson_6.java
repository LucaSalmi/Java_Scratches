class Scratch {
    public static void main(String[] args) {

        Person a = new Person("Andrea", 1980);
        Student b = new Student("Luca", 1990, "Developer");
        Instructor c = new Instructor("Bill", 1980, 10000.00);

        a.printOut();
        b.printOut();
        c.printOut();

        
    }
}

class Person{
    String Name;
    int birthYear;


    public Person(String name, int birthYear){
        this.Name = name;
        this.birthYear = birthYear;
    }

    public void printOut(){
        System.out.println("Name: "+this.Name);
        System.out.println("Year of birth: "+this.birthYear);
    }
}

class Student extends Person{
    String major;


    public Student(String name, int birthYear, String major){
        super(name,birthYear);
        this.major = major;
    }

    public void printOut(){
        super.printOut();
        System.out.println("Major: " + this.major);
    }
}

class Instructor extends Person{
    double salary;

    public Instructor(String name, int birthYear, double salary){
        super(name,birthYear);
        this.salary = salary;
    }
    public void printOut(){
        super.printOut();
        System.out.println("Salary: " + this.salary);
    }
}