public class Practice1 {
    public static void main(String[] args) {
        System.out.println("варианты вызова метода printVars()\n");

        System.out.println("1. Вызов через имя класса:");
        A.printVars();

        System.out.println("\n2. Вызов через объект класса:");
        A obj1 = new A();
        obj1.printVars();

        System.out.println("\n3. Вызов через другой объект класса:");
        A obj2 = new A();
        A obj3 = new A();
        obj2.printVars();
        obj3.printVars();

        System.out.println("\n4. Вызов внутри того же класса:");
        A.callPrintVarsFromInside();

        System.out.println("\n5. Вызов из статического метода другого класса:");
        StaticDemo.callPrintVars();

        System.out.println("\n6. Вызов из нестатического метода другого класса:");
        StaticDemo demo = new StaticDemo();
        demo.callPrintVarsFromInstance();

        System.out.println("\n7. Вызов через наследование:");
        B.printVars();

        System.out.println("\n8. Вызов через объект наследника:");
        B bObj = new B();
        bObj.printVars();

        System.out.println("\n9. Вызов из статического блока инициализации:");
        System.out.println("(Вызов произойдет автоматически при загрузке класса C)");
        C c = new C();

        System.out.println("\n10. Вызов через ссылку родительского типа:");
        A aRef = new B();
        aRef.printVars();
    }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void callPrintVarsFromInside() {
        printVars();
    }
}

class B extends A {
    // Наследует статический метод printVars()
}

class C {
    static {
        System.out.println("Статический блок инициализации класса C:");
        A.printVars();
    }
}

class StaticDemo {
    public static void callPrintVars() {
        System.out.println("Вызов из статического метода StaticDemo:");
        A.printVars();
    }

    public void callPrintVarsFromInstance() {
        System.out.println("Вызов из нестатического метода StaticDemo:");
        A.printVars();
    }
}