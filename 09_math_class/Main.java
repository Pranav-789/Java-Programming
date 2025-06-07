
public class Main {
    public static void main(String[] args) {
         System.out.println(Math.PI);
         System.out.println(Math.E);

         double result;

        result = Math.pow(2, 3);//8.0
        result = Math.abs(-5);//5.0
        result = Math.sqrt(9);//3.0
        result = Math.round(3.14);//3.0 becuz of double
        result = Math.ceil(3.14);//4.0 
        result = Math.floor(3.999);//3.0 
        result = Math.max(10, 20);//20.0
        result = Math.min(10, 20);//10.0

        double l1 = 4;
        double l2 = 3;
        double hypotenue = Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));

        int radius = 7;
        double circumference = Math.PI*radius*2;
        double area = Math.pow(radius, 2)* Math.PI;
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println(result);
        System.out.println("Hypotenuse: " + hypotenue);
        System.out.println("circumference: " + circumference);
        System.out.println("area: " + area);
        System.out.println("volume: " + volume);

    }  
}
