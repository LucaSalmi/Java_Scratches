import java.util.Scanner;

import jdk.nashorn.internal.parser.JSONParser;

class Scratch {
    public static void main(String[] args) {
        double x = 12.0;
        double y = 12.0;
        double z = 21.0;
        int n = 7;
        String str = "let's go to the mall";
        //System.out.println(fistDigit(n));
        //System.out.println(lastDigit(n));
        //System.out.println(digits(n));


        //System.out.println("are they all the same: " + allTheSame(x,y,z));
        //System.out.println("are they all different: " + allDifferent(x,y,z));
        //System.out.println("are they sorted: " + sorted(x,y,z));
        //System.out.println(middle(str));
        //System.out.println(repeat(str, n));
        //System.out.println(countVowels(str));
        //System.out.println(countWords(str));
        //Scanner in = new Scanner(System.in);
        //double salary = readDouble("What is your salary: ");
        //double percentageRaise = readDouble("What percentage raise do you want?");
        //System.out.println("You want a " + percentageRaise + "% of you salary of: " + salary);


    }

    /* P5.1 a
    public static double smallest(double x, double y, double z){

        if (x < y){
            return Math.min(x,z);
        }else return Math.min(y,z);
    }
     */

    /* P5.1 a
    public static double average(double x, double y, double z){
        double sum = x+y+z;
        return sum/3;
    }
     */


    /* P5.2 a
    public static boolean allTheSame(double x, double y, double z){
        if(x == y && y == z){
            return true;
        }else return false;
    }


    P5.2 b
    public static boolean allDifferent(double x, double y, double z){
        if(x != y && y != z){
            return true;
        }else return false;
    }

       P5.2 c
    public static boolean sorted (double x, double y, double z){

        if(x <= y && y <= z){
            return true;
        }else return false;
    }
     */

    /* P5.3 a
    public static int fistDigit(int n){

        String st = new Integer(n).toString();
        return Integer.parseInt(st.substring(0,1));


    }
    P 5.3 b
    public static int lastDigit(int n){

        String st = new Integer(n).toString();
        String a = st.substring (st.length()-1);
        return Integer.parseInt(a);
    }

    P5.3 c
    public static int digits(int n){
        String st = new Integer(n).toString();
        return st.length();
        //eller
        String st = new Integer(n).toString();
        int count = 0;
        for(int i = 0; i < st.length(); i++){
            count ++;
        }
        return count;
    }
     */

        /* P5.4
        public static String middle(String str){

            String a = "";
            if (str.length() %2 == 0){
                for(int i =  (str.length()/2-1); i <= (str.length()/2); i++){
                    a = a + str.charAt(i);
                }
            }else{
                return Character.toString(str.charAt(Math.round(str.length()/2)));
            }
            return a;
        }
         */


    /*P 5.5
    public static String repeat(String str, int n){

        String a = "";
        for(int i = 0; i <= n; i++){
            a = str+a;
        }
        return a;
    }
     */

    /* P 5.6
    public static int countVowels(String str){
        int vowelsCount = 0;
        char[] letters = str.toCharArray();
        for (char c: letters) {
            switch (c){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    vowelsCount++;
                    break;
                default:
                    break;
            }
        }
        return vowelsCount;
    }
     */

    /*
    public static int countWords(String str){
        int count = 1;
        for (int i = 0; i < str.length(); i++){

            if(str.charAt(i) == ' '){
                count ++;
            }
        }
        return count;
    }
     */

    //P5.10
    /*
    public static double readDouble(String prompt){
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return Double.parseDouble(in.next());

    }
     */








}