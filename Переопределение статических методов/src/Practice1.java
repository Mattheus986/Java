class FootballTeam {
    public static void showTrophy() {
        System.out.println("У команды есть трофеи");
    }

    public void playMatch() {
        System.out.println("Команда играет матч");
    }
}

class RealMadrid extends FootballTeam {
    public static void showTrophy() {
        System.out.println("У Реала 15 кубков Лиги Чемпионов");
    }

    @Override
    public void playMatch() {
        System.out.println("Реал играет в белой форме");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        FootballTeam team1 = new FootballTeam();
        FootballTeam team2 = new RealMadrid(); // Полиморфизм
        RealMadrid real = new RealMadrid();

        System.out.println("1. Обычные методы ( полиморфизм)");
        team1.playMatch();
        team2.playMatch();  // полиморфизм

        System.out.println("\n2. Статические методы (нет полиморфизма)");
        team1.showTrophy();
        team2.showTrophy();  //нет полиморфизма
        real.showTrophy();
    }
}