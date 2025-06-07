

public class Main {
   public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) {
        if(i == 3) continue; //skips the iteration

        if(i == 8) break; // breaks the flow of loop

        System.out.println(i);
    }

   } 
}
