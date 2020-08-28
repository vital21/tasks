package Algorithmization.Arr1;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int[] arr;
        int size=0, k=0;
        size=random.nextInt(17)+1;
        System.out.println("Size is : "+size);
        arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=random.nextInt(8)+1;
        }
        System.out.print("Array is : ");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<size;i=i+2){
            arr[i]=0;
        }
        System.out.println();
        System.out.print("new Array :");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        while(k<size/2){
            for (int i = 0; i < size - 1; i++) {
                if (arr[i]==0) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = 0;
                }
            }
            k++;
        }
        System.out.println();
        System.out.print("Answer is : ");
   for(int i=0;i< size;i++){
    System.out.print(arr[i]);
       System.out.println("Виталик пидарас!!! ХАХАХАХ");
     }
    }
}
