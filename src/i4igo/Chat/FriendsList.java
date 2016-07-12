package i4igo.Chat;

import javax.swing.*;

/**
 * Created by Ev on 13.07.2016.
 */

public class FriendsList extends JList {

    private BookContacts[] bcontact = {new BookContacts("1.gif", "Komod"),
                                    new BookContacts("2.gif", "Kiril"),
                                    new BookContacts("3.gif", "Antonov Ivan"),
                                    new BookContacts("4.gif", "Proxy"),
                                    new BookContacts("5.gif", "Natasha"),
                                    new BookContacts("6.gif", "kiber"),
                                    new BookContacts("7.gif", "Oleg"),
                                    new BookContacts("8.gif", "Kostya"),
                                    new BookContacts("9.gif", "Oleg"),
                                    new BookContacts("10.gif", "5525"),
                                    new BookContacts("11.gif", "Amator"),
                                    new BookContacts("12.gif", "Olga Vorontsova"),
                                    new BookContacts("13.gif", "Kamu"),
                                    new BookContacts("14.gif", "Serg"),
                                    new BookContacts("15.gif", "Steel"),
                                    new BookContacts("16.gif", "Katya"),
                                    new BookContacts("17.gif", "Ivanov Vlad")};

    FriendsList(){
        super();
        setListData(bcontact);
        //setSelectionModel(ListSelectionModel.SINGLE_SELECTION);


    }

}