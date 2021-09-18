import java.util.Arrays;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] numbers = new int[16];

        fillUp(numbers, in);

        if (checkIfSame(numbers) == true){

            if (isSquareMagic(multiDimArray(numbers)) == true){
                System.out.println("This is a magic square!!");
            }else{
                System.out.println("This isn't a magic square");
            }

        }else{
            System.out.println("All numbers must be different");
            System.out.println("Try again");
            fillUp(numbers, in);
        }
    }

    public static int[] fillUp( int[] numbers, Scanner in){


        for (int i = 0; i < numbers.length; i++){

            System.out.print("write the " + (i+1) + " number: ");

            while (!in.hasNextInt()){
                in.next();
            }
            numbers[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;

    }

    public static boolean checkIfSame (int[] numbers){

        int counter = 0;
        int confront = 0;
        int timesToRun = 1;

        while(timesToRun < numbers.length){

            for (int i = 0; i< numbers.length; i++){

                if (numbers[confront] == numbers[i]){
                    counter ++;
                }
                if (counter == 2){
                    return false;
                }
            }
            confront ++;
            timesToRun ++;
            counter = 0;
        }

        return true;
    }

    public static int[][] multiDimArray (int[] numbers){

        int [][] magicSquare = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                magicSquare[i][j] = numbers[(j*4)+i];
            }
        }
        return magicSquare;
    }

    public static boolean isSquareMagic (int [][] magicSquare){
        int [] sumsOfAll = new int[10];
        //Sums columns
        for (int[] var: magicSquare) {
            sumsOfAll[4] += var[0];
            sumsOfAll[5] += var[1];
            sumsOfAll[6] += var[2];
            sumsOfAll[7] += var[3];
        }
        //Sums rows
        int counter = 0;
        while (counter < 4){

            for (int var : magicSquare[counter]) {
                sumsOfAll[counter] += var;
            }
            counter++;
        }

        //Sums diagonals
        int a = 0;
        int b = 0;
        int sum = 0;
        for (int i = 0; i<4; i++){
            sum += magicSquare[a][b];
            a++;
            b++;
        }
        sumsOfAll[8] = sum;

        a = 0;
        b = 3;
        sum = 0;
        for (int i = 0; i<4;i++) {
            sum += magicSquare[a][b];
            a++;
            b--;
        }
        sumsOfAll[9] = sum;

        if(isAllSame(sumsOfAll) == true){
            return true;
        }else return false;

    }

    public static boolean isAllSame(int [] sums){

        for (int i = 1; i< sums.length; i++) {

            if (sums[i] != sums[i-1]){
                return false;
            }
        }

        return true;
    }





}