
import java.util.InputMismatchException;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        go();
    }


    private static void go() {

        Scanner in = new Scanner(System.in);
        System.out.println("Write two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("What operation?");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Average");
        System.out.println("5: Distance");
        System.out.println("6: Maximum");
        System.out.println("7: Minimum");
        System.out.println("8: Terminate");

        int selection = 0§;
        try{
        selection = in.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Not a number");
            go();
        }

        switch (selection) {
            case 1:
                System.out.println("The sum is " + Addition(num1, num2));
                go();
            case 2:
                System.out.println("The difference is " + Subtraction(num1, num2));
                go();
            case 3:
                System.out.println("The Product is " + Multiplication(num1, num2));
                go();
            case 4:
                System.out.println("The average is " + Average(num1, num2));
                go();
            case 5:
                System.out.println("The distance is " + Distance(num1, num2));
                go();
            case 6:
                System.out.println(Maximum(num1, num2) + " is the highest number");
                go();
            case 7:
                System.out.println(Minimum(num1, num2) + " is the smallest");
                go();
            case 8:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Invalid choice");
                go();

        }
    }


    private static int Addition(int num1 , int num2){
        int res = num1+num2;
        return res;
    }

    private static int Subtraction(int num1, int num2){
        int res = num1-num2;
        return res;
    }

    private static int Multiplication(int num1, int num2){
        int res = num1 * num2;
        return res;
    }

    private static int Average(int num1, int num2){
        int res = (num1+num2)/2;
        return res;
    }

    private static int Distance(int num1, int num2){
        int res = Math.abs(num1-num2);
        return res;
    }

    private static int Maximum(int num1, int num2){
        int res = Math.max(num1, num2);
        return res;
    }

    private static int Minimum(int num1, int num2) {
        int res = Math.min(num1, num2);
        return res;
    }


}