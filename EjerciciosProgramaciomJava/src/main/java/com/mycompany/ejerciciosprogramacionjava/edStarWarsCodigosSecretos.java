package com.mycompany.ejerciciosprogramacionjava;

import java.util.Scanner;

public class edStarWarsCodigosSecretos {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int lv = 0;
        //incio
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
                + "Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa\n"
                + "Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan\n"
                + "en una nave imperial robada en una misión secreta para infiltrarse\n"
                + "en otra estrella de la muerte que el imperio está construyendo\n"
                + "para destruirla. (Presiona Intro para continuar)");
        user.nextLine();
        lv = 1;
        while (lv <= 8) {

            switch (lv) {
                case 1:
                    //Nivel1
                    int S1,
                     S2;
                    int sum = 0;
                    int r1 = 0;
                    System.out.println("Los problemas empiezan cuando deben realizar un salto\n"
                            + "hiperespacial hasta el sistema estelar S1 en el sector S2, pero el\n"
                            + "control de navegación está estropeado y el computador tiene\n"
                            + "problemas para calcular parte de las coordenadas de salto.\n"
                            + "Chewbacca, piloto experto, se da cuenta que falta el cuarto\n"
                            + "número de la serie. Recuerda de sus tiempos en la academia de\n"
                            + "pilotos que para calcularlo hay que calcular el sumatorio entre el\n"
                            + "nº del sistema y el nº del sector (ambos inclusive). ¿Qué debe\n"
                            + "introducir?");
                    // Ejemplo de scaner int x = user.nextInt();
                    //( int ) ( Math.random( ) * (valorFinal-valorInicial+1) + valorInicial)
                    System.out.println(S1 = (int) (1.0 + Math.random() * (10 - 2)));
                    System.out.println(S2 = (int) (20.0 + Math.random() * (30 - 21)));
                    for (int i = S1; i <= S2; i++) {

                        sum += i;
                    }
                    r1 = user.nextInt();
                    if (r1 == sum) {
                        System.out.println("Correcto!!");
                        lv = 2;
                    } else {
                        System.out.println("Incorrecto");
                        lv = 7;
                    }

                    break;

                case 2:
                    //Nivel2
                    int P1,
                     P2;
                    int mult = 1;
                    int r2 = 0;
                    System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n"
                            + "lo lejos la estrella de la muerte. Como van en una nave imperial\n"
                            + "robada se aproximan lentamente con la intención de pasar\n"
                            + "desapercibidos. De repente suena el comunicador. “Aquí agente\n"
                            + "de espaciopuerto P1 contactando con nave imperial P2. No están\n"
                            + "destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el\n"
                            + "comunicador e improvisa. “Eh... tenemos un fallo en el... eh...\n"
                            + "condensador de fluzo... Solicitamos permiso para atracar y\n"
                            + "reparar la nave”. El agente, que no se anda con tonterías,\n"
                            + "responde “Proporcione código de acceso o abriremos fuego”. Han\n"
                            + "Solo ojea rápidamente el manual del piloto que estaba en la\n"
                            + "guantera y da con la página correcta. El código es el productorio\n"
                            + "entre el nº del agente y el nº de la nave (ambos inclusive).\n"
                            + "¿Cuál es el código?");
                    // Ejemplo de scaner int x = user.nextInt();
                    //( int ) ( Math.random( ) * (valorFinal-valorInicial+1) + valorInicial)
                    System.out.println(P1 = (int) (1.0 + Math.random() * (7 - 2)));
                    System.out.println(P2 = (int) (8.0 + Math.random() * (12 - 9)));
                    for (int i = P1; i <= P2; i++) {
                        mult *= i;
                    }
                    r2 = user.nextInt();
                    if (r2 == mult) {
                        System.out.println("Correcto!!");
                        lv = 3;
                    } else {
                        System.out.println("Incorrecto");
                        lv = 7;
                    }

                    break;

                case 3:
                    //Nivel2
                    int N = 0;
                    int fact3 = 1;
                    int r3 = 0;

                    System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de\n"
                            + "la muerte, se equipan con trajes de soldados imperiales que\n"
                            + "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n"
                            + "deben averiguar en qué nivel de los N existentes se encuentra el\n"
                            + "reactor principal. Se dirigen al primer panel computerizado que\n"
                            + "encuentran y la Princesa Leia intenta acceder a los planos de la\n"
                            + "nave pero necesita introducir una clave de acceso. Entonces\n"
                            + "recuerda la información que le proporcionó Lando Calrissian “La\n"
                            + "clave de acceso a los planos de la nave es el factorial de N/10\n"
                            + "(redondeando N hacia abajo), donde N es el nº de niveles”.\n"
                            + "¿Cual es el nivel correcto?");

                    // Ejemplo de scaner int x = user.nextInt();
                    //( int ) ( Math.random( ) * (valorFinal-valorInicial+1) + valorInicial)
                    N = (int) (50.0 + Math.random() * (100 - 51));
                    System.out.println(Math.ceil(N / 10));
                    N = N / 10;
                    for (int i = 1; i <= N; i++) {
                        fact3 *= i;
                    }
                    r3 = user.nextInt();
                    if (r3 == fact3) {
                        System.out.println("Correcto!!");
                        lv = 4;
                    } else {
                        System.out.println("Incorrecto");
                        lv = 7;
                    }

                    break;

                case 4:
                    //Nivel2
                    int P = 0;
                    int primo = 0;
                    int nice = 0;
                    int bad = 0;
                    int r4 = 0;

                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y\n"
                            + "encuentran la puerta acorazada que da al reactor principal. R2D2\n"
                            + "se conecta al panel de acceso para intentar hackear el sistema y\n"
                            + "abrir la puerta. Para desencriptar la clave necesita verificar si el\n"
                            + "número P es primo o no. Si es primo introduce un 1, si no lo es\n"
                            + "introduce un 0.");

                    // Ejemplo de scaner int x = user.nextInt();
                    //( int ) ( Math.random( ) * (valorFinal-valorInicial+1) + valorInicial)
                    System.out.println(P = (int) (10 + Math.random() * (100 - 11)));
                    for (int i = 1; i <= P; i++) {

                        if (P % i == 0) {
                            nice++;
                        } else {
                            bad++;
                        }
                    }
                    if (nice == 2) {
                        primo = 1;
                    } else {
                        primo = 0;
                    }
                    r4 = user.nextInt();
                    if (r4 == primo) {
                        System.out.println("Correcto!!");
                        lv = 5;
                    } else {
                        System.out.println("Incorrecto");
                        lv = 7;
                    }

                    break;

                case 5:
                    //Nivel2
                    int M = 0;
                    int S = 0;
                    int fact5 = 1;
                    int Fact5 = 1;
                    int r5 = 0;

                    System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n"
                            + "coloque la bomba, programe el temporizador y salir de allí\n"
                            + "corriendo. Necesita programarlo para que explote en exactamente\n"
                            + "M minutos y S segundos, el tiempo suficiente para escapar antes\n"
                            + "de que explote pero sin que el sistema de seguridad anti-\n"
                            + "explosivos detecte y desactive la bomba. Pero el temporizador\n"
                            + "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n"
                            + "minutos y segundos al sistema Zordgiano hay que sumar el\n"
                            + "factorial de M y el factorial de S. ¿Qué valor debe introducir?");

                    // Ejemplo de scaner int x = user.nextInt();
                    //( int ) ( Math.random( ) * (valorFinal-valorInicial+1) + valorInicial)
                    System.out.println(M = (int) (5.0 + Math.random() * (10 - 5)));
                    System.out.println(S = (int) (5.0 + Math.random() * (10 - 5)));

                    for (int i = 1; i <= M; i++) {
                        fact5 *= i;
                    }

                    for (int i = 1; i <= S; i++) {
                        Fact5 *= i;
                    }
                    fact5 += Fact5;
                    r5 = user.nextInt();
                    if (r5 == fact5) {
                        System.out.println("Correcto!!");
                        lv = 6;
                    } else {
                        System.out.println("Incorrecto");
                        lv = 7;
                    }

                    break;

                case 6:

                    System.out.println("Luke Skywalker introduce el tiempo correcto, activa el\n"
                            + "temporizador y empiezan a sonar las alarmas. Salen de allí\n"
                            + "corriendo, no hay tiempo que perder. La nave se convierte en un\n"
                            + "hervidero de soldados de arriba a abajo y entre el caos que les\n"
                            + "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n"
                            + "medida que se alejan observan por la ventana la imagen de la\n"
                            + "colosal estrella de la muerte explotando en el silencio del espacio,\n"
                            + "desapareciendo para siempre junto a los restos del malvado\n"
                            + "imperio.\n"
                            + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n"
                            + "Enhorabuena ;D");
                    lv = 8;

                    break;

                case 7:

                    System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
                            + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n"
                            + "intentarlo!");
                    lv = 8;

                    break;

                case 8:

                    System.out.println("Gracias por jugar :D");
                    lv = 9;
                    break;

            }
        }
    }

}
