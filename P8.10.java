import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        VotingMachine republican = new VotingMachine();
        VotingMachine democrat = new VotingMachine();

        votingSeason(republican, democrat);

        System.out.print("Votes for the Republican party: ");
        republican.countVotes();
        System.out.println();
        System.out.print("Votes for the Democratic party: ");
        democrat.countVotes();
    }

    /**
     * takes user input and assign 1 vote to one party or the other, the third option exits the loop
     * @param republican obj containing votes for republican
     *
     * @param democrat obj containing votes for democrats
     */

    public static void votingSeason(VotingMachine republican, VotingMachine democrat){

        boolean isElectionOpen = true;
        Scanner in = new Scanner(System.in);

        while (isElectionOpen == true){
            System.out.println("Cast your vote:");
            System.out.println("1. Republican Party");
            System.out.println("2. Democratic Party");
            System.out.println("3. Stop the election!");

            while (!in.hasNextInt()){
                in.next();
            }

            switch (in.nextInt()){
                case 1:
                    republican.setVotes();
                    System.out.println("Thank you for voting!!!");
                    break;
                case 2:
                    democrat.setVotes();
                    System.out.println("Thank you for voting!!!");
                    break;
                case 3:
                    isElectionOpen = false;
            }
        }
    }
}

class VotingMachine{
    private int votes;

    public void setVotes(){
        votes += 1;
    }
    public void countVotes(){
        System.out.println(this.votes);
    }

}