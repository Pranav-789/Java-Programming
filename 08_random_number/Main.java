import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = random.nextInt(1, 6);
        number2 = random.nextDouble(1, 6);
        isHeads = random.nextBoolean();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(isHeads);
    }
}
