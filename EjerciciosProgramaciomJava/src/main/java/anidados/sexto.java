package anidados;

import java.util.Scanner;

public class sexto {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Estas son todos los tiempos del dia");
        int j=0;
        int k=0;
        
        for ( int i=0; i<24 ; i++){
            System.out.println(i + ":" + j + ":" + k);
            for (j=0; j<60 ; j++){
                System.out.println(i + ":" + j + ":" + k);
                for (k=0; k<60 ; k++){
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }
}