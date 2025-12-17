public class Practice1 {
    final static int START_COUNTER;
    static {
        START_COUNTER = Integer.parseInt("Y-");  // NumberFormatException здесь
    }
    public static void main(String[] args) {
        System.out.println("Hello");  // Этот код никогда не выполнится
    }
}

// Произойдёт ошибка во время инициализации класса. Код не выполнится и программа не запустится.