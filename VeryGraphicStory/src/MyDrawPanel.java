import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;

// Панель для рисования - это слушатель
public class MyDrawPanel extends JPanel implements ControllerEventListener {
    // Присваиваем флагу значение false и будем устанавливать true, когда получим событие
    boolean msg = false;

    public void controlChange(ShortMessage event) {
        // Мы получили событие, поэтому присваиваем флагу значение true и вызываем repaint()
        msg = true;
        repaint();
    }

    public void paintComponent (Graphics g) {
        // Мы должны использовать флаг, потому что другие обьекты могут запустить repaint(), а мы хотим рисовать только
        // тогда, когда произойдёт событие ControllerEvent
        if (msg) {
            Graphics2D g2 = (Graphics2D) g;

            int r = (int) (Math.random() * 250);
            int gr = (int) (Math.random() * 250);
            int b = (int) (Math.random() * 250);

            g.setColor(new Color(r,gr,b));

            int ht = (int) ((Math.random() * 120) + 10);
            int width = (int) ((Math.random() * 120) + 10);
            int x = (int) ((Math.random() * 40) + 10);
            int y = (int) ((Math.random() * 40) + 10);
            g.fillRect(x,y,ht,width);
            msg = false;
        }
    }
}
