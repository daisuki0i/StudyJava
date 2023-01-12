import java.util.*;

public class test6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        int numElementsInArr = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numElementsInArr; i++) {
            int memberInArr = Integer.parseInt(sc.nextLine());
            list.add(memberInArr);
            // System.out.println(i + " " + memberInArr);
        }

        int key = Integer.parseInt(sc.nextLine());
        int index = -1;

        index = list.indexOf(key);

        System.out.println(index);

        sc.close();
    }
}
