public class Practice2
 {
    public static void main(String[] args) {

        String str = "Hello";
        Integer integerObj = 100;
        Double doubleObj = 3.14;
        Object obj = new Object();

        String nullString = null;
        Integer nullInteger = null;

        System.out.println("проверки со стандартными классами:");
        System.out.println("   str = \"" + str + "\"");
        System.out.println("   str instanceof String -> " + (str instanceof String));
        System.out.println("   str instanceof Object -> " + (str instanceof Object));
        System.out.println();

        System.out.println("   integerObj = " + integerObj);
        System.out.println("   integerObj instanceof Integer -> " + (integerObj instanceof Integer));
        System.out.println("   integerObj instanceof Number -> " + (integerObj instanceof Number));
        System.out.println("   integerObj instanceof Object -> " + (integerObj instanceof Object));
        System.out.println();

        System.out.println("   doubleObj = " + doubleObj);
        System.out.println("   doubleObj instanceof Double -> " + (doubleObj instanceof Double));
        System.out.println("   doubleObj instanceof Number -> " + (doubleObj instanceof Number));
        System.out.println();

        System.out.println("   obj = " + obj);
        System.out.println("   obj instanceof Object -> " + (obj instanceof Object));
        System.out.println("   obj instanceof String -> " + (obj instanceof String));
        System.out.println();

        //  Демонстрация с null
        System.out.println(" instanceof с null:");
        System.out.println("   nullString = " + nullString);
        System.out.println("   nullString instanceof String -> " + (nullString instanceof String));
        System.out.println("   nullString instanceof Object -> " + (nullString instanceof Object));
        System.out.println();

        System.out.println("   nullInteger = " + nullInteger);
        System.out.println("   nullInteger instanceof Integer -> " + (nullInteger instanceof Integer));
        System.out.println("   nullInteger instanceof Number -> " + (nullInteger instanceof Number));
        System.out.println();

        // Проверка с литералом null
        System.out.println("Проверка с литералом null:");
        System.out.println("   null instanceof String -> " + (null instanceof String));
        System.out.println("   null instanceof Object -> " + (null instanceof Object));
        System.out.println("   null instanceof Integer -> " + (null instanceof Integer));
        System.out.println();

        System.out.println("null instanceof <любой_тип> ВСЕГДА возвращает false");

    }
}