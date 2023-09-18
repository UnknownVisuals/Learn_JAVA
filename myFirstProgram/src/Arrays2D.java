import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for (int i = 0; i < cars.length; i++){
            for (int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        String[][] carsNew = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F150"},
                {"Ferrari", "Lambo", "Tesla"}
        };

        for (int i = 0; i < carsNew.length; i++){
            for (int j = 0; j < carsNew[i].length; j++){
                System.out.print(cars[i][j] + "\t\t");
            }
            System.out.println();
        }


        System.out.println("-----------------------------");

        Scanner userInput = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        for (int i = 0; i < matriks.length; i++){
            for (int j = 0; j <  matriks[i].length; j++){
                System.out.print("Input matriks[" + i + "][" + j + "] : ");
                matriks[i][j] = userInput.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < matriks.length; i++){
            for (int j = 0; j <  matriks[i].length; j++){
                System.out.print(" " + matriks[i][j] + " ");
            }
            System.out.println();;
        }
    }
}
