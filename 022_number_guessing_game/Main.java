import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(1, 101);

        System.out.println("Guess the number between 1 - 100");
        int guessedNumber = scanner.nextInt();

        while(guessedNumber != number){
            if(guessedNumber > number){
                System.out.println("Choose lower number!");
                System.out.println("Guess the number");
                guessedNumber = scanner.nextInt();
            }
            else if(guessedNumber < number){
                System.out.println("Choose higher number!");
                System.out.println("Guess the number");
                guessedNumber = scanner.nextInt();
            }
        }

        System.out.println("Congrats! you guessed the right number " + guessedNumber + ".");
        scanner.close();
    }
}
