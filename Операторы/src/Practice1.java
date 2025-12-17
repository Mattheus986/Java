public class Practice1
 {
    public static void main(String[] args) {


        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 5.5f;
        double d = 6.6;
        char c = 'A';
        boolean bool = true;

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Начальные значения:");
        System.out.println("b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", c=" + c + ", bool=" + bool);
        System.out.println("str1=\"" + str1 + "\", str2=\"" + str2 + "\"\n");

        // 1: Операторы присваивания = и комбинированные (+=, -=, *=, /=, %=) ---
        System.out.println("1. ОПЕРАТОРЫ ПРИСВАИВАНИЯ (=, +=, -=, *=, /=, %=):");

        // Базовые типы
        int resInt;
        resInt = i;
        System.out.println("  int: resInt = i -> " + resInt);

        b += 5; // b = b + 5
        System.out.println("  byte: b += 5 -> " + b);
        s -= 3; // s = s - 3
        System.out.println("  short: s -= 3 -> " + s);
        i *= 2; // i = i * 2
        System.out.println("  int: i *= 2 -> " + i);
        l /= 4; // l = l / 4
        System.out.println("  long: l /= 4 -> " + l);
        f %= 2.0f; // f = f % 2.0f
        System.out.println("  float: f %%= 2.0f -> " + f); // %% для экранирования % в выводе

        // Строки (только + и +=)
        String resStr = str1; // =
        System.out.println("  String: resStr = str1 -> \"" + resStr + "\"");
        str1 += " " + str2; // Конкатенация str1 = str1 + " " + str2
        System.out.println("  String: str1 += \" \" + str2 -> \"" + str1 + "\"");
        System.out.println();

        // 2: Тернарный оператор ?: ---
        System.out.println("2. ТЕРНАРНЫЙ ОПЕРАТОР ?:");
        int max = (i > 10) ? i : 10; // Базовые типы
        System.out.println("  int max = (i > 10) ? i : 10 -> " + max);
        String message = bool ? "Истина" : "Ложь"; // С участием boolean и String
        System.out.println("  String message = bool ? \"Истина\" : \"Ложь\" -> \"" + message + "\"");
        System.out.println();

        // 3: Логические ИЛИ || и И && ---
        System.out.println("3. ЛОГИЧЕСКИЕ ОПЕРАТОРЫ (||, &&):");
        // Работают только с boolean
        boolean logOr = (i > 20) || (d < 10.0);
        System.out.println("  boolean: (i > 20) || (d < 10.0) -> " + logOr);
        boolean logAnd = (s == 17) && bool;
        System.out.println("  boolean: (s == 17) && bool -> " + logAnd);
        // Для строк эти операторы НЕ ПРИМЕНИМЫ.
        System.out.println();

        // 4: Побитовые |, ^, & ---
        System.out.println("4. ПОБИТОВЫЕ ОПЕРАТОРЫ (|, ^, &):");
        // Для целочисленных типов
        int bitOr = 0b1100 | 0b1010; // 12 | 10 = 14 (1110)
        System.out.println("  int: 0b1100 | 0b1010 -> " + bitOr + " (двоич.: " + Integer.toBinaryString(bitOr) + ")");
        int bitXor = 0b1100 ^ 0b1010; // 12 ^ 10 = 6 (0110)
        System.out.println("  int: 0b1100 ^ 0b1010 -> " + bitXor + " (двоич.: " + Integer.toBinaryString(bitXor) + ")");
        int bitAnd = 0b1100 & 0b1010; // 12 & 10 = 8 (1000)
        System.out.println("  int: 0b1100 & 0b1010 -> " + bitAnd + " (двоич.: " + Integer.toBinaryString(bitAnd) + ")");
        // Для boolean это будут логические (не побитовые) |, ^, &
        boolean boolOr = true | false;
        boolean boolXor = true ^ true; // Исключающее ИЛИ
        boolean boolAnd = true & bool;
        System.out.println("  boolean: true | false -> " + boolOr);
        System.out.println("  boolean: true ^ true -> " + boolXor);
        System.out.println("  boolean: true & bool -> " + boolAnd);
        System.out.println();

        // 5: Операторы сравнения == и != ---
        System.out.println("5. ОПЕРАТОРЫ СРАВНЕНИЯ (==, !=):");
        // Базовые типы (сравнивают значения)
        System.out.println("  int: i == 60 -> " + (i == 60));
        System.out.println("  double: d != 6.6 -> " + (d != 6.6));
        System.out.println("  char: c == 'A' -> " + (c == 'A'));
        // Строки (сравнивают ссылки)
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println("  String (разные объекты): str3 == str4 -> " + (str3 == str4)); // false
        System.out.println("  String (разные объекты): str3 != str4 -> " + (str3 != str4)); // true
        System.out.println("  String (одинаковые литералы): \"Hi\" == \"Hi\" -> " + ("Hi" == "Hi")); // true (пул строк)
        System.out.println();

        // 6: Операторы сравнения >, >=, <, <= ---
        System.out.println("6. ОПЕРАТОРЫ СРАВНЕНИЯ (>, >=, <, <=):");
        // Только для числовых типов
        System.out.println("  int: i > 50 -> " + (i > 50));
        System.out.println("  float: f >= 1.5f -> " + (f >= 1.5f));
        System.out.println("  long: l < 20 -> " + (l < 20));
        System.out.println("  char: c <= 'B' -> " + (c <= 'B')); // Сравнение по коду Unicode
        System.out.println();

        // 7: Побитовые сдвиги >>, >>>, << ---
        System.out.println("7. ОПЕРАТОРЫ ПОБИТОВОГО СДВИГА (>>, >>>, <<):");
        // Только для целочисленных типов
        int shiftVal = 8; // 1000 в двоичной
        int shiftRight = shiftVal >> 2; // 1000 -> 0010 (2)
        System.out.println("  int: 8 >> 2 -> " + shiftRight);
        int shiftUnsignedRight = -8 >>> 2; // Знаковый сдвиг вправо
        System.out.println("  int: -8 >>> 2 -> " + shiftUnsignedRight + " (очень большое число)");
        int shiftLeft = shiftVal << 2; // 1000 -> 100000 (32)
        System.out.println("  int: 8 << 2 -> " + shiftLeft);
        System.out.println();

        // 8: Арифметические + и - ---
        System.out.println("8. АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ (+, -):");
        // Базовые числовые типы
        double sum = d + f;
        System.out.println("  double/float: d + f -> " + sum);
        long diff = l - 100L;
        System.out.println("  long: l - 100L -> " + diff);
        // Строки (+ как конкатенация)
        String concat = str2 + " " + 2024;
        System.out.println("  String: str2 + \" \" + 2024 -> \"" + concat + "\"");
        System.out.println();

        // 9: Арифметические *, / и % ---
        System.out.println("9. АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ (*, /, %):");
        // Только для числовых типов
        System.out.println("  int: i * 3 -> " + (i * 3));
        System.out.println("  double: d / 2.0 -> " + (d / 2.0));
        System.out.println("  int: i % 7 -> " + (i % 7));
        System.out.println();

        // 10: Инкремент/декремент ++ и --, а также ~ и ! ---
        System.out.println("10. УНАРНЫЕ ОПЕРАТОРЫ (++, --, ~, !):");

        // Префиксный и постфиксный ++/--
        System.out.println("  Префиксный ++ (++i):");
        i = 30; // Сбросим значение для чистоты демонстрации
        int prefixResult = ++i; // Сначала увеличивает i на 1, потом присваивает
        System.out.println("    i было 30, prefixResult = ++i -> prefixResult=" + prefixResult + ", i=" + i);

        System.out.println("  Постфиксный ++ (i++):");
        i = 30;
        int postfixResult = i++; // Сначала присваивает, потом увеличивает i на 1
        System.out.println("    i было 30, postfixResult = i++ -> postfixResult=" + postfixResult + ", i=" + i);

        // Аналогично для --
        int preDec = --i;
        int postDec = i--;
        System.out.println("  Префиксный --: --i -> " + preDec);
        System.out.println("  Постфиксный --: i-- -> " + postDec + " (после операции i=" + i + ")");

        // Побитовое НЕ (~) для целых чисел
        byte byteVal = 0b00001010; // 10
        byte bitNot = (byte) ~byteVal; // 11110101 -> -11
        System.out.println("  byte: ~10 (бинарно ~00001010) -> " + bitNot);

        // Логическое НЕ (!) для boolean
        System.out.println("  boolean: !bool -> " + (!bool));
        // Для строк эти операторы НЕ ПРИМЕНИМЫ.
        System.out.println();

        //  11: Операторы группировки () и [] ---
        System.out.println("11. ОПЕРАТОРЫ ГРУППИРОВКИ (( ), [ ]):");
        // Скобки () меняют приоритет
        int withParens = (1 + 2) * 3; // 9
        int withoutParens = 1 + 2 * 3; // 7
        System.out.println("  (1 + 2) * 3 -> " + withParens);
        System.out.println("  1 + 2 * 3 -> " + withoutParens);

        // Квадратные скобки [] для массивов
        int[] array = new int[5];
        array[0] = 100;
        System.out.println("  array[0] = 100 -> array[0]=" + array[0]);
        System.out.println();

    }
}