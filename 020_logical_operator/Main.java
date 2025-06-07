import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // double temp = -10;
        // boolean isSunny = false;
        
        // if(temp <= 30 && temp >= 0 && isSunny){
        //     System.out.println("The weather is GOOD");
        //     System.out.println("It is SUNNY outside");
        // }
        // else if(temp <= 30 && temp >= 0 && !isSunny){
        //     System.out.println("The weather is GOOD");
        //     System.out.println("It is CLOUDY outside");
        // }
        // else if(temp > 30 || temp < 0){
        //     System.out.println("The weather is bad");
        // }

        //username must not contain spaces or underscore
        //username must be between 4-12 characters

        String username;
        System.out.print("Enter the username: ");
        username = scanner.nextLine();

        if((username.length() >= 4 && username.length() <= 12) && (!username.contains(" ") || !username.contains("_"))){
            System.out.println("Username is valid");
        }
        else{
            System.out.println("Invalid username");
        }


        scanner.close();
    }
}
