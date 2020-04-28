import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("MyText.txt");
            // FileReader - поток соединения для символов, который подключается к текстовому файлу.
            FileReader fileReader = new FileReader(myFile);
            // Для более эффективного чтения соединим FileReader с BufferedReader. Тогда FileReader будет обращаться к
            // файлу только в том случае, если буфер пуст(потому что программа прочла всё, что там находилось)
            BufferedReader reader = new BufferedReader(fileReader);

            // Создаём строковую переменную для временного хранения каждой строки в процессе чтения
            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
