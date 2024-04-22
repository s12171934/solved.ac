import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine());

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = bufferedReader.readLine();
        }

        bufferedReader.close();

        for(Object s : Arrays.stream(str).sorted(Main::compare).toArray()){
            stringBuilder.append(s).append("\n");
        }

        System.out.println(stringBuilder);
    }

    static int compare(String s1, String s2) {
        int x1 = Integer.parseInt(s1.split(" ")[0]);
        int x2 = Integer.parseInt(s2.split(" ")[0]);
        int y1 = Integer.parseInt(s1.split(" ")[1]);
        int y2 = Integer.parseInt(s2.split(" ")[1]);

        if (x1 != x2) {
            return x1 - x2;
        }
        else {
            return y1 - y2;
        }
    }
}