package Algorithmization.Arr1;
import com.sun.javaws.IconUtil;

import java.util.Random;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int[] arr;
        int size=0,k=0,kolovo=0,element=0,NextKolovo=0,NextELement=0;
        size=random.nextInt(17)+3;
        arr=new int[size];
        System.out.println("Size is :"+size);
        for(int i=0;i<size;i++){
            arr[i]=random.nextInt(8)+1;
        }
        System.out.print("Array is :");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    while(k<10){
        for(int i=0;i<size;i++){
            if(arr[i]==k){
                kolovo++;
                element=arr[i];
            }
            if(size-1==i && NextKolovo<kolovo){
                NextKolovo=kolovo;
                NextELement=element;
            }
            if(NextKolovo==kolovo && NextELement>element ){

                    NextELement=element;

                }

        }
        kolovo=0;
        element=0;
        k++;
    }
        System.out.println();
        System.out.println("Amount : "+NextKolovo+"  Element : "+NextELement);




        }

}
