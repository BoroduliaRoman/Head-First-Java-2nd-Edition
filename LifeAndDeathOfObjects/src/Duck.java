public class Duck {
    int size;

    public Duck(int duckSize) { // Добавляем в конструктор Duck параметр типа int
        // Код конструктора
        System.out.println("Кря");
        // Используем значение аргумента для инициализации size
        size = duckSize;

        System.out.println("Размер равен " + size);
    }
}

