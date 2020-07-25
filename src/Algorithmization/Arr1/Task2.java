package Algorithmization.Arr1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr;
        int n=0,z=0,k=0;
        System.out.println("Enter size array");
        n=scanner.nextInt();
        arr=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter z");
        z=scanner.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]>z){
                arr[i]=z;
                k++;
            }
        }
        System.out.print("array is ");
        for (int i=0;i<n;i++){
        System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("zamena :"+k);

    }
}
