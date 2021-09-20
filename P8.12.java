import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Bug mike = new Bug(10);
        Scanner in = new Scanner(System.in);
        int counter = 0;

        System.out.println("Hi I'm Mike! can you direct me in the dark?");
        for (int i = 0; i < 15; i++){

            System.out.println("How much should Mike move?");
            counter ++;
            mike.move(in.nextInt());
            if (counter == 3){
                mike.turn();
                System.out.println("Mike is turning around...");
                counter = 0;
            }

        }

        System.out.print("where is Mike now?:");
        in.nextInt();
        System.out.println("position is: " + mike.getPosition());
    }
}

class Bug{
    private int position;
    private boolean turn = true;


    public Bug(int initialPosition){
        position = initialPosition;
    }

    public void move(int movement){
        if(turn == true){
            this.position = position + movement;
        }else{
            this.position = position - movement;
        }
    }

    public void turn(){
        turn = !turn;
    }

    public int getPosition() {
        return position;
    }
}