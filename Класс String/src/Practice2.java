import java.util.StringJoiner;

public class Practice2 {
    public static void main(String[] args) {
        StringJoiner team = new StringJoiner(", ", "Команда: ", "!");
        team.add("Месси");
        team.add("Роналду");
        team.add("Неймар");

        System.out.println(team.toString());
    }
}