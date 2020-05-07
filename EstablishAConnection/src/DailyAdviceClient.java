import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

    public void go() {
        try {
            // Создаём соединение через сокет к приложению, работающему на порту 4242, на том же компьютере, где
            // выполняется данный код(localhost)
            Socket s = new Socket("127.0.0.1", 4242);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            // Подключаем BufferedReader(который уже соединён с исходящим потоком сокета).
            BufferedReader reader = new BufferedReader(streamReader);

            // Метод readLine() работает так же, как если бы BufferedReader был подключен к файлу. Иными словами,
            // работая с методом из BufferedReader, вы не знаете, откуда пришли символы
            String advice = reader.readLine();
            System.out.println("Сегодня ты должен: " + advice);

            // Здесь закрываются все потоки
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
