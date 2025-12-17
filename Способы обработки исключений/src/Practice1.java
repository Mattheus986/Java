public class Practice1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;  // ArrayIndexOutOfBoundsException - перехват
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехватили: выход за границы массива");
        }

        String str = null;
        System.out.println(str.length());  // NullPointerException - ошибка
    }
}