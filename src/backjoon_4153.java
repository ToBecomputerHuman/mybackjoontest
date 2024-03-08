import java.io.*;
import java.util.StringTokenizer;

public class backjoon_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c && c == 0) break;

            a *= a;
            b *= b;
            c *= c;

            if (a > b) {
                if (a > c) {
                    if (a == b + c) {
                        bw.write("right\n");
                    }else {
                        bw.write("wrong\n");
                    }
                }else {//a < c
                    if (a + b == c) {
                        bw.write("right\n");
                    }else {
                        bw.write("wrong\n");
                    }
                }
            }else {//a < b
                if (b > c) {
                    if (a + c == b) {
                        bw.write("right\n");
                    }else {
                        bw.write("wrong\n");
                    }
                }else {//b < c
                    if (a + b == c) {
                        bw.write("right\n");
                    }else {
                        bw.write("wrong\n");
                    }
                }
            }
        }

        bw.flush();
        bw.close();
    }
}