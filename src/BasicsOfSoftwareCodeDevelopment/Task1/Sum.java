package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter numbers");
        a=num.nextInt();
        for(int i=1;i<=a;i++){
            b=b+i;
        }
        System.out.println("Result " + b);
    }
}
