package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class Row {
    public static void main(String[] args){
        Scanner num= new Scanner(System.in);
            double e=0,b=1,c=1,d=0;
        System.out.println("Enter e from 0 to 1");
        e=num.nextDouble();
        if(e==0){
            System.out.println("No answer because e == 0");
        }
        while(b!=0){
            b=1/(Math.pow(2,c))+1/(Math.pow(3,c));
            System.out.println("answer is "+b);
            System.out.println("c is : "+c);
            c++;
            if(b>=e){
                d=d+b;
            }

        }
        System.out.println("Answer is "+d);
    }
}
