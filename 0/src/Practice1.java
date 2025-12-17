/*
 Принцип подстановки Лисков:
 Любой объект подкласса должен быть взаимозаменяем с объектом родительского класса
 без нарушения работы программы.
 Иными словами: если метод работает с объектом родительского класса, он должен
 корректно работать с объектом любого подкласса.

 Нарушение LSP происходит, когда подкласс, например, дает исключение там,
 где родительский класс этого не делает.
 */


// Родительский класс
class TopFootballClub {
    public void playNationalLeague() {
        System.out.println("Топовый футбольный клуб играет в национальном чемпионате.");
    }

    public void playChampionsLeague() {
        System.out.println("Топовый футбольный клуб играет в Лиге Чемпионов.");
    }
}

// Подкласс — Барселона
class Barcelona extends TopFootballClub {
    @Override
    public void playNationalLeague() {
        System.out.println("Барселона играет в испанской Ла Лиге.");
    }
    // playChampionsLeague() наследуется без изменений
}

// Подкласс — Манчестер Юнайтед
class ManchesterUnited extends TopFootballClub {
    @Override
    public void playNationalLeague() {
        System.out.println("Манчестер Юнайтед играет в английской Премьер-Лиге.");
    }
    // playChampionsLeague() наследуется без изменений
}

// Подкласс — Милан (нарушает принцип подстановки Лисков)
class Milan extends TopFootballClub {
    @Override
    public void playNationalLeague() {
        System.out.println("Милан играет в итальянской Серии А.");
    }

    @Override
    public void playChampionsLeague() {
        throw new UnsupportedOperationException("Милан не участвует в Лиге Чемпионов!");
    }
}

public class Main {
    public static void main(String[] args) {

        TopFootballClub club1 = new Barcelona();
        TopFootballClub club2 = new ManchesterUnited();
        TopFootballClub club3 = new Milan();

        // Все клубы вызываем одинаково
        club1.playNationalLeague();
        club1.playChampionsLeague();

        club2.playNationalLeague();
        club2.playChampionsLeague();

        club3.playNationalLeague();
        /*
        Здесь произойдет ошибка из-за нарушения принципа подстановки Лисков,
        т.к. Милан не участвует в Лиге чемпионов,
        хотя является подклассом класса TopFootballClub
         */
        club3.playChampionsLeague();
    }
}
