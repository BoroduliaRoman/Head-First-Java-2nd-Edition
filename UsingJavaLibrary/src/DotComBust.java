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
        DotCom.setName("Go2.com");
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
}
