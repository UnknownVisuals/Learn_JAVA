import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = 10;

        double z = Math.max(x,y);
        System.out.println(z);

        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(y));
        System.out.println(Math.round(x));
        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));

        System.out.println("\n===============\n");

        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side a = ");
        a = input.nextDouble();
        System.out.println("Enter side b = ");
        b = input.nextDouble();

        c = Math.sqrt(a*a + b*b);

        System.out.println("The hypotenuse is : " + c);
        input.close();

    }
}
