import java.util.Scanner;

public class Class1_Q4_HW {
    public static void main(String[] agrs) {
        int number = 0;
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer");
        number = sc.nextInt();

        while (number != -1) {
            sum *= number;
            System.out.println("input an integer next");
            number = sc.nextInt();

        }
        System.out.println(sum);
        sc.close();
    }
}