public abstract class Animal1 {
    // Все потомки Animal(включая их дочерние классы) имеют имя
    private String name;

    // Геттер, который унаследовал Hippo1
    public String getName() {
        return name;
    }

    // Конструктор, который принимает имя и присваивает его переменной экземпляра name
    public Animal1(String theName) {
        name = theName;
    }
}
