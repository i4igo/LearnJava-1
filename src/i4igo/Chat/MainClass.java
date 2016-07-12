package i4igo.Chat;


import java.awt.*;

/** Created by Java base on 7/6/2016.
 *
 *  создание основного окна и его отрисовка
 *
 */
public class MainClass {
    public static void main(String[] args) {

        // создаем основное окно
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChatFrame frame = new ChatFrame("My chat");
                frame.setDefaultCloseOperation(ChatFrame.EXIT_ON_CLOSE);
                frame.showChatFrame();
            }
        });
    }
}
