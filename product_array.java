import java.util.*;

public class product_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberProducts = sc.nextInt();

        int[] list = new int[numberProducts];

        for (int i = 0; i < numberProducts; i++) {
            // int codeProducts = sc.nextInt();
            list[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(list));
        int key = sc.nextInt();
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                index = i;
                break;
            }
        }

    }
}
