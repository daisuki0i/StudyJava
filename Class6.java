
// import java.util.Arrays;
import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] r : arr) {
            int sum = 0;
            for (int i = 0; i < r.length; i++) {
                sum += r[i];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
