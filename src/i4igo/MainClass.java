package i4igo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass {
    static Thread t;
    private static MyThread mt;
    static int xRect;

    public static void main(String[] args) throws InterruptedException {
// stickButtonExample();
 moveAnimationExample();
        synchronizedExample();
        System.out.println("Main is Closed!!!");
    }


    private static void stickButtonExample() {
        JFrame fr = new JFrame("FRAME");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        JButton b = new JButton("button");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
// if(t==null){
// t = new Thread(new Runnable() {
//
// @Override
// public void run() {
                for(int i = 0; i < 10; i++){
                    try { Thread.sleep(400); } catch (InterruptedException ex) { ex.printStackTrace(); }
                    System.out.println(i + ". " + "MyThread" + "\t" + System.currentTimeMillis());
                }
// }
// });
//
// t.start();
// }
// else{
// if(t.isAlive()){
// System.out.println("Thead in Work NOW!!!!!");
// }
// else{
//
// t = new Thread(new Runnable() {
//
// @Override
// public void run() {
// for(int i = 0; i < 10; i++){
//
// try { Thread.sleep(400); } catch (InterruptedException ex) { ex.printStackTrace(); }
//
// System.out.println(i + ". " + "MyThread" + "\t" + System.currentTimeMillis());
// }
// }
// });
//
// t.start();
//
// }
// }
            }
        });
        p.add(b);
        fr.add(p);
        fr.setSize(500, 300);
        fr.setVisible(true);
    }


    private static void moveAnimationExample() {
        JFrame frame = new JFrame("FRAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BallPanel ballPanel = new BallPanel();
        frame.add(ballPanel);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }


    private static void synchronizedExample() {

        Runnable r = new SynchronizedTest();
        Runnable r1 = new SynchronizedTest();
        // Create the thread supplying it with the runnable object
        Thread t = new Thread(r, "AAA");
        Thread t1 = new Thread(r,"ZZZ");
//      Here the key point is passing same object, if you pass runnable2 for thread2,
//      then its not applicable for synchronization test and that wont give expected
//      output Synchronization method means "it is not possible for two invocations
//      of synchronized methods on the same object to interleave"

        // Start the thread
        t.start();
        t1.start();
    }
    static class MyThread extends Thread{
        volatile boolean isFinished = false;

        volatile int x = 5;

        public void stopMe()
        {
            isFinished = true;
        }

        public void run() {

            while (!isFinished) {

                System.out.println("MyTHREAD S!!!");

     /*   P R O C E S S   */

                for(int i = 0; i < 10; i++){
                    try { Thread.sleep(400); } catch (InterruptedException e) { e.printStackTrace(); }
                    System.out.println(i + ". " + "MyThread" + "\t" + System.currentTimeMillis());
                }
/**/
            }

            System.out.println("My THREAD IS  STOPPED!!!");

            mt = new MyThread();
            mt.start();
        }
    }

    public static class BallPanel extends JPanel {

        public BallPanel() {
            super();
            xRect = 100;
            JButton b = new JButton("button");
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ev) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < 50; i++) {
                                xRect += 5;
                                try { Thread.sleep(30); } catch (InterruptedException e) { e.printStackTrace(); }
                                repaint();
                            }
                        }
                    }).start();

                }
            });
            this.add(b);
            this.setBackground(Color.GREEN);
        }
        @Override
        protected void paintComponent(Graphics g) {
            // TODO Auto-generated method stub
            super.paintComponent(g);
            g.fillRect(xRect, 70, 80, 120);
            System.out.println("paintComponent");
        }

    }
    static class SynchronizedTest implements Runnable {

        private int c = 0;

        public  void increment() {
//     public  synchronized   void increment() {
            System.out.println("Begin thread " + Thread.currentThread().getName());
            System.out.println(this.hashCode() + "Value of C = " + c);
//       If we uncomment this for synchronized block, then the result would be different
//       synchronized(this) {
            for (int i = 0; i < 30; i++) {
                c += i;
                System.out.println("for{...} " + Thread.currentThread().getName() + " Value of C = " + c);
                try { Thread.sleep(100); } catch (InterruptedException ex) { ex.printStackTrace(); }
            }
//       }
            System.out.println("End thread " + Thread.currentThread().getName());
            System.out.println(this.hashCode() + "Value of C = " + c);
        }

//     public synchronized void decrement() {
//         System.out.println("Decrement " + Thread.currentThread().getName());
//     }

        public int value() {
            return c;
        }

        @Override
        public void run() {
            this.increment();
        }
    }
}


