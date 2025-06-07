

public class Main {
    public static void main(String[] args) {
        String name = "Bro Code";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf('o'); //first occ
        int lastIndex = name.lastIndexOf('o'); //last occ

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("o", "e");
        boolean isNameEmpty = name.isEmpty();

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(isNameEmpty);

        /*
         other methods
         equals
         eqaulsIgnoreCase
         */

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name doesnt contan any space");
        }
    }
}
