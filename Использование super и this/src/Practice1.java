class Player {
    protected String name;
    protected int number;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    protected void showInfo() {
        System.out.println();
        System.out.println("Игрок: " + name + ", номер: " + number);
    }
}

class FootballPlayer extends Player {
    private String position;

    public FootballPlayer(String name, int number, String position) {
        super(name, number);  // 1. Вызов конструктора суперкласса

        this.position = position;
    }

    public void display() {
        super.showInfo();  // 2. Вызов метода суперкласса

        System.out.println("Позиция: " + position);
        System.out.println("Унаследованное имя: " + super.name);  // 3. Доступ к полю суперкласса
    }
}

public class Practice1 {
    public static void main(String[] args) {
        FootballPlayer player = new FootballPlayer("Месси", 10, "нападающий");
        player.display();
    }
}