class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Practice1 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Одинаковая обработка");
        }

        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Ex3");
        } catch (Ex2 e) {
            System.out.println("Ex2");
        } catch (Ex1 e) {
            System.out.println("Ex1");
        }
    }
}