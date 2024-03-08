import java.io.*;
import java.util.*;

public class backjoon_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int front = n % h;
            int last = n / h;
            if (front == 0) {
                front = h;
                last--;
            }

            bw.write(String.format("%d%02d",front,last + 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}