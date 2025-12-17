public class Practice1 {

    public final int a;

    //  поля для наглядности
    public final int b = 100;                    // Способ 1: прямая инициализация
    public final int c;                          // Для способа 2
    public final int d;                          // Для способа 3

    // Способ 2: блок инициализатора экземпляра
    {
        c = 200;
    }

    // Конструктор 1: Способ 3 - инициализация в конструкторе
    public Practice1() {
        a = 42;
        d = 300;
    }

    // Конструктор 2: другой вариант способа 3
    public Practice1(int value) {

        a = value;
        d = value * 2;
    }

    // Конструктор 3: еще один вариант способа 3
    public Practice1(boolean flag) {

        if (flag) {
            a = 999;
        } else {
            a = -999;
        }
        d = flag ? 999 : -999;
    }


    public void displayValues() {
        System.out.println("Значения полей:");
        System.out.println("a (инициализирован в конструкторе) = " + a);
        System.out.println("b (прямая инициализация) = " + b);
        System.out.println("c (блок инициализатора) = " + c);
        System.out.println("d (тоже в конструкторе) = " + d);
    }


    public static void main(String[] args) {

        System.out.println();

        System.out.println("1. Создание объекта конструктором по умолчанию:");
        Practice1 obj1 = new Practice1();
        obj1.displayValues();

        System.out.println("2. Создание объекта конструктором с параметром:");
        Practice1 obj2 = new Practice1(77);
        obj2.displayValues();

        System.out.println("3. Создание объекта конструктором с boolean:");
        Practice1 obj3 = new Practice1(true);
        obj3.displayValues();

    }
}