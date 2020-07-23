package BasicsOfSoftwareCodeDevelopment.Task1;
import java.util.Scanner;
public class MyThirdTask {
    public static void main(String[] args) {
        double x, y;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter x");
        x = num.nextDouble();
        System.out.println("Enter y");
        y = num.nextDouble();
        boolean test = true;
        if (y > 4 || y < (-3) || x > 4 || x < (-4)) {
            test = false;
        }
        if (y > 0 && y <= 4 && x >= (-2) && x <= 2) {
            test = true;
        }
        if (y <= 0 && y >= (-3) && x >= -4 && x <= 4) {
            test = true;
        }
        System.out.println(test);
    }
}

