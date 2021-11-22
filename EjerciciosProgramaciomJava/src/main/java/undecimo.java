import java.util.Scanner;
public class undecimo {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    System.out.println("Introduce precios que se sumaran al precio final hasta que pongas un negativo");
    
    double b=0;
    
    while (true) 
    {
        
        double a = user.nextDouble();
        if(a<0)
        {
            break;
        }
        b= b +a;
        System.out.println("El precio final sera: " + b);
    }
    System.out.println("El precio final sera: " + b);
    }
}