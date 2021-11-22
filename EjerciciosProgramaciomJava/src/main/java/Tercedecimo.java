import java.util.Scanner;
public class Tercedecimo {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Introduce dos numeros de los cuales se mostrara una secuencia de los numeros pares que haya entre ellos ");
        double a = user.nextDouble(); 
        double b = user.nextDouble();
        double c = a;
        
        
        for ( int i=0; i<b ; i++)
            {
                
                a++;
                c= a;
                if (c%2 !=0){
                    continue;
                }
                if (c>b){
                    break;
                }
                System.out.println(c);
                
            }
    }
}