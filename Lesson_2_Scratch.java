import java.util.Scanner;

class Lesson2_scratch {
    public static void main(String[] args) {
        /*
        double x = 2.5;
        double y = -1.5;
        int m = 18;
        int n = 4;

        System.out.println(x+n*y-(x+n)*y);

        System.out.println(m/n + m%n);

        System.out.println(5*x-n/5);

        System.out.println(1-(1-(1-(1-(1-n)))));

        System.out.println(Math.sqrt(Math.sqrt(n)));
         */

         /*
        int n = 17;
        int m = 18;

        System.out.println(n/10 + n%10);

        System.out.println(n%2 + m%2);

        System.out.println((m+n)/2);

        System.out.println((m+n)/2.0);

        System.out.println((int) (0.5*(m+n)));

        System.out.println((int) Math.round(0.5*(m+n)));
          */
            /*
        String s = "Hello";
        String t = "World";

        System.out.println(s.length()+t.length());
        System.out.println(s.substring(1,2));
        System.out.println(s.substring(s.length()/2,s.length()));
        System.out.println(s+t);
        System.out.println(t+s);
             */

        /*
        //define variables
        double vertical = 8.5;
        double horizontal = 11.0;
        double millimetersPerInch = 25.4;
        //calculating and printing
        double verticalMillimeters = vertical*millimetersPerInch;
        double horizontalMillimeters = horizontal*millimetersPerInch;
        //Perimeter and diagonal calculation
        Double perimeter = 2*(verticalMillimeters+horizontalMillimeters);
        Double diagonal  = Math.pow(verticalMillimeters,2)+Math.pow(horizontalMillimeters,2);
        System.out.println(verticalMillimeters);
        System.out.println(horizontalMillimeters);
        System.out.println(perimeter);
        System.out.println(Math.floor(Math.sqrt(diagonal)));
         */


        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Write two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println((num1+num2)/2);
        System.out.println(Math.abs(num1-num2));
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));
         */

        //A n=1, k=2, r=n => n=1, k=2, r=1

        //B n=1 k=2 r => n=1 k=2 r=2

        //C n=1 k=2 r=k => n=1 k=1 r=2

        //D n=1 k=2 r=3 => n=1 k=6 r=3

        //R3.2 i den fösta körs båda if en efter den andra
        // I den andra körs bara en av de

        /*
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number < 0) {
            System.out.println("It's a negative number");
        }else if (number == 0) {
            System.out.println("It's a zero");
        }else {
            System.out.println("It's a positive number");
        }
         */
        /*
        Scanner in = new Scanner(System.in);
        float number = in.nextFloat();
        if (number == 0) {
            System.out.println("It's a zero");
        }
        if (number > 0) {
            float abs = Math.abs(number);
            System.out.println((abs));
            if (abs < 1) {
                System.out.println("The number is a small positive");
            } else if (abs > 1000000) {
                System.out.println("The number is a large positive");
            } else System.out.println("The number is positive");
        }

        if (number < 0) {
            float abs = Math.abs(number);
            if (abs < 1) {
                System.out.println("The number is a small negative");
            } else if (abs > 1000000) {
                System.out.println("The number is a large negative");
            } else System.out.println("The number is negative");
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");

        double A = 3.7;
        double B = 2.7;
        double C = 1.7;
        double D = 0.7;
        double F = 0.0;

        String grade = in.next();
        if (grade.contains("A")){
            if (grade.contains("+")){
                System.out.println(A+0.3);
            }else if (grade.contains("-")){
                System.out.println(Math.floor(A-0.3));
            }else System.out.println(A);
        }
        if (grade.contains("B")) {
            if (grade.contains("+")) {
                System.out.println(B + 0.3);
            } else if (grade.contains("-")) {
                System.out.println(Math.floor(B - 0.3));
            } else System.out.println(B);
        }
        if (grade.contains("C")) {
            if (grade.contains("+")) {
                System.out.println(C + 0.3);
            } else if (grade.contains("-")) {
                System.out.println(Math.floor(C - 0.3));
            } else System.out.println(C);
        }
        if (grade.contains("D")) {
            if (grade.contains("+")) {
                System.out.println(D + 0.3);
            } else if (grade.contains("-")) {
                System.out.println(Math.floor(D - 0.3));
            } else System.out.println(D);
        }
        if (grade.contains("F")) {
            if (grade.contains("+")) {
                System.out.println(F + 0.3);
            } else if (grade.contains("-")) {
                System.out.println(Math.floor(F - 0.3));
            } else System.out.println(F);
        }
         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Shorthand for card: ");
        String cardInput = in.next();
        char [] letters = new char[cardInput.length()];
        for (int i = 0; i <= cardInput.length(); i++){
            letters[i] = cardInput.charAt(i);
        }

        for(char symbol : letters){

            switch(symbol){

                case 'A':
                    System.out.print(" Ace ");
                    break;
                case 'J':
                    System.out.print(" Jack ");
                    break;
                case 'Q':
                    System.out.print(" Queen ");
                    break;
                case 'K':
                    System.out.print(" King ");
                    break;
                case 'D':
                    System.out.println(" Diamonds ");
                    break;
                case 'H':
                    System.out.println(" Hearts ");
                    break;
                case 'S':
                    System.out.println(" Spades ");
                    break;
                case 'C':
                    System.out.println(" Clubs ");
                    break;
                case '1':
                    System.out.println(" 1 ");
                    break;
                case '2':
                    System.out.println(" 2 ");
                    break;
                case '3':
                    System.out.println(" 3 ");
                    break;
                case '4':
                    System.out.println(" 4 ");
                    break;
                case '5':
                    System.out.println(" 5 ");
                    break;
                case '6':
                    System.out.println(" 6 ");
                    break;
                case '7':
                    System.out.println(" 7 ");
                    break;
                case '8':
                    System.out.println(" 8 ");
                    break;
                case '9':
                    System.out.println(" 9 ");
                    break;
                case '0':
                    System.out.println(" 0 ");
                    break;
            }
        }
         */

        /*
        //R4.1A
        int n = 0;
        while(Math.pow(n,2)<100){
            System.out.println(Math.pow(n,2));
            n++;
        }
         */

        //B
        /*
        int n = 100;
        for(int i = 0; i < n; i++){
            int rest = i%10;
            if (rest == 0){
                System.out.println(i);
            }
        }
         */
        /*
        int n = 0;
        int limit = 100;
        while(Math.pow(2,n) < limit){
            System.out.println((int)Math.pow(2,n));
            n++;
        }
         */

        /*
        int n = 100;
        int Sum = 0;
        for(int i=0; i <= n; i = i+2){

            Sum = i + Sum;
        }
        System.out.println(Sum);
         */









    }
}