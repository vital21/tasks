package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class Function {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        double x=0,k=0;
        System.out.println("Enter x");
        x=num.nextFloat();
        if(x<=3){
            k=Math.pow(x,2)-3*x+9;
        }
        if(x>3){
            k=1/(Math.pow(x,3)+6);
        }
        System.out.println(k);
    }
}
