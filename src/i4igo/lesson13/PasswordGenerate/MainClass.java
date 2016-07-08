package i4igo.lesson13.PasswordGenerate;

import java.awt.*;

/** Created by Ev on 04.07.2016.
 *
 *  Эта задача - имплементация графического интерфейса к задаче, рассматриваемой в начале курса.
 *  На панели находятся контролы:
 *      > слайдер - устанавливает минимальное и максимальное значение длинны создаваемого пароля. Для задачи взять 6 и 14 соответственно;
 *      > метка - отображение значения, на котором стоит слайдер;
 *      > чекбокс - использовать ли цифры для пароля
 *      > чекбокс - использовать ли системные символы для пароля (@, #, $, %, * и т.д.)
 *      > кнопка - нажатие генерирует пароль и отображает на панели
 *      > метка - место, где должен отображаться сгенерированный пароль
 *
 *  Требования:
 *      1) Если не выбран ни один чекбокс - генерировать пароли только с использованием больших и малых латинских букв
 *      2) Разрешается (и даже рекомендуется) использовать алгорим, который использовался в консольной версии задачи (в начале курса). Т.е. если еще тогда эта задача была решена - нужно взять тот код и занести в эту задачу.
 *      3) на слайдере должны отображаться засечки, шкала цифр, цветом зарисовываться выбранное количество (зарисовано красным на рисунке)
 *
 */

public class MainClass {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                PasswordFrame window = new PasswordFrame();
                window.setDefaultCloseOperation(PasswordFrame.EXIT_ON_CLOSE);
                window.showPasswordFrame();

            }
        });
    }
}