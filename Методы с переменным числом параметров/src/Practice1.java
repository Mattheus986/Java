

public class Practice1 {
    static class Calculator {

    // 1. Метод для суммирования целых чисел
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // 2. Перегрузка: суммирование вещественных чисел
    public double sum(double... numbers) {
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    // 3. Перегрузка: объединение строк
    public String sum(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    // 4. Перегрузка: суммирование массивов целых чисел
    public int sum(int[]... arrays) {
        int total = 0;
        for (int[] array : arrays) {
            for (int num : array) {
                total += num;
            }
        }
        return total;
    }

    // 5. Перегрузка со смешанными параметрами
    public String format(String format, Object... args) {
        return String.format(format, args);
    }

    // 6. Перегрузка с обычными и varargs параметрами
    public void printWithPrefix(String prefix, String... messages) {
        for (String msg : messages) {
            System.out.println(prefix + msg);
        }
    }
}
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Примеры работы перегруженных методов");

        System.out.println("1. Сумма целых чисел: " + calc.sum(1, 2, 3, 4, 5));
        System.out.println("2. Сумма вещественных: " + calc.sum(1.5, 2.5, 3.5));
        System.out.println("3. Объединение строк: " + calc.sum("Hello", " ", "World", "!"));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println("4. Сумма массивов: " + calc.sum(arr1, arr2));

        System.out.println("5. Форматирование: " + calc.format("Число: %d, Строка: %s", 42, "test"));

        System.out.println("6. Печать с префиксом:");
        calc.printWithPrefix("[INFO] ", "Первое сообщение", "Второе сообщение");


        System.out.println("\nмассив");
        int[] numbersArray = {10, 20, 30};
        System.out.println("Сумма массива: " + calc.sum(numbersArray));
    }
}