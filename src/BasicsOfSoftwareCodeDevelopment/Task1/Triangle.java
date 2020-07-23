package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter first angle ");
        a=num.nextFloat();
        System.out.println("Enter second angle ");
        b=num.nextFloat();
        if((a+b)>=180){
            System.out.println("Triangle is does not exists");
        }
            else {
            System.out.println("Triangle exists");
                c=180-(a+b);
            System.out.println("Third angle is" + c);
                if(a==90 || b==90 || c==90){
                    System.out.println("this is a right triangle");
                }
        }
    }

}
