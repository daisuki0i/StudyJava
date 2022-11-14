public class Class4_method_HW1 {
    public static void main(String[] args) {
        String myStr = "Tsuki";
        System.out.println(myStr.replace('T', ' '));
        // replace() เปลี่ยนค่าใน myStr

        String myStr1 = "Hello";
        String myStr2 = "HELLO";
        String myStr3 = "tsuki";
        System.out.println(myStr1.equalsIgnoreCase(myStr2));
        System.out.println(myStr1.equalsIgnoreCase(myStr3));
        // equalsIgnoreCase() จะเปรียบเทียบสองสตริง
        // โดยไม่สนใจความแตกต่างของตัวพิมพ์เล็ก-ใหญ่
        // methodนี้คืนค่าจริงถ้ามันเท่ากัน และเป็นเท็จถ้ามันไม่เท่ากัน

        String txt = "Hello World";
        System.out.println(txt.toUpperCase()); // พิมพ์ใหญ่
        System.out.println(txt.toLowerCase()); // พิมพ์เล็ก

        String myStr4 = "Hello";
        System.out.println(myStr4.contains("Hel"));
        System.out.println(myStr4.contains("e"));
        System.out.println(myStr4.contains("Hi"));
        // ตรวจสอบอักษรว่ามีใน myStr4 หรือไม่

        String myStr5 = "       Hello         ";
        System.out.println(myStr5);
        System.out.println(myStr5.trim());
        // วิธีการลบช่องว่างจากปลายทั้งสองของสตริง

    }
}
