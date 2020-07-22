package com.company;
import java.util.Scanner;
public class MyFirstTask {


        public static void main(String[] args) {
            System.out.println("Plize enter namber for c and b and a");
            Scanner num=new Scanner(System.in) ;
            int z,a,b,c;

            System.out.println("Enter a");
            a=num.nextInt();
            System.out.println("Enter b");
            b=num.nextInt();
            System.out.println("Enter c");
            c=num.nextInt();
            z=((a-3)*b/2)+c;//тут происходит деление, а ответ получается целым, нужно исправить!
            System.out.println("rezults is:"+z);
        }

    }

