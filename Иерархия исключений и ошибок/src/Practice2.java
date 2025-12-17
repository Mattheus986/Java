public class Practice2 {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }

        // IllegalArgumentException
        try {
            if (args.length < 1) {
                throw new IllegalArgumentException("Нет аргументов");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный аргумент");
        }

        // ClassCastException
        try {
            Object obj = "String";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Ошибка приведения типа");
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Обращение к null");
        }
    }
}