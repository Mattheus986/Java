public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Примеры использования break и continue в циклах");
        System.out.println("===============================================\n");

        // Пример 1: break в цикле for
        System.out.println("1. Использование break в цикле for:");
        System.out.println("Поиск первого четного числа в массиве:");

        int[] numbers = {1, 3, 5, 8, 9, 10, 12};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Найдено первое четное число: " + numbers[i] + " (индекс: " + i + ")");
                break; // Выходим из цикла после нахождения первого четного числа
            }
        }

        System.out.println("\n2. Использование continue в цикле for:");
        System.out.println("Вывод только нечетных чисел из массива:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                continue; // Пропускаем четные числа
            }
            System.out.println("Нечетное число: " + numbers[i]);
        }

    }
}