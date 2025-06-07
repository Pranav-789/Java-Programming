public class Main {
    public static void main(String[] args) {

        // String name = "Bro";
        // int age = 25;

        // for (int i = 0; i < 3; i++) {
        //     happyBirthday(name, age);
        // }
        System.out.println(square(3));
        System.out.println(square(4));
        
    }
    
    // static void happyBirthday(String name, int age){
    //     System.out.println("Happy Birthday to you " + name);   
    //     System.out.println("Happy Birthday for your "+ age + "th year!");   
    // } // since function is called within a static method, it is required to be static

    static double square(double n){
        return n*n;
    }
}
