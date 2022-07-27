public class ChangeLetter {
    public static char[] change(String s) {
        char [] words = new char[Integer.parseInt(s)];
        for (int i = 0; i < s.length(); i++) {
            words[i] = s.charAt(i);
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(change("12345"));
    }
}
