// Четыре разный конструктора - четыре способа создать новый обьект Mushroom
public class Mushroom {
    // Если вы знаете размер, но не уверены на счёт волшебства
    public Mushroom(int size){}
    // Если вам вообще ничего не известно
    public Mushroom() {}
    // Если у вас есть информация о волшебстве , но вам ничего не известно о размере
    public Mushroom(boolean isMagic){}
    // Если у вас есть сведения и о размере, и о волшебстве
    public Mushroom(boolean isMagic, int size) {}
    public Mushroom(int size, boolean isMagic) {}
}
