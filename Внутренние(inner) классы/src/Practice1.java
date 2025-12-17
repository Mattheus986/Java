class FootballTeam {
    private String team = "Барселона";

    public class Player {
        public void play() {
            System.out.println("Игрок играет за " + team);
        }
    }

    private class Coach {
        public void train() {
            System.out.println("Тренер тренирует " + team);
        }
    }

    protected class Doctor {
        public void heal() {
            System.out.println("Врач лечит " + team);
        }
    }

    class Manager {
        public void manage() {
            System.out.println("Менеджер управляет " + team);
        }
    }

    public void createTeam() {
        Player p = new Player();
        p.play();

        Coach c = new Coach();
        c.train();

        Doctor d = new Doctor();
        d.heal();

        Manager m = new Manager();
        m.manage();
    }
}

class YouthTeam extends FootballTeam {
    public void test() {
        Doctor d = new Doctor();
        d.heal();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();

        FootballTeam.Player p = team.new Player();
        p.play();

        // FootballTeam.Coach c = team.new Coach(); // Ошибка: private

        // FootballTeam.Doctor d = team.new Doctor(); // Ошибка: protected (в другом классе)

        FootballTeam.Manager m = team.new Manager();
        m.manage();

        team.createTeam();
    }
}

/*
    public - можно создать из любого класса: team.new Player()

private - нельзя создать извне, только внутри FootballTeam

protected - можно создать внутри FootballTeam, в наследниках (YouthTeam) и классах того же пакета

без cпецификатора - можно создать только внутри FootballTeam и классах того же пакета
*/