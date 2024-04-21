import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        String[] str = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        int min = 1000000;
        int max = -1000000;

        for (String s : str) {
            int target = Integer.parseInt(s);

            min = Math.min(min, target);
            max = Math.max(max, target);
        }

        System.out.println(min + " " + max);
    }
}