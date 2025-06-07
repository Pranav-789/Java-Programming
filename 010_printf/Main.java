
public class Main {
    public static void main(String[] args) {
        //printf is method to format the output

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployeed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("You name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employeed: %b\n", isEmployeed);

        double price1 = 100.153453;
        System.out.printf("%.1f", price1);
    }
}
