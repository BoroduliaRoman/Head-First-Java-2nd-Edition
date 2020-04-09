import java.util.*;
public class DotComBust {
    // Обьявляем и инициализируем переменный, которые нам понадобятся
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    // Создаём 3 обьекта DotCom, даём им имена и помещаем в ArrayList
    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        // Выводим краткие инструкции для пользователя
        System.out.println("Ваша цель - потопить три 'сайта',");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        // Повторяем с каждым обьектом DotCom в списке
        for (DotCom dotComToSet : dotComList) {
            // Запрашиваем у вспомогательного обьекта адрес "сайта"
            ArrayList<String> newLocation = helper.placeDotCom(3);
            // Вызываем сеттер из обьекта DotCom, чтобы передать ему местоположение, которое только что получили от
            // вспомогательного обьекта
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying() {
        // До тех пор, пока список обьектов DotCom не станет пустым
        while (!dotComList.isEmpty()) {
            // Получаем пользовательский ввод
            String userGuess = helper.getUserInput("Сделайте ход");
            // Вызываем наш метод checkUserGuess
            checkUserGuess(userGuess);
        }
        // Вызываем наш метод finishGame
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        // Инкрементируем количество попыток, которые сделал пользователь
        numOfGuesses++;
        // Подразумеваем промах, пока не выяснили обратного
        String result = "Мимо";
        // Повторяем это для всех обьектов DotCom в списке
        for (DotCom dotComToTest : dotComList) {
            // Просим DotCom проверить ход пользователя, ищем попадание (или потопление)
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                // Выбираемся из цикла раньше времени, нет смысла проверять другие "сайты"
                break;
            }
            if (result.equals("Потопил")) {
                // Ему пришел конец, так что удаляем его из списка "сайтов" и выходим из цикла
                dotComList.remove(dotComToTest);
                break;
            }
        }
        // Выводим для пользователя результат
        System.out.println(result);
    }

    // Выводим сообщение о том, как пользователь прошел игру
    private void finishGame() {
        System.out.println("Все 'сайты' ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + "попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        // Создаём игровой обьект
        DotComBust game = new DotComBust();
        // Говорис игровому обьекту приготовить игру
        game.setUpGame();
        // Говорим игровому обьекту начать главный игровой цикл(продолжаем запрашивать пользовательский ввод и
        // проверять полученные данные)
        game.startPlaying();
    }
}
