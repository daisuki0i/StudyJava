import java.util.Scanner;

public class Class1_Q3 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer");
        number = sc.nextInt();

        while (number != -1) {
            sum += number;
            System.out.println(number);
            System.out.println("input an integer");
            number = sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}
