public class Practice2 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (final ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            try {
                int[] arr = new int[3];
                arr[5] = 10;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вложенный блок");
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Внешний блок");
        }
    }
}