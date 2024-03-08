import java.io.*;
import java.util.StringTokenizer;

public class backjoon_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if (x * n + y <= c * n && x <= c) {
            bw.write(1 + "\n");
        }else {
            bw.write(0 + "\n");
        }


        bw.flush();
        bw.close();
    }
}