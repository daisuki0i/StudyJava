import java.util.Arrays;

public class Class4_method_HW3 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 1, 3 };
        printArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void printArr(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i]);
                System.out.print("," + " ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println("]");
    }
}
