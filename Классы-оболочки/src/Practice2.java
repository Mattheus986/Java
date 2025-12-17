public class Practice2 {
    public static void main(String[] args) {

        // СПОСОБ 1: Использование конструктора
        Boolean bool1 = new Boolean(true);
        Boolean bool2 = new Boolean(false);

        // СПОСОБ 2: Использование конструктора со строкой
        Boolean bool3 = new Boolean("true");
        Boolean bool4 = new Boolean("false");
        Boolean bool5 = new Boolean("TRUE");
        Boolean bool6 = new Boolean("anything");

        // СПОСОБ 3: Метод valueOf() с boolean
        Boolean bool7 = Boolean.valueOf(true);
        Boolean bool8 = Boolean.valueOf(false);

        // СПОСОБ 4: Метод valueOf() со строкой
        Boolean bool9 = Boolean.valueOf("true");
        Boolean bool10 = Boolean.valueOf("false");
        Boolean bool11 = Boolean.valueOf("TRUE");
        Boolean bool12 = Boolean.valueOf("any text");

        // СПОСОБ 5: Литералы TRUE и FALSE
        Boolean bool13 = Boolean.TRUE;
        Boolean bool14 = Boolean.FALSE;

        // СПОСОБ 6: Автоупаковка (autoboxing)
        Boolean bool15 = true;
        Boolean bool16 = false;

        System.out.println();
        System.out.println("Способ 1 (конструктор с boolean):");
        System.out.println("  new Boolean(true)  = " + bool1);
        System.out.println("  new Boolean(false) = " + bool2);
        System.out.println();

        System.out.println("Способ 2 (конструктор со строкой):");
        System.out.println("  new Boolean(\"true\")  = " + bool3);
        System.out.println("  new Boolean(\"false\") = " + bool4);
        System.out.println("  new Boolean(\"TRUE\")  = " + bool5);
        System.out.println("  new Boolean(\"text\")  = " + bool6);
        System.out.println();

        System.out.println("Способ 3 (valueOf с boolean):");
        System.out.println("  Boolean.valueOf(true)  = " + bool7);
        System.out.println("  Boolean.valueOf(false) = " + bool8);
        System.out.println();

        System.out.println("Способ 4 (valueOf со строкой):");
        System.out.println("  Boolean.valueOf(\"true\")  = " + bool9);
        System.out.println("  Boolean.valueOf(\"false\") = " + bool10);
        System.out.println("  Boolean.valueOf(\"TRUE\")  = " + bool11);
        System.out.println("  Boolean.valueOf(\"text\")  = " + bool12);
        System.out.println();

        System.out.println("Способ 5 (константы):");
        System.out.println("  Boolean.TRUE  = " + bool13);
        System.out.println("  Boolean.FALSE = " + bool14);
        System.out.println();

        System.out.println("Способ 6 (автоупаковка):");
        System.out.println("  Boolean bool15 = true  → " + bool15);
        System.out.println("  Boolean bool16 = false → " + bool16);
        System.out.println();

    }
}