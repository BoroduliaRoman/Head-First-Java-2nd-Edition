// Импортируем пакет свинг
import javax.swing.*;


public class SimpleGui1 {
    public static void main(String[] args) {
        // Создаём фрейм и кнопку
        JFrame frame = new JFrame();
        // Передаём конструктору кнопки текст, который будет на ней отображаться
        JButton button = new JButton("click me");

        // Эта строка завершает работу при закрытии окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Добавляем кнопку на панель фрейма
        frame.getContentPane().add(button);

        // Присваиваем фрейму размер(в пикселях)
        frame.setSize(300, 300);

        // Делаем фрейм видимым
        frame.setVisible(true);
    }
}
