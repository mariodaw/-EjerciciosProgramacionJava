package anidados;

import java.util.Scanner;

public class octavo {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Estas son todos los tiempos del dia");
        int j=0;
        
        // Para cada mes (de 1 a 12)
        for ( int i=1; i<13 ; i++){
            
            //System.out.println(j + ":" + i);
            switch (i){
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                // Para cada dia j del mes i
                for (j=1; j<32 ; j++){
                
                    System.out.println(j + ":" + i);
                }
                        break;
                    case 2:
                        // Para cada dia j del mes i
                for (j=1; j<29 ; j++){
                    System.out.println(j + ":" + i);
                }
                break;
                case 4:case 6:case 9:case 11:
                    // Para cada dia j del mes i
                for (j=1; j<31 ; j++){
                    System.out.println(j + ":" + i);
                }
                break;  
            }
        }
    }
}