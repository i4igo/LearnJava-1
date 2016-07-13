package dejavu.Lesson20;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by dejavu on 13.07.2016.
 */
public class LessonWork {
    public static void main(String[] args) throws IOException {

        URL iua = new URL("http://i.ua/");

        InputStream is = iua.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader in = new BufferedReader(isr);



        System.out.println(in);
    }
}
