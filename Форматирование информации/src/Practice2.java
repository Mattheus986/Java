import java.io.*;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("team.txt");
        writer.write("Real Madrid");
        writer.flush();
        writer.write(" Barcelona");
        writer.close();
    }
}