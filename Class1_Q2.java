import java.util.Scanner;

public class Class1_Q2 {
    public static void main(String[] args) {
        int BirthYear;
        Scanner sc = new Scanner(System.in);
        System.out.println("input your birth year");
        BirthYear = sc.nextInt();

        String gen;
        if (BirthYear >= 2489 && BirthYear <= 2507) {
            gen = "Gen Baby";
        } else if (BirthYear >= 2508 && BirthYear <= 2523) {
            gen = "Gen X";
        } else if (BirthYear >= 2524 && BirthYear <= 2539) {
            gen = "Gen Y";
        } else if (BirthYear >= 2540 && BirthYear <= 2555) {
            gen = "Gen Z";
        } else if (BirthYear >= 2567) {
            gen = "Gen Alpha";
        } else {
            gen = "Erroe";
        }
        System.out.println(gen);
        sc.close();
    }
}
