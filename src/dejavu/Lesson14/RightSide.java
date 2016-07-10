package dejavu.Lesson14;

import javax.swing.*;

import static dejavu.Lesson14.Frame.FRAME_HEIGHT;
import static dejavu.Lesson14.Frame.FRAME_WIDTH;

/**
 * Created by dejavu on 10.07.2016.
 */
public class RightSide extends JPanel{
    Checkbox isUseDigits;
    Checkbox isUseSymbol;

    public RightSide(){
        setSize(4*FRAME_WIDTH/12, FRAME_HEIGHT);

        isUseDigits = new Checkbox("Use Digits");
        isUseSymbol = new Checkbox("Use Symbol");
        JButton genPass = new JButton("Generate pass");
        JLabel password = new JLabel();

        genPass.addActionListener(e -> {
            password.setText( getNewPass() );
        });

        this.add(isUseDigits);
        this.add(isUseSymbol);
        this.add(genPass);
        this.add(password);
    }

    private String getNewPass(){
        String dictionary = "";
        String password = "";
        int i = 0;
        int qtyDigits = LeftSide.getQtyDigits();

        dictionary += genDict(65, 90);
        dictionary += genDict(97, 122);

        if( isUseDigits.getStateCheckbox() ) dictionary += genDict(48,87);
        if( isUseSymbol.getStateCheckbox() ) {
            dictionary += genDict(33,47);
            dictionary += genDict(58,64);
            dictionary += genDict(91,96);
            dictionary += genDict(123,126);
        }

        while (i < qtyDigits){
            int symbol  = (int)(Math.random()*dictionary.length());
            password += dictionary.charAt(symbol);
            i++;
        }

        return password;
    }

    private String genDict(int first, int last){
        int i = first;
        String dict = "";

        while ( i >= first && i <= last ){
            dict += "" + ( (char) i );
            i++;
        }
        return dict;
    }
}
