public class Practice4 {
    public static void main(String[] args) {

        int age = 40;
        double price = 12000000.0;
        boolean isActive = true;
        String name = "Ronaldo";

        Integer numberObj = 7;

        // String + int
        String example1 = "Возраст: " + age;

        // String + double
        String example2 = "Цена: " + price;

        // String + boolean
        String example3 = "Играет ли: " + isActive;

        // String + String
        String example4 = "Имя: " + name;

        // String + объект (вызовется toString())
        String example5 = "Значение объекта: " + numberObj;

        // Несколько разных типов подряд
        String example6 = "Игрок: " + name + ", возраст: " + age + ", играет ли: " + isActive;

        System.out.println('\n');
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
        System.out.println(example4);
        System.out.println(example5);
        System.out.println(example6);
    }
}
