import java.util.Scanner;

public class RotateVars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for variable a: ");
        int a = sc.nextInt();
        System.out.println("Please enter number for variable b: ");
        int b = sc.nextInt();
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("New value of a: " + a);
        System.out.println("New value of b: " + b);
    }
}
