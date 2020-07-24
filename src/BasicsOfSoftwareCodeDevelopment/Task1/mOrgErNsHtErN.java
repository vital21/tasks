package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class mOrgErNsHtErN {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int n=0,m=0,c=0;
        System.out.println("Enter distance from m to n ");
        m=num.nextInt();
        n=num.nextInt();
        if(n-m==0 || n-m < 2){return;}
        if(m==0){
            m++;
        }
        for(int i=m;i<=n;i++){
            for(int j=m;j<=n;j++){
                if(i==j || j==1){continue;}
                if(i%j==0){
                    System.out.println("from numbers "+i +"  is "+j);
                }


            }

            }
        }
    }

