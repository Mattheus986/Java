class Team {
    public void train() {
        System.out.println("Команда тренируется");
    }

    public final void officialRules() {
        System.out.println("Официальные правила FIFA неизменны");
    }
}

class YouthTeam extends Team {
    @Override
    public void train() {
        System.out.println("Молодёжная команда тренируется по спецпрограмме");
    }

    // здесь будет ошибка компиляции:
     @Override
     public void officialRules() {
         System.out.println("Пытаюсь изменить правила");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        YouthTeam team = new YouthTeam();
        team.train();
        team.officialRules();
    }
}