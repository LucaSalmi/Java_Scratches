import java.util.ArrayList;
import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        int [] values = {1,2,3,4,5,-6,7,-8,9,10};
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int check = 0;
        //printArray(values);
        //computeArray(values);
        //negativeInArray(values);





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

    public static void R613 (int [] values){

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