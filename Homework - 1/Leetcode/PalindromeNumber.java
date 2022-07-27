public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int rem;
        int sum = 0;
        int tmp = x;

        if (x < 0) {
            return false;
        }

        while (x > 0) {
            rem = x % 10;
            sum = sum * 10 + rem;
            x = x / 10;
        }
        if (sum == tmp) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
