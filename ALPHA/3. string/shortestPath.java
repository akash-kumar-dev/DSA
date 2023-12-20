public class shortestPath {

    public static float shortestPathFunc (String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            }
        }
        int temp = (x * x) + (y * y);
        return (float)Math.sqrt(temp);

    }
    public static void main (String args[]) {
        String path = "WNEENESENNN";
        System.out.println(shortestPathFunc(path));
    }
}