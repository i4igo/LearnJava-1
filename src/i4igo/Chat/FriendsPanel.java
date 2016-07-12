package i4igo.Chat;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Java base on 7/6/2016.
 */

public class FriendsPanel extends JPanel {

    private JPanel panelUp;
    private JPanel panelDown;
    private FriendsList friendsList;
    private JScrollPane scrollPane;

    FriendsPanel(){
        super();
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);

        panelUp = new JPanel();
        panelDown = new JPanel();
        friendsList = new FriendsList();
        //friendsList.setCellRenderer(new BookCellRenderer());
        //friendsList.setVisibleRowCount(1);

        scrollPane = new JScrollPane(friendsList);


        add(panelUp, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(panelDown, BorderLayout.SOUTH);
    }
}
