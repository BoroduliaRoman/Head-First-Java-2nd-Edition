import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    // Ежедневные советы берутся из этого массива

    String[] adviceList = {
            "Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают вас полнее.",
            "Два слова: не годится",
            "Будьте честны хотя бы сегодня. Скажите своему начальнику все, что вы *на самом деле* о нем думаете.",
            "Возможно, вам стоит попробовать другую причёску."
    };

    public void go() {
        try {
            // Благодаря ServerSocket приложение отслеживает клиенсткие запросы на порту 4242 на том же компьютере, где
            // выполняется данный код
            ServerSocket serverSocket = new ServerSocket(4242);
            // Сервер входит в постоянный цикл, ожидая клиентских подключений(и обслуживая их)
            while (true) {
                // Метод accept() блокирует приложение до тех пор,  пока не поступит запрос, после чего возвращает
                // сокет(на анонимном порту) для взаимодействия с клиентом
                Socket sock = serverSocket.accept();

                // Теперь мы используем соединение обьекта Socket с клиентом для создания экземпляра PrintWriter, после
                // чего отправляем с его помощью (println()) строку с советом. Затем мы закрываем сокет, так как работа
                // с клиентом закончена
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
