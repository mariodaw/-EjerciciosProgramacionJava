import java.util.Scanner;
public class CUARTO
{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Escriba desde que numero a que numeor quiere que cuente");
        int a = user.nextInt();
        int b = user.nextInt();
        while (a!=b) {
            if (a<b) {
            System.out.println(a);
            a++;
            }
            else {
                System.out.println(a);
            a--;    
                    }
            
            }     
        System.out.println(a);
    }
}
