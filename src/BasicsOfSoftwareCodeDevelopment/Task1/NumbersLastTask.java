package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class NumbersLastTask {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        String num1,num2;
        System.out.println("Enter two numbers");
num1=num.nextLine();
num2=num.nextLine();

for(int i=0;i< num1.length();i++ ){
    for(int j=0;j<num2.length();j++){
        if(num1.charAt(i)==num2.charAt(j)){
            System.out.println(num1.charAt(i));
        }
    }
}

    }
}
