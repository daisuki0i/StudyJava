import java.util.*;

public class product_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberProducts = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < numberProducts; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> indexsInArr = new ArrayList<Integer>();
        int key = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                indexsInArr.add(i);
            }
        }
        System.out.println(("Position: " + indexsInArr).replace("[", "")
                .replace("]", "")
                .replace(", ", ","));

        sc.close();
    }
}
