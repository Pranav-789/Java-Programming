import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scanner.nextLine();//read whitespaces
        // String name = scanner.next();//does notread whitespaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();
         
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age + " years old");
        System.out.println("Your cgpa is "+ cgpa);

        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");
        }

        //Common problem
        System.out.println("Enter your age: ");
        int ageII = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter your favourite color: ");
        String color = scanner.nextLine(); //because of new line buffer of above this is triggerd for \n when enter is pressed after enting age so color = \n

        System.out.println("Your age is " + ageII);
        System.out.println("Your fav color is " + color);


        scanner.close();
    }
}