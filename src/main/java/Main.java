import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        int N = read();
        int M = read();
        int[][] matrix = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                matrix[i][j] = matrix[i][j - 1] + read();
            }
        }

        for (int i = 0; i < M; i++) {
            int x1 = read();
            int y1 = read();
            int x2 = read();
            int y2 = read();
            int result = 0;

            for (int j = x1; j <= x2; j++){
                result += matrix[j][y2] - matrix[j][y1 - 1];
            }
            stringBuilder.append(result).append("\n");
        }

        System.out.println(stringBuilder);
        bufferedReader.close();
    }

    static int read() throws Exception {
        int res = 0;
        while (true) {
            int pointer = bufferedReader.read();
            if (pointer == 32 || pointer == 10) {
                return res;
            }
            res = 10 * res + pointer - 48;
        }
    }
}