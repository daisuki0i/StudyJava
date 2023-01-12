import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCustomers = sc.nextInt();
        sc.nextLine();

        System.out.println("--Customers Information--");
        for (int i = 0; i < numOfCustomers; i++) {
            String name = sc.nextLine();
            int birthYear = Integer.parseInt(sc.nextLine());
            String sex = sc.nextLine();

            int thisYear = 2017;
            int age = thisYear - birthYear;

            System.out.printf("%s (age : %d)%n", name, age);
        }
        sc.close();

    }

}
