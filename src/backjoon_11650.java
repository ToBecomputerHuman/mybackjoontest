import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class backjoon_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Position[] position = new Position[a];
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            position[i] = new Position(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(position, new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                if (o1.x > o2.x) {
                    return o1.x - o2.x;
                }else if (o1.x == o2.x) {
                    return o1.y - o2.y;
                }else {
                    return o1.x - o2.x;
                }
            }
        });

        for (Position po : position) {
            bw.write(po.toString() + "\n");
        }

        bw.flush();
        bw.close();
    }
}
class Position {
    int x;
    int y;
    Position(){}
    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}