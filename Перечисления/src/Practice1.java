// Перечисление с футболистами
enum FootballPlayer {
    // Инициализация элементов с параметрами: имя, номер, позиция, клуб
    MESSI("Лионель Месси", 10, "Нападающий", "Интер Майами"),
    RONALDO("Криштиану Роналду", 7, "Нападающий", "Аль-Наср"),
    NEYMAR("Неймар", 10, "Нападающий", "Сантос"),
    MBAPPE("Килиан Мбаппе", 7, "Нападающий", "Реал Мадрид"),
    MODRIC("Лука Модрич", 14, "Полузащитник", "Милан"),
    DE_BRUYNE("Кевин Де Брюйне", 17, "Полузащитник", "Манчестер Сити"),
    VAN_DIJK("Вирджил ван Дейк", 4, "Защитник", "Ливерпуль"),
    NEUER("Мануэль Нойер", 1, "Вратарь", "Бавария");


    private final String fullName;
    private final int number;
    private final String position;
    private final String club;


    FootballPlayer(String fullName, int number, String position, String club) {
        this.fullName = fullName;
        this.number = number;
        this.position = position;
        this.club = club;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getClub() {
        return club;
    }

    public String getPlayerInfo() {
        return fullName + " (#" + number + ") - " + position + ", " + club;
    }


    public boolean playsInLeague(String league) {
        if (league.equals("Англия") &&
            (club.equals("Манчестер Сити") || club.equals("Ливерпуль"))) {
            return true;
        } else if (league.equals("Испания") &&
                   (club.equals("Реал Мадрид") || club.equals("Барселона"))) {
            return true;
        } else if (league.equals("Германия") && club.equals("Бавария")) {
            return true;
        } else if (league.equals("Саудовская Аравия") &&
                   (club.equals("Ан-Наср") || club.equals("Аль-Хиляль"))) {
            return true;
        } else if (league.equals("США") && club.equals("Интер Майами")) {
            return true;
        }
        return false;
    }


    public static FootballPlayer findByNumber(int number) {
        for (FootballPlayer player : values()) {
            if (player.getNumber() == number) {
                return player;
            }
        }
        return null;
    }
}


enum FootballClub {
    // Инициализация: название, страна, год основания
    REAL_MADRID("Реал Мадрид", "Испания", 1902),
    BARCELONA("Барселона", "Испания", 1899),
    MANCHESTER_CITY("Манчестер Сити", "Англия", 1880),
    LIVERPOOL("Ливерпуль", "Англия", 1892),
    BAYERN("Бавария", "Германия", 1900),
    INTER_MIAMI("Интер Майами", "США", 2018);

    private final String name;
    private final String country;
    private final int foundedYear;

    FootballClub(String name, String country, int foundedYear) {
        this.name = name;
        this.country = country;
        this.foundedYear = foundedYear;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public int getAge(int currentYear) {
        return currentYear - foundedYear;
    }
}

// Главный класс для демонстрации
public class Practice1{
    public static void main(String[] args) {
        System.out.println("ИНФОРМАЦИЯ О ФУТБОЛИСТАХ");

        // Вывод информации обо всех футболистах
        for (FootballPlayer player : FootballPlayer.values()) {
            System.out.println(player.getPlayerInfo());
        }

        System.out.println("\nПОИСК ИГРОКОВ");

        // Поиск игрока по номеру
        FootballPlayer playerByNumber = FootballPlayer.findByNumber(10);
        if (playerByNumber != null) {
            System.out.println("Игрок с номером 10: " + playerByNumber.getFullName());
        }

        // Использование switch с перечислением
        System.out.println("\n=== ЛУЧШИЕ ИГРОКИ ПО ПОЗИЦИЯМ ===");
        FootballPlayer bestPlayer = FootballPlayer.MESSI;

        switch (bestPlayer) {
            case MESSI:
                System.out.println("Лучший нападающий: " + bestPlayer.getFullName());
                System.out.println("Клуб: " + bestPlayer.getClub());
                break;
            case MODRIC:
                System.out.println("Лучший полузащитник: " + bestPlayer.getFullName());
                break;
            case VAN_DIJK:
                System.out.println("Лучший защитник: " + bestPlayer.getFullName());
                break;
            case NEUER:
                System.out.println("Лучший вратарь: " + bestPlayer.getFullName());
                break;
        }

        System.out.println("\nИГРОКИ ПО КЛУБАМ");
        // Проверка в каких лигах играют футболисты
        String[] leagues = {"Англия", "Испания", "Германия", "Саудовская Аравия", "США"};

        for (String league : leagues) {
            System.out.println("\nИгроки в лиге " + league + ":");
            for (FootballPlayer player : FootballPlayer.values()) {
                if (player.playsInLeague(league)) {
                    System.out.println("  - " + player.getFullName() + " (" + player.getClub() + ")");
                }
            }
        }

        System.out.println("\nИНФОРМАЦИЯ О КЛУБАХ");

        int currentYear = 2024;
        for (FootballClub club : FootballClub.values()) {
            System.out.println(club.getName() + " (" + club.getCountry() +
                             ") - основан в " + club.getFoundedYear() +
                             " году (" + club.getAge(currentYear) + " лет)");
        }

        System.out.println("\nИГРОКИ РЕАЛ МАДРИД");
        for (FootballPlayer player : FootballPlayer.values()) {
            if (player.getClub().equals("Реал Мадрид")) {
                System.out.println(player.getFullName() + " - " + player.getPosition());
            }
        }
    }
}