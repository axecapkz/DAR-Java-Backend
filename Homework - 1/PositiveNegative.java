import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = sc.nextInt();
        if (a >= 0) System.out.println("You have entered a positive number: " + a);
        if (a < 0) System.out.println("You have entered a negative number: " + a);
    }
}
