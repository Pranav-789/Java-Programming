import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.nextLine().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp* 9 / 5) + 32;

        System.out.printf("New temperature is: %.1f %s", newTemp, unit);


        scanner.close();
    }
}
