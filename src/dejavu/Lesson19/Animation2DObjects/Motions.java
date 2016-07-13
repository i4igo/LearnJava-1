package dejavu.Lesson19.Animation2DObjects;


import dejavu.Lesson19.Animation2DObjects.RightPanel;

import javax.swing.*;

import static dejavu.Lesson19.Animation2DObjects.Frame.APP_HEIGHT;
import static dejavu.Lesson19.Animation2DObjects.Frame.APP_WIDTH;
import static dejavu.Lesson19.Animation2DObjects.LeftPanel.ball;

/**
 * Created by dejavu on 13.07.2016.
 */
public class Motions extends JPanel {
    public static int x1 = 20;
    public static int y1 = 20;
    private static int x2, y2;
    private static int speed = 20;
    private final static int START_POINT = 20;
    private static LeftPanel ballBBBB;

    Motions(LeftPanel bbbb){
        ballBBBB = bbbb;
    }

    public static void startMove() {

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

    private static void repaintBall(double x, double y){
        ballBBBB.repaint();
    }

    private static void moveHorizontal(){
        x2 = ( 2* APP_WIDTH /3 ) - (2 * x1);
        y2 = y1;

        moveByLine(x2, y2, speed);
    }

    private static void moveSquare(){
        x2 = x1 + ( 2* APP_WIDTH /3 ) - (2 * x1);
        y2 = y1;
        moveByLine(x2, y2, speed);

        x2 = x1;
        y2 = y1 + ( APP_HEIGHT - 50 ) - (2 * y1);
        moveByLine(x2, y2, speed);

        x2 = START_POINT;
        y2 = y1;
        moveByLine(x2, y2, speed);

        x2 = START_POINT;
        y2 = START_POINT;
        moveByLine(x2, y2, speed);
    }

    private static void moveSpeed(){
        x2 = ( 2* APP_WIDTH /3 ) - (2 * x1);
        y2 = y1;

        moveByLine(x2, y2, speed/2);
    }

    private static void moveCircle(){
        double angel = 0;

        while(angel < 1){
            double x = Math.cos(angel);
            double y = Math.sin(angel);

            repaintBall( x, y);

            angel += Math.PI/180 * 2;
        }
    }

    private static void moveSquareRadius(){

    }

    private static void moveEight(){

    }

    private static void moveToStart(){

    }

    private static void moveByLine(int x2, int y2, int s){
        int startPoint;
        int endPoint;

        int x = ( x1 > x2 ) ? x1 - x2: x2 - x1;
        int y = ( y1 > y2 ) ? y1 - y2: y2 - y1;

        startPoint  = (x > y) ? x1 : y1;
        endPoint    = (x > y) ? x2 : y2;


        while( startPoint < endPoint ){

            if( x1 > x2 ) x1--;
            if( x1 < x2 ) x1++;

            if( y1 > y2 ) y1--;
            if( y1 < y2 ) y1++;

            repaintBall( x1, y1 );

            startPoint++;
            delay(s);
        }
    }

    private static void delay(int t){
        try {
            Thread.sleep( t );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
