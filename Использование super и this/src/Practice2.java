class A {
    int a = 10;

    void method() {
        System.out.println();
        System.out.println("Метод из класса A, a = " + a);
    }
}

class B extends A {
    // Не определяет ни поле a, ни method()
}

class C extends B {
    void method() {
        // super.a ссылается на поле из класса A
        int value = super.a;

        // super.method() вызывает метод из класса A
        super.method();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.method();
    }
}
/*
    При вызове super.a и super.method() в классе C произойдет поиск вверх по цепочке наследования:
     сначала в классе B (не найдет), затем в классе A, где будут обнаружены и поле a,
      и метод method(), которые и будут использованы
*/