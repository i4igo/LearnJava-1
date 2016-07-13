package dejavu.Lesson19.Animation2DObjects;

import javax.swing.*;
import static dejavu.Lesson19.Animation2DObjects.Frame.APP_HEIGHT;
import static dejavu.Lesson19.Animation2DObjects.Frame.APP_WIDTH;

/**
 * Created by dejavu on 13.07.2016.
 */
public class Motions extends JPanel {
    public static int x1 = 20;
    public static int y1 = 20;
    private static int x2, y2;
    private static int speed = 6;
    private final static int START_POINT = 20;
    private static LeftPanel ball;

    Motions(LeftPanel ball){

        this.ball = ball;
    }

    public static void startMove() {
        moveToStart();

        switch ( RightPanel.getRadioSelected() ){
            case "horizontal":
                moveHorizontal();
                break;
            case "square":
                moveSquare();
                break;
            case "speed":
                moveSpeed();
                break;
            case "circle":
                moveCircle();
                break;
            case "squareRadius":
                moveSquareRadius();
                break;
            case "eight":
                moveEight();
                break;
            default:
                moveToStart();
                break;
        }
    }

    private static void repaintBall(){
        ball.repaint();
    }

    private static void moveHorizontal(){
        x2 = ( 2* APP_WIDTH /3 ) - (2 * x1);
        y2 = y1;

        moveByLine(x2, y2, speed);
        moveByLine(START_POINT, START_POINT, speed);
    }

    private static void moveSquare(){
        x2 = ( 2* APP_WIDTH /3 ) - (2 * x1);
        y2 = y1;
        moveByLine(x2, y2, speed);

        x2 = x1;
        y2 = ( APP_HEIGHT - 50 ) - (4 * y1);
        moveByLine(x2, y2, speed);

        x2 = START_POINT;
        y2 = y1;
        moveByLine(x2, y2, speed);

        x2 = START_POINT;
        y2 = START_POINT;
        moveByLine(x2, y2, speed);
    }

    private static void moveSpeed(){
        x2 = ( 2 * APP_WIDTH /3 ) - (2 * x1);
        y2 = y1;

        moveByLine(x2, y2, speed/3);
        moveByLine(START_POINT, START_POINT, speed/3);
    }

    private static void moveCircle(){
        double angel = 0;

        while(angel < 360){
            x1 = (int) (180 * Math.cos(Math.PI * angel/180)) + ( 2 * APP_WIDTH /3 ) / 2;
            y1 = (int) (180 * Math.sin(Math.PI * angel/180)) + ( APP_HEIGHT - 100) / 2;

            repaintBall();
            delay(speed);

            angel++;
        }
    }

    private static void moveSquareRadius(){

    }

    private static void moveEight(){

    }

    private static void moveByLine(int x2, int y2, int s){
        int startPoint;
        int endPoint;
        int i = 0;

        int x = ( x1 > x2 ) ? x1 - x2: x2 - x1;
        int y = ( y1 > y2 ) ? y1 - y2: y2 - y1;

        startPoint  = (x > y) ? x1 : y1;
        endPoint    = (x > y) ? x2 : y2;

        int n = ( startPoint > endPoint ) ? startPoint: endPoint;

        while( i < n ){

            if( x1 > x2 ) x1--;
            if( x1 < x2 ) x1++;

            if( y1 > y2 ) y1--;
            if( y1 < y2 ) y1++;

            repaintBall();

            i++;
            delay(s);
        }
    }

    private static void moveToStart(){
        x1 = START_POINT;
        y1 = START_POINT;
    }

    private static void delay(int t){
        try {
            Thread.sleep( t );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
