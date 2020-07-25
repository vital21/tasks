package Algorithmization.Arr1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr;
        int n=0,pow=0,otr=0,nul=0;
        System.out.println("Enter size array");
        n=scanner.nextInt();
        arr=new int[n];
        System.out.println("Enter array");
        for(int i=0;i< n; i++){
            arr[i]=scanner.nextInt();
        }
        for(int i =0; i < n;i++){
            if(arr[i]>0){
                pow++;
            }
            if (arr[i]<0){
                otr++;
            }
            if(arr[i]==0){
                nul++;
            }
            }
        System.out.println("- is :"+otr);
        System.out.println("+ is :"+pow);
        System.out.println("0 is :"+nul);
        }

    }

