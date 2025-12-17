public class Practice1 {
    public static void main(String[] args) {
        String text = "  Real Madrid Champions  ";

        System.out.println(text.length());
        System.out.println(text.trim());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.charAt(5));
        System.out.println(text.substring(5, 11));
        System.out.println(text.replace("Madrid", "Barcelona"));
        System.out.println(text.contains("Champions"));
        System.out.println(text.startsWith("Real"));
        System.out.println(text.endsWith("Champions"));
    }
}