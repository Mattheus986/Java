import java.io.*;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        byte[] data = {65, 66, 67, 68};
        InputStream stream = new ByteArrayInputStream(data);

        int byteRead;
        while ((byteRead = stream.read()) != -1) {
            System.out.print((char) byteRead);
        }
        stream.close();
    }
}