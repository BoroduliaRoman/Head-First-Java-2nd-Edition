public class MyAnimalList {
    // Внутри используем обычный массив обьектов Dog
    private Animal [] animals = new Animal[5];
    // Мы будем увеличивать его при каждом добавлении обьекта Dog
    private int nextIndex = 0;

    public void add(Animal a) {
        // Если мы ещё не дошли до предела массива, то добавляем обьект Dog и выводим сообщение
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal добавлен в ячейку " + nextIndex);
            // Увеличиваем индекс для доступа к следующей ячейке
            nextIndex++;
        }
    }
}
