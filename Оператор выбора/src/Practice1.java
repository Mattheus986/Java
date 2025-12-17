public class Practice1 {
    enum Day { MONDAY, TUESDAY, WEDNESDAY }

    public static void main(String[] args) {
        System.out.println();

        // 1. Целочисленные типы
        byte b = 1;
        switch(b) {
            case 1: System.out.println("byte case"); break;
        }

        short s = 10;
        switch(s) {
            case 10: System.out.println("short case"); break;
        }

        int i = 100;
        switch(i) {
            case 100: System.out.println("int case"); break;
        }

        char c = 'A';
        switch(c) {
            case 'A': System.out.println("char case"); break;
        }

        // 2. Обертки (автораспаковка)
        Integer intObj = 200;
        switch(intObj) {
            case 200: System.out.println("Integer case"); break;
        }


        Short shortObj = 10;
        switch(shortObj) {
        case 10: System.out.println("Short case"); break;
}

        Character charObj = 'B';
        switch(charObj) {
            case 'B': System.out.println("Character case"); break;
        }

        // 3. String (Java 7+)
        String str = "test";
        switch(str) {
            case "test": System.out.println("String case"); break;
        }

        // 4. Enum
        Day day = Day.MONDAY;
        switch(day) {
            case MONDAY: System.out.println("Enum case"); break;
        }
    }
}