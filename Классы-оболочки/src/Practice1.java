public class Practice1 {
    public static void main(String[] args) {


        // 1. Класс Integer
        System.out.println("1. Integer.decode():");

        // Десятичные числа
        Integer int1 = Integer.decode("123");
        System.out.println("   Integer.decode(\"123\") = " + int1);

        // Восьмеричные числа (начинаются с 0)
        Integer int2 = Integer.decode("0123");
        System.out.println("   Integer.decode(\"0123\") = " + int2 + " (восьмеричное 0123 = десятичное " + Integer.parseInt("123", 8) + ")");

        // Шестнадцатеричные числа (начинаются с 0x, 0X, #)
        Integer int3 = Integer.decode("0xFF");
        System.out.println("   Integer.decode(\"0xFF\") = " + int3 + " (hex 0xFF = decimal " + 0xFF + ")");

        Integer int4 = Integer.decode("#FF");
        System.out.println("   Integer.decode(\"#FF\") = " + int4);

        Integer int5 = Integer.decode("0XFF");
        System.out.println("   Integer.decode(\"0XFF\") = " + int5);


        Integer int6 = Integer.decode("-123");
        System.out.println("   Integer.decode(\"-123\") = " + int6);

        Integer int7 = Integer.decode("-0xFF");
        System.out.println("   Integer.decode(\"-0xFF\") = " + int7 + " (hex -0xFF = decimal " + -0xFF + ")");
        System.out.println();

        // 2. Класс Long
        System.out.println("2. Long.decode():");

        Long long1 = Long.decode("1234567890");
        System.out.println("   Long.decode(\"1234567890\") = " + long1);

        Long long2 = Long.decode("012345670");
        System.out.println("   Long.decode(\"012345670\") = " + long2 + " (восьмеричное)");

        Long long3 = Long.decode("0xFFFFFFFF");
        System.out.println("   Long.decode(\"0xFFFFFFFF\") = " + long3 + "");

        Long long4 = Long.decode("#CAFEBABE");
        System.out.println("   Long.decode(\"#CAFEBABE\") = " + long4 + " (шестнадцатеричное)");
        System.out.println();

        // 3. Класс Short (
        System.out.println("3. Short.decode():");

        Short short1 = Short.decode("12345");
        System.out.println("   Short.decode(\"12345\") = " + short1);

        Short short2 = Short.decode("0177777");
        System.out.println("   Short.decode(\"0177777\") = " + short2 + " (восьмеричное, максимум для short)");

        Short short3 = Short.decode("0x7FFF");
        System.out.println("   Short.decode(\"0x7FFF\") = " + short3 + " (максимальное значение short в hex)");

        try {
            Short short4 = Short.decode("0x8000"); // 32768 - больше максимального для short
            System.out.println("   Short.decode(\"0x8000\") = " + short4);
        } catch (NumberFormatException e) {
            System.out.println("   Short.decode(\"0x8000\") -> NumberFormatException: " + e.getMessage());
        }
        System.out.println();

        // 4. Класс Byte
        System.out.println("4. Byte.decode():");

        Byte byte1 = Byte.decode("100");
        System.out.println("   Byte.decode(\"100\") = " + byte1);

        Byte byte2 = Byte.decode("0127");
        System.out.println("   Byte.decode(\"0127\") = " + byte2 + " (восьмеричное 127)");

        Byte byte3 = Byte.decode("0x7F");
        System.out.println("   Byte.decode(\"0x7F\") = " + byte3 + " (максимальное значение byte в hex)");

        try {
            Byte byte4 = Byte.decode("0x80"); // 128 - больше максимального для byte
            System.out.println("   Byte.decode(\"0x80\") = " + byte4);
        } catch (NumberFormatException e) {
            System.out.println("   Byte.decode(\"0x80\") -> NumberFormatException: " + e.getMessage());
        }

    }
}