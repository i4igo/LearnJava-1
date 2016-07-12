package i4igo.lesson13.PasswordGenerate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/** Created by Ev on 09.07.2016.
 *
 * создаю 2 чекбокса, кнопку и метку, для отображения пароля
 */

public class PanelOptions extends JPanel {


    // попроую без этой кабалы (но так быстрее)
    private final Character[] MASS_SYMBOL = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                                            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                                            'a','b','c','d','e','f','g','h','i','j','k','l','m',
                                            'n','o','p','q','r','s','t','u','v','w','x','y','z',
                                            '0','1','2','3','4','5','6','7','8','9',',','.','!',
                                            '?',';',':','@','#','$','%','^','&','*','(',')','-',
                                            '=','+','/','|','\\','<','>','[',']','{','}'};

    private PanelSlider ps;

    private DigitCheckBox chek1;
    private DigitCheckBox chek2;
    private JButton buttonGenerate;
    private JTextField password;

    private ActionListener listenerButton;

    private Character[] array;
    private String result;


    PanelOptions(PanelSlider ps){

        this.ps = ps;

        setLayout(new GridLayout(4, 1, 0, 10));

        chek1 = new DigitCheckBox("use Digits");
        chek2 = new DigitCheckBox("use Symbols");
        buttonGenerate = new JButton("generate password");
        password = new JTextField("Ваш пароль");

        listenerButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickButton();
            }
        };

        buttonGenerate.addActionListener(listenerButton);

        add(chek1);
        add(chek2);
        add(buttonGenerate);
        add(password);

        System.out.println(chek1.getCheckBox());

    }

    // метод генерации пароля
    public void clickButton(){

        array = new Character[ps.getTextField()];
        result = null;

        // очень даже все и понятно, было через switch, понятнее
        if (chek1.getCheckBox()) {
            if (chek2.getCheckBox()) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = MASS_SYMBOL[(int) (Math.random() * MASS_SYMBOL.length)];
                }
            } else{
                for (int i = 0; i < array.length; i++) {
                    array[i] = MASS_SYMBOL[(int) (Math.random() * 61)];
                }
            }
        } else {
            if (chek2.getCheckBox()) {
                for (int i = 0; i < array.length; i++) {
                    int chek = -1;
                    while (chek == -1) {
                        int k = (int) (Math.random() * MASS_SYMBOL.length);
                        if (k <= 51 | k >= 62) {
                            array[i] = MASS_SYMBOL[k];
                            chek = 1;
                        } else chek = -1;
                    }
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    array[i] = MASS_SYMBOL[(int) (Math.random() * 51)];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            result += "" + array[i];
        }

        password.setText(result);
    }
}
