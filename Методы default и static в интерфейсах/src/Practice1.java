interface FootballPlayer {
    default void train() {
        System.out.println("Игрок тренируется");
    }

    static void showRules() {
        System.out.println("Правила футбола");
    }
}

class Forward implements FootballPlayer {
}

public class Practice1 {
    public static void main(String[] args) {
        Forward player = new Forward();
        player.train();

        FootballPlayer.showRules();
    }
}