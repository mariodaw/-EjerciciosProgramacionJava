import java.util.Scanner;
public class decimo {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    System.out.println("Introduce 5 precios que se sumaran al final");
    int i;
    double b=0;
    for (i=0; i<5; i++)
    {
        double a = user.nextDouble();
        b= b +a;
        
    }
    System.out.println("El precio final sera: " + b);
    }
}