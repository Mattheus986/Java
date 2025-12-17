public class Practice3 {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
        } finally {
            System.out.println("Finally 1");
        }
        finally {
             System.out.println("Finally 2");
        }
    }
}
// нет, нельзя