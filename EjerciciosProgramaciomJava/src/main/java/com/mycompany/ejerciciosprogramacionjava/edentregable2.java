package com.mycompany.ejerciciosprogramacionjava;

import java.util.Scanner;
public class edentregable2
{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("1 Suma");        
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");
        System.out.println("5 Resto");
        System.out.println("6 Exponente");
        System.out.println("7 Seno");
        System.out.println("8 Coseno");
        System.out.println("9 Tangente");
        System.out.println("10 Nada");
         int menu = user.nextInt();
        switch (menu){
        case 1:
             System.out.println("Introduce los numeros a y b");
            double a = user.nextDouble(); 
            double b = user.nextDouble();
            System.out.println("La respuesta es: " +  (a + b) );
            break;
        
        case 2:
            System.out.println("Introduce los numeros a y b");
            double d = user.nextDouble(); 
            double e = user.nextDouble();
            System.out.println("La respuesta es: " + (d - e) );
            break;
        case 3:
            System.out.println("Introduce los numeros a y b");
            double f = user.nextDouble(); 
            double g = user.nextDouble();
            System.out.println("La respuesta es: " + (f * g) );
            break;
        case 4:
            System.out.println("Introduce los numeros a y b");
            double h = user.nextDouble(); 
            double i = user.nextDouble();
            System.out.println("La respuesta es: " + (h / i) );
            break;
        case 5:
            System.out.println("Introduce los numeros a y b");
            double j = user.nextDouble(); 
            double k = user.nextDouble();
            System.out.println("La respuesta es: " + (j % k) );
            break;
        case 6:
            System.out.println("Introduce los numeros a y b");
            double l = user.nextDouble(); 
            double m = user.nextDouble();
            System.out.println("La respuesta es: " + Math.pow(l,m) );
            break;
        case 7:
            System.out.println("Introduce los radianes de a");
            double n = user.nextDouble(); 
           
            System.out.println("La respuesta es: " +  Math.sin(n) );
            break;
            
        case 8:
            System.out.println("Introduce los radianes de a");
            double o = user.nextDouble();
            System.out.println("La respuesta es: " +   Math.cos(o) );
            break;
        case 9:
            System.out.println("Introduce los radianes de a");
            double p = user.nextDouble();
            System.out.println("La respuesta es: " + (Math.sin(p)/  Math.cos(p)) );
            break;
        
        case 10:
            System.out.println("Adios");
            break;
            
        
        }
    }
}