import java.util.Scanner;
public class tercero {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Escriba desde que numero a que numero quiere que cuente");
        int a = user.nextInt();
        int b = user.nextInt();
        while (a<b)
        {
            
            System.out.println(a);
            a++;
            a++;
           
            
        }
    }
}
