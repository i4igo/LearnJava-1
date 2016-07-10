package i4igo.lesson13.PasswordGenerate;

import sun.security.util.Password;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/** Created by Ev on 09.07.2016.
 *
 * создаю 2 чекбокса, кнопку и метку, для отображения пароля
 */

public class PanelOptions extends JPanel {


    // попроую без этой кабалы
    private final Character[] MASS_SYMBOL = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                                            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                                            'a','b','c','d','e','f','g','h','i','j','k','l','m',
                                            'n','o','p','q','r','s','t','u','v','w','x','y','z',
                                            '0','1','2','3','4','5','6','7','8','9',',','.','!',
                                            '?',';',':','@','#','$','%','^','&','*','(',')','-',
                                            '=','+','/','|','\\','<','>','[',']','{','}'};

    private DigitCheckBox chek1;
    private DigitCheckBox chek2;
    private JButton buttonGenerate;
    private JLabel label;

    private ItemListener listenerCheckBox;
    private ActionListener listenerButton;

    private boolean digit;
    private boolean symbol;


    PanelOptions(){

        chek1 = new DigitCheckBox("use Digits");
        chek2 = new DigitCheckBox("use Symbols");

        listenerCheckBox = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                DigitCheckBox source = (DigitCheckBox) e.getSource();

                switch (source.getName()){
                    case "use Digits":
                        digit = source.isSelected();
                        break;
                    case "use Symbols":
                        symbol = source.isSelected();
                        break;
                    default:
                        System.out.println("ошибка!!!");

                }
            }
        };

        buttonGenerate = new JButton("generate password");

        listenerButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickButton(digit, symbol);
            }
        };

        label = new JLabel("");

        chek1.addItemListener(listenerCheckBox);
        chek2.addItemListener(listenerCheckBox);

        buttonGenerate.addActionListener(listenerButton);

        add(chek1);
        add(chek2);
        add(buttonGenerate);
        add(label);

    }


    // КАК СЮДА ПЕРЕДАТЬ ДАННЫЕ textFieldSlider ПАНЕЛИ PanelSlider



    // метод генерации пароля
    public void clickButton(boolean digit, boolean symbol){

        int kkk = new PanelSlider().passwordLong();
        System.out.println(kkk);

        Character[] array = new Character[10];
        int l = -1;

        StringBuilder ss = new StringBuilder();

        if (digit == true)
            l = symbol == true ? 2 : 1;
        else
            l = symbol == true ? 0 : -1;

        switch (l){
            case 2:
                for(int i = 0; i < array.length; i++) {
                    array[i] = MASS_SYMBOL[(int)(Math.random()*MASS_SYMBOL.length)];
                }
                break;

            case 1:
                for(int i = 0; i < array.length; i++) {
                    array[i] = MASS_SYMBOL[(int)(Math.random()*61)];
                }
                break;

            case 0:
                for(int i = 0; i < array.length; i++) {
                    int chek = -1;
                    while(chek == -1) {
                        int k = (int) (Math.random() * MASS_SYMBOL.length);
                        if (k <= 51 | k >= 62) {
                            array[i] = MASS_SYMBOL[k];
                            chek = 1;
                        } else chek =- 1;
                    }
                }
                break;

            case -1:
                for(int i = 0; i < array.length; i++) {
                    array[i] = MASS_SYMBOL[(int)(Math.random()*51)];
                }
                break;
            default:
                System.out.println("Ошибка!");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            ss.append(String.valueOf(array[i]));
        }

        label.setText(new String(ss));
    }
}
