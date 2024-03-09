
import java.io.*;
import java.nio.channels.Pipe;
import java.util.*;

public class backjoon_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Point[] points = new Point[num];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.y - o2.y == 0) {
                    return o1.x - o2.x;
                }else {
                    return o1.y - o2.y;
                }
            }
        });

        for (Point po : points) {
            bw.write(po.toString());
        }
        bw.flush();
        bw.close();
    }
}

class Point{
    int x;
    int y;
    Point(){}
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y + "\n";
    }
}
