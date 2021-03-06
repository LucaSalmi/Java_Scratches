import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] values = {1,2,3,4,5,6,7,8,9,10};
        int [] randomNumbers = new int[20];
        int[] randomNumbers2 = new int[20];
        int [] a = {1,5,8,23,54,12,88,12,76,10};
        int [] b = {1,5,8,23,54,12,88,12,76,10};
        int max = 99;
        int min = 0;
        int range = max - min + 1;
        int errorCheck = 0;



        /* Fill array with random numbers
        for (int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = (int) (Math.random()*range)+min;
        }
         */

        /*
        for (int i = 0; i < randomNumbers2.length; i++){
            randomNumbers2[i] = (int) (Math.random()*range)+min;
        }
         */

        //randomArray(values);
        //printArray(values);
        //computeArray(values);
        //negativeInArray(values);
        //R613(numbers);
        //P61(randomNumbers);
        //P66(randomNumbers);
        //P67(randomNumbers);
        //System.out.println("The two arrays are identical: " + equals(a, b));
        //dieRolls(randomNumbers2);
        //sort(randomNumbers);

    }

    //P6.14
    public static void sort(int[] randomNumbers){

        System.out.println(Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));

    }



    //P6.13
    public static void dieRolls(int[] dieRolls){

        int counter = 1;
        int longestCounter = 1;
        int startPoint = 0;
        int offset = 0;

        for(int i = 1; i < dieRolls.length; i++){

            if(dieRolls[i] != dieRolls[i-1]){
                counter = 0;
            }

            counter ++;

            if (counter >= 2 && counter >= longestCounter){
                if (counter > longestCounter) {
                   offset++;
                    startPoint = i-offset;
                    longestCounter = counter;
                }
            }
        }

        int stopPoint = (longestCounter + startPoint);

        StringBuffer printReady = new StringBuffer(Arrays.toString(dieRolls));
        printReady.insert(startPoint*3+1,"(");
        printReady.insert(stopPoint*3, ")");



        System.out.println("counter"+counter);
        System.out.println("long count"+longestCounter);
        System.out.println("start"+startPoint);
        System.out.println("stop"+stopPoint);
        System.out.println(printReady);

    }




    public static boolean equals (int[] a, int[] b){

        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;

    }


    public static void P67 (int[] randomNumbers){

        int[] reverse = new int[randomNumbers.length];
        int x = 0;

        for (int i = (randomNumbers.length-1); i>= 0; i--){

            reverse[x] = randomNumbers[i];
            x++;

        }
        System.out.println(Arrays.toString(reverse));
    }

    public static void P66 (int [] randomNumbers){

        int count = 0;
        int sum = randomNumbers[0];
        for (int i = 1; i< randomNumbers.length; i++) {
            if (count == 0){
                sum = sum - randomNumbers[i];
                count ++;
            }else {
                sum = sum + randomNumbers[i];
                count --;
            }
        }

        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(sum);
    }

    public static void P61 (int [] randomNumbers){


        for(int i = 0; i < randomNumbers.length; i +=2){

            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("Even positions");

        for (int var : randomNumbers) {
            if (var %2 == 0){
                System.out.print(var + " ");
            }

        }

        System.out.println();
        System.out.println("Even Numbers");

        for (int i = randomNumbers.length-1; i >= 0; i--){
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("Inverted order");

        for (int i = 0; i < randomNumbers.length; i++){
            if ( i == 0 || i == (randomNumbers.length-1)){
                System.out.print(randomNumbers[i] + " ");
            }

        }
        System.out.println();
        System.out.println("Full array" + Arrays.toString(randomNumbers));

    }

    public static void R613 (int [] numbers){
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){

            System.out.print("Number " + (i+1) + ": ");
            numbers[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        int[] invertedNumbers = new int[numbers.length];

        for (int i = 9; i >= 0; i--) {

            invertedNumbers[i] = numbers[(9-i)];
        }
        System.out.println(Arrays.toString(invertedNumbers));
    }

    public static void randomArray(int[] values){

        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int check = 0;

        for (int i = 0; i< values.length; i++){
            values[i] = (int)(Math.random()*range)+min;
            check = values[i];
            if (i > 0){

                for (int x = 0; x <= i; x++) {

                    while(check == values[i]){
                        values[i] = (int)(Math.random()*range)+min;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(values));
    }

    //R6.7
    public static void printArray(int [] values){

        for (int x: values) {

            System.out.print(x + " ");
        }
        System.out.println();
    }
    //R6.8
    public static void computeArray(int [] values){
        int sum = 0;
        for (int x : values) {

            sum += x;
        }
        System.out.println(sum);
    }
    //R6.9
    public static void negativeInArray(int [] values){
        int count = 0;

        for (int x : values) {

            if (x < 0){
                count ++;
            }

        }
        System.out.println("There are " + count + " negative numbers");
    }



















}
