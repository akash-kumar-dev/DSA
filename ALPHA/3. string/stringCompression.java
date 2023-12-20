public class stringCompression {

    public static String stringCompressionFunc(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(ch);
        Integer count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            } else {
                sb.append(count.toString());
                count = 1;
                sb.append(str.charAt(i));
                ch = str.charAt(i);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaaaabbbccd";

        System.out.println(stringCompressionFunc(str));
    }
}
