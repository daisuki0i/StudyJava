public class Class3_method_Q3_HW {
    public static int minInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] x = { 42, 40, 34, 28, 777 };
        int minInArray = minInArray(x);
        System.out.println(minInArray);
    }
}
