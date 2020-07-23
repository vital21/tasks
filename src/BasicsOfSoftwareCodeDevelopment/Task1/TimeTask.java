package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class TimeTask {
    public static void main(String[] args){
        int h=0,m=0,s=0,ss=0;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter seconds ");
        ss=num.nextInt();
        if(ss!=0){
            h=ss/3600;
            m=(ss-h*3600)/60;
            s=(ss-h*3600-m*60);
        }


        System.out.println("Time is :"+h +" : "+m+" : "+s);
    }
}
