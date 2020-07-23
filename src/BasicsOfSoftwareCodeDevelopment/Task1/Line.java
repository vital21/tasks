package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class Line {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        float x1=0,x2=0,x3=0,y1=0,y2=0,y3=0,s=0;
        System.out.println("Please enter coordinates ");
        System.out.println("enter first point x1 and y1");
        x1=num.nextFloat();
        y1=num.nextFloat();
        System.out.println("enter second point x2 and y2");
        x2=num.nextFloat();
        y2=num.nextFloat();
        System.out.println("enter third point x3 and y3");
        x3=num.nextFloat();
        y3=num.nextFloat();
        s=(0.5f)*((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3));
        if(s==0){
            System.out.println("it is line");
        }
        else {
            System.out.println("it is not line");
        }
    }
}
