public class Practice3 {
    public static void main(String[] args) {

        Integer i = null;

        try {
            // Попытка автораспаковки null в  int
            int j = i; // Здесь будет выброшено NullPointerException
            System.out.println(j);
        } catch (NullPointerException e) {
            System.out.println();
            System.out.println("Ошибка: NullPointerException при автораспаковке!");
            System.out.println("Нельзя распаковать null в примитивный тип.");
        }
    }
}