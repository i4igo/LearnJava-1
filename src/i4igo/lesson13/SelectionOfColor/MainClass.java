package i4igo.lesson13.SelectionOfColor;

import java.awt.*;

/** Created by Ev on 03.07.2016.
 *
 *  На панели находится три ползунка, каждый из которых отвечает за один из цветовых каналов - R, G, B.
 *  Движение ползунков провоцирует изменение цвета панели. Если все ползунки на минимуме - цвет черный, все на максимуме - белый.
 *  Текущее значение каждого ползунка отображается в соответствующей текстовой метке в виде числа (от 0 до 255).
 *  В четвертой метке будет отображаться 16-ричное представление текущего цвета.
 *  Для того, чтобы текст был виден всегда, его необходимо отображать в негативном цвете - если цвет панели черный - текст белый и аналогично для конкретных цветов.
 *
 *
 */

// Андрею не читать

public class MainClass {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyFrame window = new MyFrame();
                window.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
                window.showMyFrame();

            }
        });
    }
}