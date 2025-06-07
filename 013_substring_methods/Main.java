

public class Main {
    public static void main(String[] args) {
        String email = "one124@gmail.com";

        if(email.contains("@")){
            System.out.println("Email is valid!");
            String username = email.substring(0, email.indexOf('@'));
            String domain = email.substring(email.indexOf('@')+1);
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Email must contain @");
        }
    }
}
