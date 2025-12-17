class FootballTeam {
    class Player {
        public String publicField = "публичное поле игрока";
        protected String protectedField = "защищённое поле игрока";
        String defaultField = "поле игрока по умолчанию";
        private String privateField = "приватное поле игрока";

        public void publicMethod() {
            System.out.println("публичный метод игрока");
        }

        protected void protectedMethod() {
            System.out.println("защищённый метод игрока");
        }

        void defaultMethod() {
            System.out.println("метод игрока по умолчанию");
        }

        private void privateMethod() {
            System.out.println("приватный метод игрока");
        }
    }

    void accessTest() {
        Player player = new Player();

        System.out.println(player.publicField);
        System.out.println(player.protectedField);
        System.out.println(player.defaultField);
        System.out.println(player.privateField); //ошибка

        player.publicMethod();
        player.protectedMethod();
        player.defaultMethod();
        player.privateMethod();// ошибка
    }
}

public class Practice3 {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();
        team.accessTest();
    }
}

/*
Внешний класс имеет доступ к полям и методам внутреннего класса,
 но соблюдает правила спецификаторов доступа:

public, protected, default - доступны

private - не доступны
*/