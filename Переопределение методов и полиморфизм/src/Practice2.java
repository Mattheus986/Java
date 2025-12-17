class Player {
    public void play() {
        System.out.println("Игрок участвует в матче");
    }

    public String getPosition() {
        return "Неопределённая позиция";
    }
}

class Forward extends Player {
    @Override
    public void play() {
        System.out.println("Нападающий забивает голы");
    }

    /*
        @Override
     public int getPosition() {
         return 1;
    }
    */


}

public class Practice2 {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        System.out.println("Позиция: " + player.getPosition());

        System.out.println();

        Forward forward = new Forward();
        forward.play();
        System.out.println("Позиция: " + forward.getPosition());

        System.out.println();

        Player poly = new Forward();
        poly.play(); // Вызывается переопределённый метод из Forward
    }
}

/*
    Если у переопределённого метода будет другой тип возвращаемого значения,
    не как у метода в суперклассе, то случится ошибка компиляции.
*/