/*import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// Это внутренний класс внутри кода BeatBox
public class MySendListener implements ActionListener {
    // Всё это происходит при нажатии кнопки, после чего срабатывает ActionEvent
    public void actionPerformed (ActionEvent a) {
        // Создаём булев массив для хранения состояния каждого флажка
        boolean[] checkboxState = new boolean[256];
        // Пробегаем через checkboxList (ArrayList, содержащий состояние флажков), считываем состояния и добавляем
        // полученные значения в булев массив
        for (int i = 0; i < 256; i++) {

            JCheckBox check = (JCheckBox) checkboxList.get(i);
            if (check.isSelected()) {
                checkboxState[i] = true;
            }
        }

        // Записываем/сериализуем булев массив
        try {
            FileOutputStream fileStream = new FileOutputStream(new File("Checkbox.ser"));
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(checkboxState);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
*/