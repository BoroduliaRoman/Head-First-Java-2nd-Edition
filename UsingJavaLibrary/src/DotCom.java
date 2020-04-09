import java.util.ArrayList;
public class DotCom {
    // Изменяем строковый массив на ArrayList, чтобы хранить обьекты String
    private ArrayList<String> locationCells;
    private String name;

    // Сеттер, который обновляет местоположение "сайта"(случайный адрес, предоставляемый методом placeDotCom() из
    // класса GameHelper)
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    // Новое и усовершенствованное имя аргумента
    public String checkYourself(String userInput) {
        String result = "Мимо";
        // Проверяем, содержится ли загаданная пользователем ячейка внутри ArrayList, запрашивая её индекс.
        // Если её нет в списке, то indexOf() возвращает -1
        int index = locationCells.indexOf(userInput);
        // Если индекс больше или равен нулю, то загаданная пользователем ячейка определённо находится в списке,
        // поэтому удаляем её
        if (index >= 0) {
            locationCells.remove(index);
            // Если список пустой, значит, это было роковое попадание!
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name + " : ( ");
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
