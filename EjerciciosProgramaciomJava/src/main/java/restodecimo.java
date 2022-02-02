import java.util.Scanner;
public class restodecimo {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Introduce 5 numeros");
        int b=0 ;
        int c=0 ;
        int d=0 ;
        int e=0 ;
        for ( int i=0; i<5 ; i++){
            double a = user.nextDouble(); 

            if (a%10 == 0){
                b++;
            }
            if (a<0){
                c++;
            }
            if (a>99){
                d++;
            }
            if (a>0){
                e++;
            }

        }
        System.out.println("Hay " + b +" que son multiplos de 10, " + c + " negativos, " + d + " mayores que 99 y " + e + " que son positivos" );    
    }
}