package i4igo.lesson18.Grafic2D;

import javax.swing.*;

/**
 * Created by Ev on 16.07.2016.
 */

public class MoveBall extends JPanel{

    private static OptionPanel op;
    private static GraficPanel gp;
    public static int xStartOval = 10;
    public static int yStartOval = 50;
    public static int widthOval = 70;
    public static int heightOval = 70;

    MoveBall(OptionPanel op, GraficPanel gp) {
        this.op = op;
        this.gp = gp;
    }

    // метод определяет какой radiobutton выбран и вызывает соответствующий способ движения круга
    public static void modeStart(){
        switch(op.getRadioButton()){

            case "horizontal":
                horizontal();
                break;

            case "upHorizontal":
                upHorizontal();
                break;

            case "square":
                square();
                break;

            case "circle":
                circle();
                break;

            case "roundSquare":
                roundSquare();
                break;

            case "eight":
                eight();
                break;

            default:
                System.out.println("ошибка");

        }
    }

    // метод выполняет определенное ожидание после каждой отрисовки
    private static void stepWait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    private void moveLine(){

    }


    // движение по горизонтали
    private static void horizontal() {

        for (int i = 1; i < (gp.getWidth() - widthOval - 10) / 5; i++) {

            xStartOval += 5;
            stepWait(50);
            gp.repaint();

        }
    }

    // ускоренное движение по горизонтали
    private static void upHorizontal() {

        for (int i = 0; i < (gp.getWidth() - widthOval - 10) / 5; i++) {
            xStartOval += 5;
            stepWait(10);
            gp.repaint();
        }
    }

    // движение по квадрату
    private static void square() {
        int side = 1;

        while (side < 5) {
            switch (side) {
                case 1:
                    for (int i = 1; i < ((gp.getWidth() - widthOval - 10) / 5); i++) {
                        xStartOval += 5;
                        stepWait(30);
                        gp.repaint();
                    }
                    break;
                case 2:
                    for (int i = 1; i < (gp.getHeight() - heightOval - 50) / 5; i++) {
                        yStartOval += 5;
                        stepWait(30);
                        gp.repaint();
                    }
                    break;
                case 3:
                    for (int i = ((gp.getWidth() - widthOval - 10) / 5); i > 1; i--) {
                        xStartOval -= 5;
                        stepWait(30);
                        gp.repaint();
                    }
                    break;
                case 4:
                    for (int i = (gp.getHeight() - heightOval - 50) / 5; i >1 ; i--) {
                        yStartOval -= 5;
                        stepWait(30);
                        gp.repaint();
                    }
                    break;
                default:
                    System.out.println("ошибка");
            }
            side++;
        }
    }

    // движение по кругу
    private static void circle() {

        int radius = gp.getHeight()/3;
        int x0 = (gp.getWidth() / 2) - 35;
        int y0 = (gp.getHeight() / 2) - 35;

        for (int i = 0; i < 360 ; i++) {

            xStartOval = (int) (x0 + radius * Math.cos(Math.PI * i / 180));
            yStartOval = (int) (y0 + radius * Math.sin(Math.PI * i / 180));

            stepWait(30);
            gp.repaint();
        }

    }

    // движение по квадрату с заокругленными углами
    private static void roundSquare() {

    }

    // движение по "восьмерке"
    private static void eight() {

        int radius = gp.getHeight()/4;
        int x0 = gp.getWidth()/2+105;
        int y0 = (gp.getHeight() / 2) - 35;

        for (int i = 0; i < 360 ; i++) {

            xStartOval = (int) (x0 + Math.round(250* Math.cos(Math.PI * i / 180) ) * (Math.sin(Math.PI * i / 180)) - radius);
            yStartOval = (int) (y0 - Math.round(250* Math.sin(Math.PI * i / 180)));

            stepWait(30);
            gp.repaint();
        }

    }

}
