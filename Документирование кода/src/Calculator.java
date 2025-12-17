/**
 * Класс Calculator выполняет простые арифметические операции.
 *
 * @author Ivan
 * @version 1.0
 * @since 2025
 */
public class Calculator {

    /**
     * Складывает два числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Делит одно число на другое.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления
     * @throws ArithmeticException если деление на ноль
     */
    public int divide(int a, int b) {
        return a / b;
    }
}

/*
    Для создания документации необходим ввести в консоли команду
    javadoc -d docs Calculator.java
    Будет создана папка docs с .html файлами документации проекта.
*/
