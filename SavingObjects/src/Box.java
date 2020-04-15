// Интерфейс Serializable находится в этом пакете
import java.io.*;

public class Box implements Serializable {

    // Эти два значения будут сохранены
    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        // Операции ввода/вывода могут вызывать исключения
        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch (Exception exception) {exception.printStackTrace();}
    }
}
