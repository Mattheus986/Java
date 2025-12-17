class FootballTeam {
    static class Trophy {
        private String name;

        public Trophy(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println();
            System.out.println("Трофей команды: " + name);
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        FootballTeam.Trophy trophy = new FootballTeam.Trophy("Кубок Чемпионов");
        trophy.show();
    }
}