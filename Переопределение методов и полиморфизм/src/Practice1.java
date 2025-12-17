class FootballPlayer {

    // Тренировка
    public void train() {
        System.out.println("Игрок выполняет общую тренировку");
    }

    // Тренировка с указанием времени
    public void train(int minutes) {
        System.out.println("Игрок тренируется " + minutes + " минут");
    }

    // Тренировка с указанием упражнения
    public void train(String exercise) {
        System.out.println("Игрок выполняет упражнение: " + exercise);
    }

    // Тренировка с указанием упражнения и времени
    public void train(String exercise, int minutes) {
        System.out.println("Игрок выполняет " + exercise + " в течение " + minutes + " минут");
    }

    // Тренировка с указанием упражнения, времени и повторений
    public void train(String exercise, int minutes, int repetitions) {
        System.out.println("Игрок делает " + exercise + " " + repetitions +
                         " раз за " + minutes + " минут");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        FootballPlayer player = new FootballPlayer();
        System.out.println();
        player.train();
        player.train(90);
        player.train("удары по воротам");
        player.train("бег с мячом", 30);
        player.train("приседания", 10, 50);
    }
}