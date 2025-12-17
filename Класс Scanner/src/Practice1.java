import java.io.*;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new File("team.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}