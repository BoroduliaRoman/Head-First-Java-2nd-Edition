import javax.swing.*;
import java.awt.event.*;

// Реализуем интерфейс. Экземпляр SimpleGui1B реализует интерфейс ActionListener
public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        // Регистрируем нашу заинтересованость в кнопке. Передаваемый аргумент должен быть обьектом класса реализуемого
        // ActionListener
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    // Реализовуем метод actionPerformed() интерфейса ActionListener - Это фактически метод обработки событий
    public void actionPerformed(ActionEvent event) {
        button.setText("I`ve been clicked!");
    }
}
