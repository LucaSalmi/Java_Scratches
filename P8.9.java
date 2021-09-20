import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Set the combination");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > 39 || b > 39 || c > 39){
            System.exit(0);
        }

        ComboLock lock = new ComboLock(a, b, c);
        lock.reset();
        System.out.print("Turn right by? ");
        lock.turnRight(in.nextInt());
        a = lock.position;
        System.out.print("Turn left by? ");
        lock.turnLeft(in.nextInt());
        b = lock.position;
        System.out.print("Turn right by? ");
        lock.turnRight(in.nextInt());
        c = lock.position;
        if (lock.open(a,b,c) == true){
            System.out.println("The lock is open");
        }else {
            System.out.println("Wrong code");
        }
    }
}

class ComboLock{

    private int num1;
    private int num2;
    private int num3;
    int position = 0;

    public ComboLock(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void reset(){
        position = 0;
    }

    public void turnLeft (int ticks){

        position -= ticks;

        if (position < 0){
            int diff = Math.abs(position);
            position = (40 - diff);
        }

        System.out.println("selected number: " + position);
    }

    public void turnRight (int ticks){

        position += ticks;

        if (position > 39){
            int surplus = Math.abs(position - 39);
            System.out.println(surplus);
            position = surplus -1;

        }

        System.out.println("selected number: " + position);
    }

    public boolean open (int a, int b, int c){
        if (a == num1 && b == num2 && c == num3){
            return true;
        }
        return false;
    }




}