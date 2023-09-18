import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.print("Enter your name : ");
            name = userInput.nextLine();
        }

        System.out.println("Wellcome " + name);
    }
}
