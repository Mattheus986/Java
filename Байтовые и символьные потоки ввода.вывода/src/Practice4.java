import java.io.*;

public class Practice4 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("team.txt")) {
            writer.write("Real Madrid");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}