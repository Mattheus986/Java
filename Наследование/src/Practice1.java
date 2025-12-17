class FootballPlayer {
    protected String name;
    protected int number;

    public FootballPlayer(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void train() {
        System.out.println(name + " выполняет базовую тренировку");
    }

    public void play() {
        System.out.println("Игрок " + name + " (" + number + ") участвует в матче");
    }
}

class Forward extends FootballPlayer {
    private int goalsScored;

    public Forward(String name, int number, int goalsScored) {
        super(name, number);
        this.goalsScored = goalsScored;
    }

    @Override
    public void train() {
        super.train();
        System.out.println(this.name + " дополнительно тренирует удары");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(this.name + " забивает гол! Всего голов: " + this.goalsScored);
    }

    public void celebrate() {
        System.out.println(super.name + " празднует гол!");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        FootballPlayer defender = new FootballPlayer("Рамос", 4);
        defender.train();
        defender.play();

        System.out.println();

        Forward forward = new Forward("Месси", 10, 45);
        forward.train();
        forward.play();
        forward.celebrate();
    }
}

/*

super используется для работы с родительским классом,
this - для работы с текущим объектом.

- this - ссылка на текущий объект (this.name = поле этого объекта)
- super - ссылка на родительский класс
(super() = конструктор родителя, super.метод() = метод родителя)
*/