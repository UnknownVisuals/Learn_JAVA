public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Ford Shelby", "Ferrari", "Lamborghini", "Tesla"};
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        System.out.println("--------------------------");

        String[] carsNew = new String[3];
        carsNew[0] = "Camaro";
        carsNew[1] = "Corvette";
        carsNew[2] = "Mustang";
        for (int i = 0; i < carsNew.length; i++){
            System.out.println(carsNew[i]);
        }
    }
}
