import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    scanner.nextLine();

    String name;
    System.out.print("Enter your name: ");
    name = scanner.nextLine();

    System.out.println("Are you a student? (true/false)");
    boolean isStudent = scanner.nextBoolean();

    //Group 1

    if(name.isEmpty()){
        System.out.println("You didnt enter your name!");
    }
    else{
        System.out.println("Hello " + name);
    }

    //Group 2

    if(age >= 65){
        System.out.println("ou are a senior citizen!");
    }
    else if(age >= 18){
        System.out.println("Hurray! you can drive now.");
    }
    else if(age < 0){
        System.out.println("Invalid age!");
    }
    else if(age == 0){
        System.out.println("You are a baby");
    }
    else{
        System.out.println("You are not able to drive now.");
    }

    //Group 3

    if(isStudent){
        System.out.println("You are a student");
    }
    else{
        System.out.println("You are not a student");
    }

    scanner.close();
   } 
}
