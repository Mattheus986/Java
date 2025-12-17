class FootballTeam {
    public String publicField = "публичное";
    protected String protectedField = "защищённое";
    String defaultField = "по умолчанию";
    private String privateField = "приватное";

    public void publicMethod() {
        System.out.println("публичный метод");
    }

    protected void protectedMethod() {
        System.out.println("защищённый метод");
    }

    void defaultMethod() {
        System.out.println("метод по умолчанию");
    }

    private void privateMethod() {
        System.out.println("приватный метод");
    }

    class Player {
        void showAccess() {
            System.out.println(publicField);
            System.out.println(protectedField);
            System.out.println(defaultField);
            System.out.println(privateField);

            publicMethod();
            protectedMethod();
            defaultMethod();
            privateMethod();
        }
    }
}

public class Practice2 {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();
        FootballTeam.Player player = team.new Player();
        player.showAccess();
    }
}

/*
    Внутренний класс имеет доступ ко ВСЕМ полям и методам внешнего класса,
    4 независимо от их спецификаторов доступа

*/