class A {
    int a1;
    public int a2;
    protected int a3;
    private int a4;

    void method1() {
        System.out.println("method1 from A");
    }

    public void method2() {
        System.out.println("method2 from A");
    }

    protected void method3() {
        System.out.println("method3 from A");
    }

    private void method4() {
        System.out.println("method4 from A");
    }


    public void showA4() {
        System.out.println("a4 from inside A: " + this.a4);
    }

}

class B extends A {
    public void testAccessFromB() {
        System.out.println("\nДоступ из класса B (наследник A):");


        System.out.println("a1 (default): " + this.a1);


        System.out.println("a2 (public): " + this.a2);


        System.out.println("a3 (protected): " + this.a3);

        // a4 - НЕ доступен (private - только внутри класса A)
        // System.out.println("a4 (private): " + this.a4); // Ошибка компиляции!


        this.method1();


        this.method2();


        this.method3();

        // method4 - НЕ доступен (private)
        // this.method4(); // Ошибка компиляции!


        this.showA4();
    }
}

class C extends B {
    public void testAccessFromC() {
        System.out.println("\nДоступ из класса C (наследник B, который наследник A):");
        System.out.println("a1 (default): " + this.a1);
        System.out.println("a2 (public): " + this.a2);
        System.out.println("a3 (protected): " + this.a3);
        // this.a4 - недоступно (private)

        this.method1();
        this.method2();
        this.method3();
        // this.method4() - недоступно (private)
    }
}

public class Practice2 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // доступ из класса B
        objB.testAccessFromB();

        // доступ из класса C
        objC.testAccessFromC();


        System.out.println("a1 (default): " + objA.a1);
        System.out.println("a2 (public): " + objA.a2);
        // System.out.println("a3 (protected): " + objA.a3); // Ошибка - protected доступен только наследникам
        // System.out.println("a4 (private): " + objA.a4);   // Ошибка - private

        objA.method1();
        objA.method2();
        // objA.method3(); // Ошибка - protected
        // objA.method4(); // Ошибка - private
    }
}

/*

1. PRIVATE:Не наследуется вообще, Доступен только внутри того же класса

2. Без указания модификатора:
   Наследуется, но только если классы в одном пакете, Недоступен из классов в других пакетах, даже наследников


3. PROTECTED: Полностью наследуется всеми потомками, Доступен наследникам из ЛЮБЫХ пакетов

4. PUBLIC: Полностью наследуется,Доступен отовсюду: из любого класса, любого пакета

*/