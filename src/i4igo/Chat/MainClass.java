package i4igo.Chat;



/** Created by Java base on 7/6/2016.
 *
 *  создание основного окна и его отрисовка
 *
 */
public class MainClass {
    public static void main(String[] args) {

        // создаем основное окно
        ChatFrame frame = new ChatFrame("My chat");
        frame.setDefaultCloseOperation(ChatFrame.EXIT_ON_CLOSE);
        frame.showChatFrame();
    }
}
