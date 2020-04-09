/*public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        // Создаём экземпляр класса SimpleDotCom
        SimpleDotCom dot = new SimpleDotCom();

        // Создаём массив для местоположения "сайта"(три последовательных числа из семи)
        int[] locations = {2, 3, 4};

        // Вызываем сеттер "сайта"
        dot.setLocationCells(locations);

        // Делаем ход от имени пользователя
        String userGuess = "2";

        // Вызываем метод checkYourSelf() обьекта SimpleDotCom
        String result = dot.checkYourself(userGuess);

        String testResult = "Неудача";

        if (result.equals("Попал")) {
            // Если ход (2) возвращает строку "Попал", значит всё работает
            testResult = "Пройден";
        }

        System.out.println(testResult);
    }
    // Получаем ход пользователя в виде строкового параметра
    public String checkYourself(String stringGuess) {
        // Преобразовываем тип String в int
        int guess = Integer.parseInt(stringGuess);
        // Создаём переменную для хранения результата, который будем возвращать. Присваиваем по умолчанию строковое
        // значение "Мимо"
        String result = "Мимо";

        //Повторяем с каждой ячейкой из массива locationCells(местоположение ячейки обьекта)
        for (int cell : locationCells) {
            // Сравниваем ход пользователя с этим элементом (ячейкой) массива
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                // Выбираемся из цикла: другие ячейки проверять не нужно
                break;
            }
        }
        // Мы вышли из цикла, но посмотрим, не потопили ли нас(3 попадания), и при необходимости изменим результат на
        // "Потопил"
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        // Выводим пользователю результат ("Мимо", если он не был изменен на "Попал" или "Потопил")
        System.out.println(result);
        return result;
    }
}
*/