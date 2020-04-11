public class MakeHippo {
    public static void main(String[] args) {
        // Создаём Hippo1, передаём его конструктору имя Баффи. Затем вызываем метод getName(), унаследованый слассом
        // Hippo1
        Hippo1 h = new Hippo1("Баффи");
        System.out.println(h.getName());
    }
}
