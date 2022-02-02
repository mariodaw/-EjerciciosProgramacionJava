import java.util.Scanner;
public class duodecimo {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Introduce dos numeros POSITIVOS de los cuales se mostrara una secuencia de los numeros que haya entre ellos ");
        double a = user.nextDouble(); 
        double b = user.nextDouble();
        double c = a;
        
        
        for ( int i=0; i<b ; i++)
            {
                System.out.println("No valen negativos");
                if (a<0 || b<0){
                break;
            }
                System.out.println(c);
                a++;
                c= a;
                
                
            }
    }
}