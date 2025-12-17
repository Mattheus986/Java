public class Practice2 {
    public static void main(String[] args) {
        System.out.println();


        // разные значения
        testSwitch(1);  // value = 1
        testSwitch(2);  // value = 2
        testSwitch(3);  // value = 3
        testSwitch(4);  // value = 4

        System.out.println("\nобъяснение:");
        System.out.println(" ");
        System.out.println("При value = 2:");
        System.out.println("- Выполняется case 2: i = 2");
        System.out.println("- break отсутствует, поэтому выполнение 'проваливается' в case 3");
        System.out.println("- Выполняется case 3: i = 3 (перезаписывает предыдущее значение i = 2)");
        System.out.println("- Встречается break в case 3, выполнение switch завершается");
        System.out.println("Итог: i = 3 (хотя value было равно 2)");
    }

    public static void testSwitch(int value) {
        int i = 0;

        switch(value) {
            case 1:
                i = 1;
                break;  // есть break - выход из switch
            case 2:
                i = 2;  // НЕТ break - выполнение продолжится в следующем case!
            case 3:
                i = 3;  // выполнится и для value=2, и для value=3
                break;
            default:
                i = 4;
                break;
        }

        System.out.println("value = " + value + " -> i = " + i);
    }
}

/*

*/