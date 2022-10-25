import java.util.Scanner;

public class Class1_Q5_HW {
    public static void main(String[] agrs) {
        int number;
        int maxNumber = Integer.MIN_VALUE, minNumber = Integer.MAX_VALUE; // กำหนดค่าสูงสุดที่เก็บอยู่ใน int
                                                          // จากนั้นมาเช็คกับตัวเลขที่ป้อนเข้ามา มันน้อยกว่า MAX_VALUE
                                                          // รึเปล่า ถ้าน้อยกว่าให้ minNumber =
                                                          // ตัวเลขที่ป้อนเข้ามา(number)
        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer");
        number = sc.nextInt();

        while (number != -1) {
            if (number > maxNumber)
                maxNumber = number;

            if (number < minNumber)
                minNumber = number;
            System.out.println("input an integer");
            number = sc.nextInt();
        }
        System.out.println("max number = " + maxNumber);
        System.out.println("min number = " + minNumber);
        sc.close();
    }
}