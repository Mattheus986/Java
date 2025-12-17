/*
   Type inference (выведение типа) — это механизм языка Java, при котором
   компилятор сам определяет тип переменной на основе значения,
   которое ей присваивается. Это работает благодаря ключевому слову `var`.
*/

public class Practice8 {
    public static void main(String[] args) {

        // Компилятор выводит тип как int
        var number = 10;

        // Здесь тип определяется как String
        var text = "Hello, world!";

        // Дробное число без суффикса -> double
        var pi = 3.14;

        System.out.println("number = " + number);
        System.out.println("text = " + text);
        System.out.println("pi = " + pi);

    }
}
