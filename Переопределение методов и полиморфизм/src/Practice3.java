class FootballPlayer {
    public void playMatch() {
        System.out.println("Игрок играет матч");
    }
}

class Goalkeeper extends FootballPlayer {

    @Override
    public void playMatch() {
        System.out.println("Вратарь защищает ворота");
    }

    // Этот код не скомпилируется из-за @Override и опечатки
    @Override
     public void playmatch() { // опечатка в названии
         System.out.println("Этот метод никогда не вызовется");
     }
}

public class Practice3 {
    public static void main(String[] args) {
        Goalkeeper gk = new Goalkeeper();
        gk.playMatch();
    }
}
/*
    Аннотация @Override помогает обнаружить ошибки при переопределении методов,
    такие как опечатки в имени метода. Если по ошибке написать playmatch
    вместо playMatch и добавить @Override, компилятор сразу укажет на ошибку.
    Без этой аннотации код бы скомпилировался, но метод playmatch считался бы новым методом
    класса-потомка, а не переопределением родительского метода,
    что привело бы к ошибке в программе.
*/