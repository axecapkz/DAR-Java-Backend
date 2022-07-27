public class ShuffleArray {
    public static String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] chars = new char[n];
        for(int i = 0; i < n; i++){
            chars[indices[i]] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

}
