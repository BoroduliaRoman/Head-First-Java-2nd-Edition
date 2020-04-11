public class Hippo1 extends Animal1{
    // Конструктор Hippo1 принимает имя
    public Hippo1(String name) {
        // Он передаёт имя вверх по стеку в конструктор Animal
        super(name);
    }
}
