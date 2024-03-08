import java.io.*;

public class backjoon_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        Long count = 0L;
        Long sum = 0L;

        for (Long i = 1L; i <= a - 2; i++) {
            count += i;
            sum += count;
        }

        if (a < 3) {
            bw.write(0 + "\n");
        }else {
            bw.write(sum + "\n");
        }

        bw.write(3 + "\n");
        bw.flush();
        bw.close();
    }
}