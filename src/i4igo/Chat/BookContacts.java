package i4igo.Chat;

import javax.swing.*;

/**
 * Created by Ev on 13.07.2016.
 */
public class BookContacts {


    private final String avatar;
    private final String nickName;
    private ImageIcon image;


    BookContacts(String avatar, String nickName){
            this.nickName = nickName;
            this.avatar = avatar;
    }

    public ImageIcon getImage(){
        if (image == null)
            image = new ImageIcon(avatar);
        return image;
    }

    @Override
    public String toString() {
        return nickName;
    }
}
