public class A {
    {
        System.out.println("logic (1) id= " + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        new A(100);
    }
}

/* Вывод:
    static logic
    logic (1) id= 0
    logic (2) id= 1
    ctor id= 100
    Объяснение: Сначала выполняется статический блок при загрузке класса A,
    затем при создании объекта new A(100) последовательно выполняются два нестатических логических
    блока (первый обращается к полю id до его явной инициализации, поэтому получает 0,
    а второй - после инициализации id = 1, получая 1), после чего вызывается конструктор,
    который присваивает полю значение 100 и выводит его.
*/