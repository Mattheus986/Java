public class Practice6 {
    public static void main(String[] args) {

        int i = 150;
        byte b = (byte) i;      // int -> byte

        long l = 1000L;
        int i2 = (int) l;       // long -> int

        double d = 12.99;
        int i3 = (int) d;       // double -> int (дробная часть отбрасывается)

        float f = 123.45f;
        short s = (short) f;    // float -> short (дробная часть отбрасывается)

        int big = 1000;
        short s2 = (short) big; // int -> short

        System.out.println('\n');
        System.out.println("int -> byte: " + b);
        System.out.println("long -> int: " + i2);
        System.out.println("double -> int: " + i3);
        System.out.println("float -> short: " + s);
        System.out.println("int -> short: " + s2);
    }
}
