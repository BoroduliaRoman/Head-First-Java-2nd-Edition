// Значения по умолчанию для обьявленных, но не инициализированных статических и обычных переменных ничем не отличаются
public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Тайгер Вудс");
        // Доступ к статической переменной получают так же, как и к статическому методу - через имя класса
        System.out.println(Player.playerCount);
    }
}

class Player {
    static int playerCount = 0;
    private String name;
    // Переменная playerCount инициализируется при загрузке класса. Мы явно присваиваем ей значение 0, но это
    // необязательно, так как 0 - значение по умолчанию для переменный типа int. Статические переменные получают
    // значения по умолчанию так же, как обычные
    public Player(String n) {
        name = n;
        playerCount++;
    }
}