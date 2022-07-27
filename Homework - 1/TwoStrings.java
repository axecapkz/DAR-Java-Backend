public class TwoStrings {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String w1 = new String(), w2 = new String();
       int count1 = 0;
       int count2 = 0;

        for (int i = 0; i < word1.length; i++) {
            w1 += word1[i];
            count1++;

        }
        System.out.println(w1);
        for (int i = 0; i < word2.length; i++) {
            w2 += word2[i];
            count2++;

        }
        System.out.println(w2);
        if (w1.equals(w2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddef"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
