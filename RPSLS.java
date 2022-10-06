import java.util.Scanner;

public class RPSLS {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean loop = true;

        boolean rock = false;
        boolean paper = false;
        boolean scissors = false;
        boolean lizard = false;
        boolean spock = false;

        Boolean[] choiceList = {rock, scissors, paper, lizard, spock};
        while (loop) {
            int compChoice = (int) (Math.random() * choiceList.length + 1);
            choiceList[compChoice] = true;
            
            System.out.println("Rock, Paper, Scissors, Lizard, Spock: ");
            String userChoice = sc.nextLine();

            
            



        }
    sc.close();
    }

}