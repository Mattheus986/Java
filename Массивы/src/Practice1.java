public class Practice1 {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        System.out.println();
        System.out.println("До присваивания:");
        System.out.println("a1 = " + java.util.Arrays.toString(a1));
        System.out.println("a2 = " + java.util.Arrays.toString(a2));

        // Что происходит при a1 = a2?
        a1 = a2;  // a1 теперь ссылается на тот же массив, что и a2

        System.out.println("\nПосле a1 = a2:");
        System.out.println("a1 = " + java.util.Arrays.toString(a1));
        System.out.println("a2 = " + java.util.Arrays.toString(a2));

    }
}
/*
    Что происходит: a1 = a2; — копируется ссылка, а не массив
Теперь a1 и a2 указывают на один и тот же массив {6, 7, 8, 9, 10}
Исходный массив {1, 2, 3, 4, 5} больше не имеет ссылок и будет удален сборщиком мусора
*/