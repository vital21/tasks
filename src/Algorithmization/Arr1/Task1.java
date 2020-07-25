package Algorithmization.Arr1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=0,k=0,sum=1;
        int[] arr;
        System.out.println("enter k");
        k=scanner.nextInt();
        System.out.println("Enter n");
        n=scanner.nextInt();
        arr=new int[n];

       for (int i=0;i<n;i++){
           arr[i]=scanner.nextInt();
       }
        for (int i=0; i < n ;i++) {
            if(arr[i]==0){continue;}
            if(k%arr[i]==0){
                System.out.println(sum+"  "+arr[i]);
              sum=sum * arr[i];

            }
        }
        if(sum==1){
            System.out.println("no Numbers");
        }
        else
        System.out.println("Answer is : "+sum);
    }
}
