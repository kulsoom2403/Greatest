//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        System.out.println("Enter tree number : ");
        int a=se.nextInt();
        int b=se.nextInt();
        int c=se.nextInt();

        if(a>b && a>c)
        {
            System.out.println("A is greatest"+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("B is greatest"+b);
        }
        else {
            System.out.println("C is greatest "+c);
        }
    }
}