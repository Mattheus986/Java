class FootballPlayer {
    private String name;
    private int number;
    private String club;

    public FootballPlayer(String name, int number, String club) {
        this.name = name;
        this.number = number;
        this.club = club;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на равенство ссылок
        if (this == obj) return true;

        // 2. Проверка на null
        if (obj == null) return false;

        // 3. Проверка типа классов
        if (getClass() != obj.getClass()) return false;

        // 4. Приведение типа
        FootballPlayer other = (FootballPlayer) obj;

        // 5. Сравнение полей
        if (number != other.number) return false;

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        if (club == null) {
            if (other.club != null) return false;
        } else if (!club.equals(other.club)) return false;

        return true;
    }
}

public class Practice1{
    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer("Месси", 10, "Интер Майами");
        FootballPlayer player2 = new FootballPlayer("Холланд", 9, "Манчестер Сити");
        FootballPlayer player3 = new FootballPlayer("Роналду", 7, "Ювентус");

        System.out.println("player1.equals(player2): " + player1.equals(player2)); // true
        System.out.println("player1.equals(player3): " + player1.equals(player3)); // false
        System.out.println("player1.equals(null): " + player1.equals(null));      // false
        System.out.println("player1.equals(\"строка\"): " + player1.equals("строка")); // false
    }
}

/*  Соглашения:
    Рефлексивность - объект должен быть равен самому себе: x.equals(x) всегда true
Симметричность - если x.equals(y) вернет true, то и y.equals(x) должно вернуть true
Транзитивность - если x.equals(y) и y.equals(z) оба true, то и x.equals(z) должно быть true
Консистентность - при многократных вызовах equals() с неизменными объектами должен возвращаться одинаковый результат
Неравенство с null - x.equals(null) всегда должно возвращать false
*/