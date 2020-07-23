package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class MySecondTask {

    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
         double a,b,c,r;

        System.out.println("Enter a");
        a=num.nextFloat();
        //Если вводишь значение а = 0, то программа выдает Infinity
        //Если вводишь занчение а = -100, b=2 c = 3, программа выдает NaN
        System.out.println("Enter b");
        b=num.nextFloat();
        System.out.println("Enter c");
        c=num.nextFloat();
        r=((b+Math.sqrt(Math.pow(b,2)+(4*a*c)))/(2*a))-(Math.pow(a,3)*c)+Math.pow(b,-2);
        System.out.println("Your result is :"+ r);
    }
}
