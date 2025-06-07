public class Variables{
    public static void main(String[] args){
        // int age = 19;
        int year = 2025;
        System.out.print("The year is "+ year+"\n");

        double price = 19.99;
        // double gpa = 8.85;

        System.out.println("$"+price);

        char grade = 'A';
        System.out.println("Grade: " + grade);

        boolean isStudent = true;
        // boolean forSale = true;
        // boolean isOnline = true;

        // System.out.println("The child on left is student: " + isStudent);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        String name = "Pranav";
        System.out.println("Hello "+ name);
    }
}