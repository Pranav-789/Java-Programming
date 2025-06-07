import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double number1;
        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();
        scanner.nextLine();// to remove input buffer

        char operation;
        System.out.print("Enter an operation:  ");
        operation = scanner.next().charAt(0);

        double number2;
        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if(number2 == 0){
                    System.out.println("cannot divide by zero");
                    validOperation = false;
                }
                else{
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default-> validOperation = false;
        }

        if(validOperation){
            System.out.println("The result is: " + result);
        }
        else{
            System.out.println("The operation is invalid");
        }

        

        scanner.close();
    }
}