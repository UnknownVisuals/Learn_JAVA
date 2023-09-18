import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter rows count : ");
        int rows = userInput.nextInt();
        System.out.print("Enter columns count : ");
        int columns = userInput.nextInt();
        System.out.print("Enter symbol to use : ");
        String symbol = userInput.next();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(" " + symbol + " ");
            }
            System.out.println();
        }
    }
}
