package dejavu.Lesson14;

import javax.swing.*;

import java.awt.*;

import static dejavu.Lesson14.Frame.FRAME_HEIGHT;
import static dejavu.Lesson14.Frame.FRAME_WIDTH;

/**
 * Created by dejavu on 10.07.2016.
 * ПОЧЕМУ ПРЫГАЕТ ТЕКСТ???????????
 */
public class LeftSide extends JPanel{
    static JLabel digitsLabel;

    public LeftSide(){
        setSize(FRAME_WIDTH/2, FRAME_HEIGHT);

        Slider qtyDigits = new Slider();

        digitsLabel = new JLabel();
        digitsLabel.setText("13");
        digitsLabel.setHorizontalTextPosition(SwingConstants.RIGHT);

        qtyDigits.getListen(digitsLabel);

        this.add(qtyDigits);
        this.add(digitsLabel);
    }

    static int getQtyDigits(){
        int passDigits = Integer.parseInt( digitsLabel.getText() );

        return passDigits;
    }
}
