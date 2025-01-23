
public class PathCrossing {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }

    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            // North
            if (path.charAt(i) == 'N') {
                y++;
            }
            // south
            else if (path.charAt(i) == 'S') {
                y--;
            }
            // east
            else if (path.charAt(i) == 'E') {
                x++;
            }
            // west
            else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }
}
