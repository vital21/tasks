package BasicsOfSoftwareCodeDevelopment.Task1;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class FunctionYY {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        float a=0,b=0,h=0,m=0,x=0,y=0;
        System.out.println("Enter distance [a,b]");
        a=num.nextFloat();
        b=num.nextFloat();
        System.out.println("Enter step");
        h=num.nextFloat();
        if(h==0){
            System.out.println("Error");
            return;//если шаг == 0 ;
        }
        if(a==b){
            System.out.println("no distance");
            return;// если промежуток == 0;
        }
        if(b-a>0){
            if(b-a<h){//если шаг больше чем сам промежуток;
                return;
            }
        }
        if(a-b>0){
            if(a-b<h){//если шаг больше чем сам промежуток;
                return;
            }
        }
        while(a<=b){
            System.out.println("Enter x");
            x=num.nextFloat();
            if(x>2){
                y=x;
                a+=h;
                System.out.println("x and y :" + x +" : "+y );
            }
            if(x<=2){
                if(x>0){
                y=0-x ;
                }
                if(x<0){
                 y=x-(2*x);
                }
                if(x==0){
                    y=0;
                }
                a+=h;
                System.out.println("x and y :" + x +" : "+y );

            }
        }


    }
}
