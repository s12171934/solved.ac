import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            boolean checkVPS = checkVPS(bufferedReader.readLine());
            stringBuilder.append(checkVPS ? "YES" : "NO" ).append("\n");
        }

        System.out.println(stringBuilder);
        bufferedReader.close();
    }

    static boolean checkVPS(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }

        int count = 0;

        for (char c : str.toCharArray()) {
            if(c == '('){
                count++;
            } else {
                count--;
            }

            if(count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}