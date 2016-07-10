package i4igo.Chat;

import javax.swing.*;

/** Created by Java base on 7/6/2016.
 *
 *  создание основной панели, по размерам окна
 */

public class ChatFrame extends JFrame {

    // если тока в этом классе - private, если и в других классах - public
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 500;

    private RootPanel rootPanel;

    // конструктор окна
    ChatFrame(String name) {
        super(name);                                                                    // наследуемся от JPanel, вызываем его конструктор
        setSize(FRAME_WIDTH, FRAME_HEIGHT);                                             // задаем размеры окна
        setLocationRelativeTo(null);                                                    // разместить окно по центру экрана

        rootPanel = new RootPanel(FRAME_WIDTH, FRAME_HEIGHT);                           // создаем панель, по размеру окна
        add(rootPanel);
    }

    // метод отрисовки окна
    public void showChatFrame(){
        setVisible(true);
    }
}
