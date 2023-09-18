import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

//        Using AND &&
        int temp = 15;
        if(temp > 30){
            System.out.println("it is hot outside");
        } else if (temp >= 20 && temp <= 30){
            System.out.println("it is warm outside");
        } else {
            System.out.println("it is cold outside");
        }

//        Using OR ||
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to exit");
        String response = userInput.next();
        if (response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game!");
        }

//        Using NOT !
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to exit");
        String response = userInput.next();
        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game!");
        } else {
            System.out.println("You quit the game");
        }

    }
}
