import java.util.*;

public class test6_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElementsInArr = Integer.parseInt(sc.nextLine());
        int[] list = new int[numElementsInArr];

        for (int i = 0; i < numElementsInArr; i++) {
            int memberInArr = Integer.parseInt(sc.nextLine());
            list[i] = memberInArr;
        }

        int key = Integer.parseInt(sc.nextLine());
        int index = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        sc.close();
    }
}
