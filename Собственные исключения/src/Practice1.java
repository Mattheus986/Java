class FootballException extends Exception {
    public FootballException() {
        super();
    }

    public FootballException(String message) {
        super(message);
    }

    public FootballException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        try {
            throw new FootballException("Ошибка в футбольном матче");
        } catch (FootballException e) {
            System.out.println(e.getMessage());
        }
    }
}