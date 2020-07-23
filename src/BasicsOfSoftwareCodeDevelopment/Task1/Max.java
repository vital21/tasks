package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class Max {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        float a=0,b=0,c=0,d=0,min1=0,min2=0,max=0;
        System.out.println("Enter numbers");
        System.out.println("Enter a and b");
        a=num.nextFloat();
        b=num.nextFloat();
        System.out.println("Enter c and d");
        c=num.nextFloat();
        d=num.nextFloat();
        if(a>b){
            min1=b;
        }
        if(a<b){
            min1=a;
        }
        if(a==b){min1=b;}
        if(c>d){
            min2=d;
        }
        if(c==d){
            min2=c;
        }
        if(c<d){
            min2=c;
        }
        if(min2>min1){
            System.out.println(min2);
        }
        if(min2<min1){
            System.out.println(min1);
        }
        if (min1==min2){
            System.out.println(min1);
        }

    }
}
