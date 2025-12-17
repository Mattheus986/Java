public class Practice5 {
    public static void main(String[] args) {

        byte b = 10;
        short s = 20;
        int i = 100;
        long l = 5000L;
        float f = 3.5f;
        double d = 2.7;


        // 1. byte + short -> int
        int result1 = b + s;
        System.out.println("byte + short = " + result1 + " (тип: int)");

        // 2. short + int -> int
        int result2 = s + i;
        System.out.println("short + int = " + result2 + " (тип: int)");

        // 3. int + long -> long
        long result3 = i + l;
        System.out.println("int + long = " + result3 + " (тип: long)");

        // 4. long + float -> float
        float result4 = l + f;
        System.out.println("long + float = " + result4 + " (тип: float)");

        // 5. float + double -> double
        double result5 = f + d;
        System.out.println("float + double = " + result5 + " (тип: double)");

        // 6. byte + double -> double
        double result6 = b + d;
        System.out.println("byte + double = " + result6 + " (тип: double)");
    }
}
 //* В арифметических выражениях Java автоматически выполняет расширяющее преобразование типов,
 // чтобы не потерять точность при вычислениях: более «узкий» тип поднимается к более «широкому»
 // в цепочке byte → short → int → long → float → double. Поэтому когда мы складываем,
 //  например, byte и short, оба автоматически преобразуются в int, и результат тоже становится int;
 //  при сложении int и long значение int поднимается до long, и итог имеет тип long;
 //  если участвует тип с плавающей точкой, например long + float, то результат будет float,
 // потому что этот тип шире за счёт возможности хранить дробную часть;
 // если участвуют float и double, то всё преобразуется в double, поскольку он самый точный и «широкий».*/