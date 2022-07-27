import java.util.Scanner;

public class ReplaceAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word: ");
        String word = sc.nextLine().toLowerCase();
        String replace = word.replace("a", "b");
        System.out.println(replace);
    }
}
