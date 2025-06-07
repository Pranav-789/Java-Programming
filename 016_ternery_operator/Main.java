

public class Main {
    public static void main(String[] args) {
        //ternary operator '?' -> return 1 or 2 values if a condition is true

        // variable = condition ? ifTrue : ifFalse;
        int score = 70;

        String passOrFail =(score >= 60)? "pass": "fail";
        System.out.println(passOrFail);
    }
}
