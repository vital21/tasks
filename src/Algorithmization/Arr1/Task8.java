package Algorithmization.Arr1;
import java.util.Scanner;
import java.util.Random;
public class Task8 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
int[] arr;
int size=0,min=0,max=0;
Random random=new Random();
size=random.nextInt(17)+3;
        System.out.println("Size of array is :"+ size);
arr=new int[size];
for(int i=0;i<size;i++){
    arr[i]=random.nextInt(10);
}
        System.out.print("Array is : ");
for (int i=0;i<size;i++){
    System.out.print(arr[i]);
}
        System.out.println();
for (int i=0;i<size;i++){
    if(arr[i]>max){
        max=arr[i];
    }
    min=max;
}
for (int i=0;i<size;i++){
    if(arr[i]<min){
        min=arr[i];
    }
}
        System.out.println("Min is :"+min);
        System.out.print("Answer is :");
for (int i=0;i<size;i++){
    if(arr[i]==min){
       i=i+1;
    }

    if(arr[i]==min){
      i=i+1;
  }
    System.out.print(arr[i]);
}
        System.out.println();

    }

}
