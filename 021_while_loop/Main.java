import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Code 1
        // String name = "";

        // while(name.isEmpty()){
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello "+ name);

        
        // Code 2
        // String response = "";

        // while(!response.equals("Q")){
        //     System.out.println("You are playing a game.");
        //     System.out.println("Press Q to exit");
        //     response = scanner.next().toUpperCase();
        // }


        // Code 3
        int age = 0;
        do{
            System.out.println("Your age can't be negative!");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
