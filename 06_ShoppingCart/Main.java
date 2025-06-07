import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?");
        item = scanner.nextLine();

        System.out.println("What is the price for each");
        price = scanner.nextDouble();

        System.out.println("How muh would you like to buy?");
        quantity = scanner.nextInt();

        total = price*quantity;

        System.out.println("Thank you for buying "+ item + "! Your total is "+ currency +total);


        scanner.close(); 
    }
}
