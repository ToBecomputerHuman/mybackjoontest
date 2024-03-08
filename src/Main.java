import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("brian");
        System.out.println("brian");
        System.out.println("brian");
        System.out.println("brian");
        System.out.println("brian");
        System.out.println("brian");
        System.out.println("brian");
        System.out.println("brian");

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int newscore = Integer.parseInt(st.nextToken());
        int cutline = Integer.parseInt(st.nextToken()) - 1;
        List list = new ArrayList();
        int[] arr = new int[num + 1];

        if (num == 0) {
        }else {
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < num; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        list.add(newscore);
        list.sort(Comparator.reverseOrder());
        arr[0] = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == list.get(i)) {
                arr[i] = arr[i - 1];
            }else {
                arr[i] = i + 1;
            }
        }

        if (list.size() >= cutline + 1) {
            if (list.lastIndexOf(newscore) > cutline) {
                bw.write(-1 + "\n");
            }else {
                bw.write(arr[list.indexOf(newscore)] + "\n");
            }
        }else {
            bw.write(arr[list.indexOf(newscore)] + "\n");
        }
        bw.flush();
        bw.close();
    }
}