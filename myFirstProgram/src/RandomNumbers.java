import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(1,6);
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
