package dejavu.Lesson19;

/**
 * Created by dejavu on 11.07.2016.
 *
 * МНОГОПОТОЧНОСТЬ
 */
public class LessonWork {
    volatile int tt;

    public static void main(String[] args){
        Runnable r = () -> {

            for(int i =0; i <10 ; i++){

                try {
                    Thread.sleep(400);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.print(" 1-th(" + i + ")");
            }
        };

        Thread t = new Thread(r);

        t.start();
        t.run();


        for(int i =10; i >0 ; i--){

            try {
                Thread.sleep(400);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(" 2-th ");
        }
    }
}
