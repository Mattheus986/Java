public class Practice4 {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;  // автоупаковка
        Integer b1 = i1;  // автоупаковка
        // a1==i1 и b1==i1 → true (для 128), a2==i2 и b2==i2 → true (для 127):
        // При сравнении Integer с int происходит автораспаковка Integer в int
        // Сравниваются примитивные значения, а не объекты
        // a1 == i1 преобразуется в a1.intValue() == i1
        System.out.println("a1==i1 " + (a1 == i1));        // true (автораспаковка при сравнении)
        System.out.println("b1==i1 " + (b1 == i1));        // true (автораспаковка при сравнении)

        // a1==b1 → false (для 128), a2==b2 → true (для 127):
        // Ключевое различие! Для 127 == возвращает true, для 128 - false
        // Причина: IntegerCache (кеш целых чисел)
        System.out.println("a1==b1 " + (a1 == b1));        // false (разные объекты для 128)

        // Все equals() возвращают true:
        // Метод equals() сравнивает значения, а не ссылки на объекты
        // a1.equals(b1) сравнивает 128 == 128 → true
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));  // true (сравнение значений)
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));  // true (сравнение значений)
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));  // true (сравнение значений)

        System.out.println();

        int i2 = 127;
        Integer a2 = i2;  // автоупаковка
        Integer b2 = i2;  // автоупаковка
        // a1==i1 и b1==i1 → true (для 128), a2==i2 и b2==i2 → true (для 127):
        // При сравнении Integer с int происходит автораспаковка Integer в int
        // Сравниваются примитивные значения, а не объекты
        // a2 == i2 преобразуется в a2.intValue() == i2
        System.out.println("a2==i2 " + (a2 == i2));        // true (автораспаковка при сравнении)
        System.out.println("b2==i2 " + (b2 == i2));        // true (автораспаковка при сравнении)
        // a1==b1 → false (для 128), a2==b2 → true (для 127):
        // Ключевое различие! Для 127 == возвращает true, для 128 - false
        // Причина: IntegerCache (кеш целых чисел)
        System.out.println("a2==b2 " + (a2 == b2));        // true (кеширование для 127)
        // Все equals() возвращают true:
        // Метод equals() сравнивает значения, а не ссылки на объекты
        // a2.equals(b2) сравнивает 127 == 127 → true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));  // true (сравнение значений)
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));  // true (сравнение значений)
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));  // true (сравнение значений)
    }
}

// Класс IntegerCache кеширует часто используемые объекты Integer от -128 до 127 для оптимизации памяти.
// При автоупаковке значений в этом диапазоне возвращаются кешированные объекты, поэтому a2==b2 дает true.
// Для значений вне этого диапазона (как 128) создаются новые объекты, поэтому a1==b1 дает false.