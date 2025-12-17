final class ChampionsLeague {
    private String winner;

    public ChampionsLeague(String winner) {
        this.winner = winner;
    }

    public void showWinner() {
        System.out.println("Победитель Лиги Чемпионов: " + winner);
    }
}

// здесь ошибка компиляции:
 class SuperLeague extends ChampionsLeague {
     public SuperLeague(String winner) {
         super(winner);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        ChampionsLeague cl = new ChampionsLeague("Реал Мадрид");
        cl.showWinner();

        // Нельзя создать наследника от final класса ChampionsLeague
    }
}