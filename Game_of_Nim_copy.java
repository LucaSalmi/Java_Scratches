import java.util.Random;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pile = new Random().nextInt(90)+10;
        int firstTurn = new Random().nextInt(2);
        System.out.println("Welcome to the game on Nim!");
        System.out.println("Choose one");
        System.out.println("1: Easy mode");
        System.out.println("2: Hard mode");
        System.out.println("3: Terminate program");
        int selection = in.nextInt();

        switch (selection){
            case 1:
                turnsEasy(pile, firstTurn);
                if (firstTurn == 0){
                    System.out.println("The AI won!");
                    System.exit(0);
                }else{
                    System.out.println("The Player won");
                    System.exit(0);
                }
            case 2:
                turnsHard(pile, firstTurn);
                if (firstTurn == 0){
                    System.out.println("The AI won!");
                    System.exit(0);
                }else{
                    System.out.println("The Player won");
                    System.exit(0);
                }
            case 3:
                System.exit(0);
        }

    }

    private static int playerTurn(int pile){
        Scanner in = new Scanner(System.in);
        int playerMove = 0;
        while(playerMove <= 0 || playerMove > pile / 2){
            System.out.println("The pile is " + pile + " pieces");
            System.out.print("How many pieces are you going to take: ");
            playerMove = in.nextInt();
            if (pile == 1){
                break;
            }else if (playerMove < 0 || playerMove > pile/2){
                System.out.println("Invalid move, take between 1 and half of the pieces");
            }
        }

        return playerMove;
    }

    private static int easyAI (int pile){
        System.out.println("The pile is " + pile + " pieces");
        int aiMove = new Random().nextInt(pile/2);
        if (aiMove == 0){
            return (aiMove+1);
        }
        return aiMove;
    }

    private static int hardAI (int pile){
        System.out.println("The pile is " + pile + " pieces");
        int smartAIMove = 1;
        int tempPile = 1;


        if (pile == 1){
            return smartAIMove;
        }else {

            while (tempPile < pile) {
                tempPile = tempPile * 2;
            }
            if (tempPile == pile) {

                smartAIMove = (pile/2)-1;
                return smartAIMove;
            }
            while (tempPile > 1){
                tempPile -= 1;
                if (tempPile == pile){
                    smartAIMove = new Random().nextInt(pile / 2);
                    return smartAIMove;
                }else{
                    tempPile += 1;
                    tempPile /= 2;
                }
            }
            while (tempPile < pile){
                tempPile *= 2;
            }
            while (tempPile > pile){
                tempPile /= 2;
                smartAIMove = (pile-tempPile)+1;
            }return smartAIMove;
        }

    }

    private static int turnsHard (int pile, int firstTurn){

        while(pile > 0){
            if (firstTurn == 0){
                System.out.println("It's the AI's turn");
                pile = pile - hardAI(pile);
                firstTurn = firstTurn + 1;
            }else{
                System.out.println("It's your turn");
                pile = pile - playerTurn(pile);
                firstTurn = firstTurn - 1;
            }
        }
        return firstTurn;
    }


    private static int turnsEasy (int pile, int firstTurn){

        while(pile > 0){
            if (firstTurn == 0){
                System.out.println("It's the AI's turn");
                pile = pile - easyAI(pile);
                firstTurn = firstTurn + 1;
            }else{
                System.out.println("It's your turn");
                pile = pile - playerTurn(pile);
                firstTurn = firstTurn - 1;
            }
        }
        return firstTurn;
    }

}