public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Примеры бесконечных циклов:");

        // Пример 1: Бесконечный цикл while
        System.out.println("1. Бесконечный цикл while:");
        int i = 0;
        while(true) {
            System.out.println("Бесконечный while: " + i);
            i++;
            // Нет условия для выхода из цикла
        }

        // Пример 2: Бесконечный цикл while с условием, которое всегда истинно

        int j = 0;
        while(j >= 0) {  // условие всегда истинно, так как j только увеличивается
            System.out.println("Бесконечный while: " + j);
            j++;
            // j никогда не станет меньше 0
        }

        // Пример 3: Бесконечный цикл do-while
        System.out.println("3. Бесконечный цикл do-while:");

        int k = 0;
        do {
            System.out.println("Бесконечный do-while: " + k);
            k++;
        } while(true);  // условие всегда истинно

        // Пример 4: Бесконечный цикл do-while с постоянным условием
        System.out.println("4. Бесконечный цикл do-while с постоянным условием:");

        int m = 1;
        do {
            System.out.println("Бесконечный do-while: " + m);
            m *= 2;
        } while(m > 0);  // m всегда > 0 для положительных чисел



        // Пример 5: Цикл while без изменения переменной условия
        System.out.println("5. Бесконечный цикл while без изменения переменной:");

        boolean flag = true;
        while(flag) {  // flag никогда не меняется внутри цикла
            System.out.println("Бесконечный цикл");
        }


        System.out.println();
        System.out.println("Основные причины бесконечных циклов:");
        System.out.println("1. while(true) или do-while(true)");
        System.out.println("2. Условие, которое всегда истинно (x > 0, где x только увеличивается)");
        System.out.println("3. Забыто изменение переменной условия в теле цикла");
        System.out.println("4. Неправильное логическое условие");
    }
}