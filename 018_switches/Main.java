import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String day;
        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch (day) {
            //Enhanced switch (Java 14 feature)
            // case "Monday" -> System.out.println("It is a weekday");
            // case "Tuesday" -> System.out.println("It is a weekday");
            // case "Wednesday" -> System.out.println("It is a weekday");
            // case "Thursday" -> System.out.println("It is a weekday");
            // case "Friday" -> System.out.println("It is a weekday");
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday","Sunday" -> System.out.println("It is a weekend");

            default->System.out.println(day+ " is not a day");
        }
        
        scanner.close();
    }
}
