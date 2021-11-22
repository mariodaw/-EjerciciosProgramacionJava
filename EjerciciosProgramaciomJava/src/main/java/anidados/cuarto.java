package anidados;

import java.util.Scanner;

public class cuarto {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Introduce hasta que numero quieres que te diga su tabal de multiplicaciones");
        int n = user.nextInt();
        int m=0;
        int total=0;
        
        for ( int i=0; i<n+1 ; i++){
            System.out.println("Tabla de multiplicación del " + i + ":");
            for ( int j=1; j<11 ; j++){
                System.out.println(i + " x " + j + " = " + (m= i*j));
                total += m;
            }
            System.out.println("El total de la suma de los productos es: " + total);
            System.out.println("");
            total=0;
        }
    }
}