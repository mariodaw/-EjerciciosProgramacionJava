package anidados;

import java.util.Scanner;

public class undecimo {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Escribe el número de niveles que tendra tu medio triangulo");
        int a = user.nextInt();
        int j=0;
        int k=0;
        //saltos de linea i
        for ( int i=0; i<=a ; i++){
            //espacios en blanco j
            
            for (j=a; j>k; j--){
                System.out.print(" ");
            }
            
            //asteriscos k
            for (k=1; k<i; k++){
                System.out.print("*");
            }
             System.out.println("");
        }
       
    }
}