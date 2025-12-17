interface Attacker {
    default void play() {
        System.out.println("Атака");
    }
}

interface Defender {
    default void play() {
        System.out.println("Защита");
    }
}

class Player implements Attacker, Defender {
    @Override
    public void play() {
        Attacker.super.play();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
    }
}