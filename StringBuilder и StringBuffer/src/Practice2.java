public class Practice2 {
    public static void main(String[] args) {
        String str = "Football";

        StringBuilder sb1 = new StringBuilder(str);

        StringBuffer buffer1 = new StringBuffer(str);

        String strFromBuilder = sb1.toString();

        String strFromBuffer = buffer1.toString();

        StringBuilder sb2 = new StringBuilder(buffer1.toString());

        StringBuffer buffer2 = new StringBuffer(sb1.toString());
    }
}