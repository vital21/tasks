package Algorithmization.Arr1;
import java.util.Random;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        int[] arr;
        int n=0,k=0;
        Random random=new Random();
        n= random.nextInt(10);
        arr=new int[n];
        System.out.print("Array is :");
        for(int i=0;i<n; i++){
            arr[i]=random.nextInt(10);
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i=0;i<n;i++){
            if(arr[i]>i){
                System.out.println(arr[i]+" : index is"+i);
            }
        }

    }

}
