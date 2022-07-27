import java.util.Scanner;

public class BiggestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = sc.nextInt();
        System.out.println("Please enter a second number: ");
        int b = sc.nextInt();
        System.out.println("Please enter a third number: ");
        int c = sc.nextInt();
        int tmp = Integer.max(a, b);
        if (tmp < c) tmp = c;
        System.out.println("The biggest value is: " + tmp);
    }
}
