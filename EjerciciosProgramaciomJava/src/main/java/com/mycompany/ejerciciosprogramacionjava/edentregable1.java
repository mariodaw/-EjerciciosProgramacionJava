package com.mycompany.ejerciciosprogramacionjava;

import java.util.Scanner;
public class edentregable1
{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        double riesgo = 5;
        double riesgof;
        int factores= 0;

        System.out.println("Introduce 0 para decir que no y 1 para decir que si:");
        System.out.println("Usted padece de Presión arterial alta?");
        int respuesta0 = user.nextInt();
        if (respuesta0==1){
            riesgo= riesgo + 15;
            factores++;
        }
        System.out.println("Usted padece de Colesterol elevado?");
        int respuesta1 = user.nextInt();
        if (respuesta1==1){
            riesgo= riesgo + 15;
            factores++;
        }
        System.out.println("Usted padece de diabetes?");
        int respuesta2 = user.nextInt();
        if (respuesta2==1){
            riesgo= riesgo + 10;
            factores++;
        }
        System.out.println("Usted padece de obesidad?");
        int respuesta3 = user.nextInt();
        if (respuesta3==1){
            riesgo= riesgo + 10;
            factores++;
        }
        System.out.println("Usted padece de tabaquismo?");
        int respuesta4 = user.nextInt();
        if (respuesta4==1){
            riesgo= riesgo + 10;
            factores++;
        }
        System.out.println("Usted padece de inactividad fisica?");
        int respuesta5 = user.nextInt();
        if (respuesta5==1){
            riesgo= riesgo + 10;
            factores++;
        }
        System.out.println("Su sexo es masculino?");
        int respuesta6 = user.nextInt();
        if (respuesta6==1){
            riesgo= riesgo + 5;
            factores++;
        }
        System.out.println("Tiene familiares con enfermedades al corazon?");
        int respuesta7 = user.nextInt();
        if (respuesta7==1){
            riesgo= riesgo + 5;
            factores++;
        }
        System.out.println("Usted tiene mas de 55 años?");
        int respuesta8 = user.nextInt();
        if (respuesta8==1){
            riesgo= riesgo + 5;
            factores++;
        }
        switch (factores) {
            case 2:
                riesgof= riesgo * 1.25;
                System.out.println("Tiene de riesgo inicial de " + riesgo + ", tiene 1.25 de efecto multiplicador y tiene de riesgo final de " + riesgof );
                break;
            case 3: case 4:
                riesgof= riesgo * 1.5;
                System.out.println("Tiene de riesgo inicial de " + riesgo + ", tiene 1.5 de efecto multiplicador y tiene de riesgo final de " + riesgof );
            case 5: case 6:
                riesgof= riesgo * 1.75;
                System.out.println("Tiene de riesgo inicial de " + riesgo + ", tiene 1.75 de efecto multiplicador y tiene de riesgo final de " + riesgof );
                break;
            case 7: case 8:
                riesgof= riesgo * 2;
                System.out.println("Tiene de riesgo inicial de " + riesgo + ", tiene 2 de efecto multiplicador y tiene de riesgo final de " + riesgof );
                break;
            case 9:
                riesgof= riesgo * 2.5;
                System.out.println("Tiene de riesgo inicial de " + riesgo + ", tiene 2.5 de efecto multiplicador y tiene de riesgo final de " + riesgof );
                break;
            default:
                riesgof= riesgo * 1;
                System.out.println("Tiene de riesgo inicial de " + riesgo + ", tiene 1 de efecto multiplicador y tiene de riesgo final de " + riesgof );
}
            
            
    }
    
}
