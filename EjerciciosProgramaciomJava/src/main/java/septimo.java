import java.util.Scanner;
public class septimo {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    System.out.println("Introduce dos numeros para que se sumen todos los que hayan entre ambos");
    int a = user.nextInt();
    int b = user.nextInt();
    int c=a;
    if (a<b){
        while (a<b) {
            System.out.println(c);
            c= c + (a+1);
            a++;
        }   
    }
    if (a>b) {
        
        while (a>b) {
            System.out.println(c);
            c= c + (a-1);
            a--;
        }   
    }
    System.out.println(c);
    }
}