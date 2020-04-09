import java.util.ArrayList;
public class DotCom {
    // Изменяем строковый массив на ArrayList, чтобы хранить обьекты String
    private ArrayList<String> locationCells;
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
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
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
