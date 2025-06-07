import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        //for(initial condition, condition, update)

        // Code 1
        // for(int i = 0; i < 10; i++){
        //     System.out.println(i+1);
        // }

        // Code 1
        // System.out.println("Enter how many times you want to loop: ");
        // int max = scanner.nextInt();

        // for(int i = 1; i <= max; i++){
        //     System.out.println(i);
        // }

        // Code 3

        int start = 10;

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!");

        scanner.close();
    }
}
