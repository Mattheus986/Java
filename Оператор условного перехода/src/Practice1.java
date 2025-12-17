public class Practice1 {
    public static void main(String[] args) {
        int a = 1; // пример

        // Исходный
        int i = 0;
        if (a == 1) {
            i = 1;
        } else if (a == 2) {
            i = 2;
        } else {
            i = 3;
        }

        // Тот же код через конструкцию ? :
        int j = (a == 1) ? 1 : ((a == 2) ? 2 : 3);
        System.out.println();
        // Проверка
        System.out.println("С использованием if-else: i = " + i);
        System.out.println("С использованием тернарного оператора: j = " + j);

        // с разными a
        System.out.println("\nПроверка для разных значений a:");

        int[] testValues = {1, 2, 3, 0, 5};
        for (int testA : testValues) {
            int result = (testA == 1) ? 1 : ((testA == 2) ? 2 : 3);
            System.out.println("a = " + testA + " -> результат = " + result);
        }
    }
}