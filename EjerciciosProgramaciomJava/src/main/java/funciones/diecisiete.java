/*
 * Proyecto funciones - Archivo diecisiete.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package funciones;

/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 * @version 1.0
 * @date 17 nov. 2021 21:22:11
 */
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
/*Realiza   un   programa   que   nos   pida   números   enteros   hasta   que   se   introduzca   el   0,
diciéndonos, para  cada número  introducido si es primo  o no. Hay que recordar que un
número es primo si es divisible por si mismo y por 1. El 1 no es primo por convenio. Se
debe crear una función que pasándole un número entero devuelva si es primo o no.
 */
import java.util.Scanner;

public class diecisiete {

    public static boolean calculaprimo(int x) {
        boolean res;
        int t = 0;
        int f = 0;
        int resto = 0;
        for (int i = 1; i <= x; i++) {
            resto = x % i;
            if (resto == 0) {
                t++;
            } else {
                f++;
            }
        }
        if (t == 2) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int x = 2;
        System.out.println("Escribe numeros y te dire si es primo o no, al introducir un 0 se acabará el programa");
        do {
            x = user.nextInt();
            boolean ans = calculaprimo(x);
            if (ans == true) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }

        } while (x != 0);
    }
}
