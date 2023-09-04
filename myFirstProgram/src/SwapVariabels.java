public class SwapVariabels {
    public static void main(String[] args) {
        int x = 10, y = 2, temp;

        System.out.println(x);
        System.out.println(y);

        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);


        String xS = "water", yS = "mud", tempS;

        System.out.println(xS);
        System.out.println(yS);

        tempS = xS;
        xS = yS;
        yS = tempS;

        System.out.println(xS);
        System.out.println(yS);
    }
}
