import java.io.*;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        OutputStream stream = new ByteArrayOutputStream();

        stream.write(82);  // R
        stream.write(101); // e
        stream.write(97);  // a
        stream.write(108); // l

        System.out.println(stream.toString());
        stream.close();
    }
}