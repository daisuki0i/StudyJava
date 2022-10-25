import java.util.Scanner;

public class Class2_Q1 {
    public static void main(String[] agrs) {
        int hours;
        int student;
        Scanner sc = new Scanner(System.in);
        System.out.println("input student");
        student = sc.nextInt();
        System.out.println("input hours of study");
        hours = sc.nextInt();
        int price = hours;
        if (student == 1) {
            price *= 450;
        } else if (student == 2) {
            price *= 450;
        } else if (student == 3) {
            price *= 400;
        } else if (student == 4) {
            price *= 350;
        } else if (student == 5) {
            price *= 200;
        } else {
            System.out.println("ERROR");
        }
        System.out.println("The Price Per Person :" + price);

        sc.close();
    }
}
