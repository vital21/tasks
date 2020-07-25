package Algorithmization.Arr1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr;
        int n,k=0,l=0;
        System.out.println("Enter n ");
        n=scanner.nextInt();
        arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i =0;i<n;i++){
          if(k<arr[i]){
              k=arr[i];
          }

           }
        l=k;
        for(int i =0;i<n;i++){
            if(l>arr[i]){
                l=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            if(arr[i]==k){
                arr[i]=l;
            }
            else if(arr[i]==l){
                arr[i]=k;
            }
            System.out.println(arr[i]);
        }
        System.out.println(k+" : "+l);
            }

        }



