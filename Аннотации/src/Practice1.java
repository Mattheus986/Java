class FootballTeam {
    @Deprecated
    public void oldTrainMethod() {
        System.out.println("Старый метод тренировки");
    }

    public void newTrainMethod() {
        System.out.println("Новый метод тренировки");
    }
}

class Player extends FootballTeam {
    @Override
    public void newTrainMethod() {
        System.out.println("Переопределённый метод тренировки");
    }
}

public class Practice1 {
    @SuppressWarnings("warning")
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();
        team.oldTrainMethod();

        Player player = new Player();
        player.newTrainMethod();
    }
}

/*
    @Override - указывает, что метод переопределяет метод суперкласса. Компилятор проверяет, что такой метод действительно существует в родителе.

    @Deprecated - помечает метод/класс как устаревший. Компилятор выдаст предупреждение при его использовании.

    @SuppressWarnings - отключает предупреждения компилятора для определённого участка кода.
*/