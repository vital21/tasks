package Algorithmization.Arr1;
import java.util.Scanner;
import java.util.Random;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int[] arr;
        int n=0,k=0;
        n=random.nextInt(10);
        arr=new int[n];
        System.out.println("Size array is : "+n);
        System.out.print("Array is :");
        for (int i=0;i<n;i++){
            arr[i]=random.nextInt(10);
            System.out.print(arr[i]+":");
        }

        for (int i=0;i<n;i++){
            if(i==0){
                continue;
            }
            if(i%2!=0 || i==2){

                k=k+arr[i];
            }

        }
        System.out.println();
        System.out.println("Answer is : "+k);
    }
}
