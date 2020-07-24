package BasicsOfSoftwareCodeDevelopment.Task1;
import  java.util.Scanner;
public class SumIn2 {
    public static void main(String[] args){
        double a=0,b=0;
        Scanner num=new Scanner(System.in);
        for(int i=0;i<=100;i++){
            a=Math.pow(i,2);
            b+=a;
        }
        System.out.println(b);
    }
}
