public class Practice1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Football");

        sb.append(" Champions");
        System.out.println(sb);

        sb.insert(8, " ");
        System.out.println(sb);

        sb.replace(9, 18, "League");
        System.out.println(sb);

        sb.delete(9, 15);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(5));

        System.out.println(sb.length());

        System.out.println(sb.capacity());

        sb.setCharAt(0, 'f');
        System.out.println(sb);

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        StringBuffer buffer = new StringBuffer("Real");
        buffer.append(" Madrid");
        System.out.println(buffer);
    }
}