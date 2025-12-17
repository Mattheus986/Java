public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Примеры перегрузки и переопределения методов в футболе\n");

        TeamManager manager = new TeamManager();

        System.out.println("1. Перегрузка методов (команда менеджера):");
        System.out.println("Количество игроков в стартовом составе: " + manager.selectPlayers(11));
        System.out.println("Количество игроков с учетом замен: " + manager.selectPlayers(11, 7));
        System.out.println("Формирование состава: " + manager.selectPlayers("4-3-3"));
        System.out.println("Формирование состава с капитаном: " + manager.selectPlayers("4-4-2", "Иванов"));

        System.out.println("\n2. Переопределение методов (типы игроков):");

        FootballPlayer player = new FootballPlayer();
        player.training();
        player.play();

        Forward forward = new Forward();
        forward.training();
        forward.play();
        forward.scoreGoal();

        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.training();
        goalkeeper.play();


        System.out.println("\n3. Перегрузка методов ударов по воротам:");
        Striker striker = new Striker();
        striker.shoot();
        striker.shoot(30);
        striker.shoot("левый верхний угол");
        striker.shoot(25, "правый нижний угол");

        System.out.println("\n4. Переопределение с вызовом родительского метода:");
        forward.warmUp();
        goalkeeper.warmUp();

        System.out.println("\n5. Перегрузка передачи мяча:");
        Playmaker playmaker = new Playmaker();
        playmaker.pass("короткая передака");
        playmaker.pass(40);
        playmaker.pass("навес", "нападающий");
    }
}

class TeamManager {
    public int selectPlayers(int playersCount) {
        System.out.println("Выбрано " + playersCount + " игроков в стартовый состав");
        return playersCount;
    }

    public int selectPlayers(int mainPlayers, int substitutes) {
        int total = mainPlayers + substitutes;
        System.out.println("Выбрано " + mainPlayers + " основных и " + substitutes + " запасных игроков");
        return total;
    }

    public String selectPlayers(String formation) {
        System.out.println("Сформирован состав по схеме " + formation);
        return "Состав: " + formation;
    }

    public String selectPlayers(String formation, String captain) {
        System.out.println("Сформирован состав по схеме " + formation + ", капитан: " + captain);
        return "Состав: " + formation + ", капитан: " + captain;
    }
}

class FootballPlayer {
    public void training() {
        System.out.println("Футболист проводит общую тренировку");
    }

    public void play() {
        System.out.println("Футболист выходит на поле");
    }

    public void warmUp() {
        System.out.println("Футболист разминается перед матчем");
    }

    public void rest() {
        System.out.println("Футболист отдыхает");
    }
}

class Forward extends FootballPlayer {
    @Override
    public void training() {
        System.out.println("Нападающий отрабатывает удары по воротам");
    }

    @Override
    public void play() {
        System.out.println("Нападающий атакует ворота соперника");
    }

    @Override
    public void warmUp() {
        super.warmUp();
        System.out.println("Нападающий дополнительно разминает ноги для ударов");
    }

    public void scoreGoal() {
        System.out.println("Нападающий забивает гол!");
    }

    public void dribble() {
        System.out.println("Нападающий обыгрывает защитника");
    }
}

class Goalkeeper extends FootballPlayer {
    @Override
    public void training() {
        System.out.println("Вратарь отрабатывает прием мяча");
    }

    @Override
    public void play() {
        System.out.println("Вратарь защищает ворота");
    }

    @Override
    public void warmUp() {
        super.warmUp();
        System.out.println("Вратарь разминает руки для ловли мячей");
    }

    public void save() {
        System.out.println("Вратарь совершает сейв!");
    }

    public void organizeDefense() {
        System.out.println("Вратарь организует защиту");
    }
}

class Midfielder extends FootballPlayer {
    @Override
    public void training() {
        System.out.println("Полузащитник отрабатывает передачи");
    }

    @Override
    public void play() {
        System.out.println("Полузащитник контролирует центр поля");
    }

    public void createChance() {
        System.out.println("Полузащитник создает голевой момент");
    }
}

class Striker {
    public void shoot() {
        System.out.println("Бьем по воротам стандартным ударом");
    }

    public void shoot(int power) {
        System.out.println("Бьем по воротам с силой " + power + "%");
    }

    public void shoot(String direction) {
        System.out.println("Бьем по воротам в " + direction);
    }

    public void shoot(int power, String direction) {
        System.out.println("Бьем по воротам с силой " + power + "% в " + direction);
    }
}

class Playmaker {
    public void pass(String type) {
        System.out.println("Отдает " + type);
    }

    public void pass(int distance) {
        System.out.println("Отдает передачу на " + distance + " метров");
    }

    public void pass(String type, String target) {
        System.out.println("Отдает " + type + " на " + target);
    }
}