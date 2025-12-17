public class A {
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }

    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }

    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }

    public void printNum(Number n) {
        System.out.println("Number=" + n);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};

        // цикл for (1)
        for (Number n : num) {
            a.printNum(n); // Здесь тип переменной n - Number (во время компиляции)
            // Компилятор на этапе компиляции видит, что n имеет тип Number
            // Поэтому выбирается наиболее подходящий метод: printNum(Number n)
            // Это решение принимается на этапе компиляции (static binding)
        }

        System.out.println(); // Разделитель для наглядности

        // (2)
        a.printNum(new Integer(1)); // Явно передается Integer -> printNum(Integer i)
        a.printNum(11);             // Литерал int -> printNum(int i) (не требует автоупаковки)
        a.printNum(1.11f);          // Литерал float -> printNum(Float f) (автоупаковка float в Float)
        a.printNum(11.11);          // Литерал double -> printNum(Number n) (Double наследуется от Number)
        // Здесь компилятор на этапе компиляции знает точные типы аргументов
        // и выбирает наиболее специфичные перегруженные методы
    }
}


/*
В цикле for (1) все элементы массива num имеют тип Number (ссылочный тип),
поэтому компилятор на этапе компиляции видит только,
что мы вызываем a.printNum(n) где n имеет тип Number,
и выбирает метод printNum(Number n) (статическое связывание).
Во втором случае (2) компилятор знает точные типы каждого аргумента
 на этапе компиляции и выбирает наиболее специфичные методы:
 для Integer -> printNum(Integer i), для литерала 11 (int) -> printNum(int i),
  для 1.11f (float) -> printNum(Float f) (автоупаковка в Float),
  для 11.11 (double) -> printNum(Number n) (нет метода для Double, но Double наследуется от Number).
*/