package i4igo.lesson18.Grafic2D;

import javax.swing.*;

/**
 * Created by Ev on 16.07.2016.
 */

public class MoveBall extends JPanel {

    private static OptionPanel op;
    private static GraficPanel gp;

    public static int xStartOval = 50;
    public static int yStartOval = 50;
    public static int widthOval = 50;
    public static int heightOval = 50;


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

    // метод moveLine() двигает объект по линии
    private static void moveLine(int sWait){
        int xStart = xStartOval;
        int yStart = yStartOval;
        int lengthLine = gp.getWidth() - (widthOval*2) - xStart;
        for (int i = 1; i < lengthLine / 5; i++) {
            xStartOval += 5;
            stepWait(sWait);
            gp.repaint();
        }

        for (int i = 1; i < (gp.getHeight() - (heightOval*2) - yStart) / 5; i++) {
            yStartOval += 5;
            stepWait(30);
            gp.repaint();
        }
    }

    //метод moveCircle двигает объект по округлостям
    private static void moveCircle(int iStart, int iStop, int sWait) {

        int radius = gp.getHeight()/3;
        int x0 = (gp.getWidth() / 2) - widthOval / 2;
        int y0 = (gp.getHeight() / 2) - heightOval / 2;
        for (int i = iStart; i < iStop ; i++) {
            xStartOval = (int) (x0 + radius * Math.cos(Math.PI * i / 180));
            yStartOval = (int) (y0 + radius * Math.sin(Math.PI * i / 180));
            stepWait(sWait);
            gp.repaint();
        }
    }

    // движение по горизонтали
    private static void horizontal() {
        moveLine(50);
    }

    // ускоренное движение по горизонтали
    private static void upHorizontal() {
        moveLine(10);
    }

    // движение по квадрату
    private static void square() {
        int side = 1;
        int startX = xStartOval;
        int startY = yStartOval;

        while (side < 5) {
            switch (side) {
                case 1:
                    moveLine(30);
                    break;
                case 2:
                    moveLine(30);
                    break;
                case 3:
                    for (int i = (gp.getWidth() - (widthOval*2) - startX) / 5; i > 1; i--) {
                        xStartOval -= 5;
                        stepWait(30);
                        gp.repaint();
                    }
                    break;
                case 4:
                    for (int i = (gp.getHeight() - (heightOval*2) - startY) / 5; i >1 ; i--) {
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
        moveCircle(0, 360, 30);
    }

    // движение по квадрату с заокругленными углами
    private static void roundSquare() {

        int side = 1;
        int startX = xStartOval;
        int startY = yStartOval;

        int widthR = 100;
        int heightR = 100;

        int radius = widthR;

        while (side < 5) {
            switch (side) {
                case 1:
                    for (int i = 1; i < (gp.getWidth() - (widthOval*2) - startX - widthR) / 5; i++) {
                        xStartOval += 5;
                        stepWait(30);
                        gp.repaint();
                    }


                    int x0 = xStartOval;
                    int y0 = yStartOval + heightR;

                    for (int i = 270; i < 360 ; i++) {

                        xStartOval = (int) (x0 + radius * Math.cos(Math.PI * i / 180));
                        yStartOval = (int) (y0 + radius * Math.sin(Math.PI * i / 180));

                        stepWait(30);
                        gp.repaint();
                    }

                    break;

                case 2:
                    for (int i = 1; i < (gp.getHeight() - (heightOval*2) - startY - (heightR*2)) / 5; i++) {
                        yStartOval += 5;
                        stepWait(30);
                        gp.repaint();
                    }

                    x0 = xStartOval - widthR;
                    y0 = yStartOval;

                    for (int i = 0; i < 90 ; i++) {

                        xStartOval = (int) (x0 + radius * Math.cos(Math.PI * i / 180));
                        yStartOval = (int) (y0 + radius * Math.sin(Math.PI * i / 180));

                        stepWait(30);
                        gp.repaint();
                    }

                    break;
                case 3:
                    for (int i = (gp.getWidth() - (widthOval*2) - startX - (widthR*2)) / 5; i > 1; i--) {
                        xStartOval -= 5;
                        stepWait(30);
                        gp.repaint();
                    }



                    x0 = xStartOval;
                    y0 = yStartOval - heightR;

                    for (int i = 90; i < 180 ; i++) {

                        xStartOval = (int) (x0 + radius * Math.cos(Math.PI * i / 180));
                        yStartOval = (int) (y0 + radius * Math.sin(Math.PI * i / 180));

                        stepWait(30);
                        gp.repaint();
                    }

                    break;
                case 4:
                    for (int i = (gp.getHeight() - (heightOval*2) - startY - (heightR*2)) / 5; i >1 ; i--) {
                        yStartOval -= 5;
                        stepWait(30);
                        gp.repaint();
                    }


                    x0 = xStartOval + widthR;
                    y0 = yStartOval;

                    for (int i = 180; i < 270 ; i++) {

                        xStartOval = (int) (x0 + radius * Math.cos(Math.PI * i / 180));
                        yStartOval = (int) (y0 + radius * Math.sin(Math.PI * i / 180));

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

    // движение по "восьмерке"
    private static void eight() {

        int radius = gp.getHeight() / 4;
        int x0 = gp.getWidth() / 2 + 105;
        int y0 = gp.getHeight() / 2 - 35;
        for (int i = 0; i < 360 ; i++) {
            xStartOval = (int) (x0 + Math.round(250* Math.cos(Math.PI * i / 180) ) * (Math.sin(Math.PI * i / 180)) - radius);
            yStartOval = (int) (y0 - Math.round(250* Math.sin(Math.PI * i / 180)));
            stepWait(30);
            gp.repaint();
        }

    }

}
