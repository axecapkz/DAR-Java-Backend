import java.util.Scanner;

public class TotalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();
        int add = TotalSum.add(a, b);
        int mul = TotalSum.mul(a, b);
        int sub = TotalSum.sub(a, b);
        int div = TotalSum.div(a, b);
        int rem = TotalSum.rem(a, b);
        System.out.println("Sum of addition: " + add);
        System.out.println("Sum of multiply: " + mul);
        System.out.println("Sum of subtract: " + sub);
        System.out.println("Sum of divide: " + div);
        System.out.println("Remainder of division: " + rem);
    }
    public static int add(int a, int b) {
        int add = a + b;
        return add;
    }

    public static int mul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int div(int a, int b) {
        int div = a / b;
        return div;
    }

    public static int rem(int a, int b) {
        int rem = a % b;
        return rem;
    }
}
