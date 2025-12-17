import java.util.Scanner;

public class vvod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        System.out.println();
        System.out.print("Введите имя: ");
        String name = scan.nextLine();   // считываем имя

        System.out.println("Привет, " + name);
        scan.close();
    }
}
