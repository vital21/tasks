package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class Char {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char c;
        for(int i=32;i<177;i++ ){

            System.out.println((char)i+"   number :"+i);
        }
    }
}
