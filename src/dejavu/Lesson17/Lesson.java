package dejavu.Lesson17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by dejavu on 04.07.2016.
 */
public class Lesson {
    public static void main(String... args) throws IOException {
        File f = new File("src/dejavu.Lesson17/Lesson.java");
        System.out.println( f.exists() );


        FileInputStream fis = null;

        fis = new FileInputStream(f);

        if (fis != null){
            int available = -1;

            while ( (available = fis.available()) > 0 ) {
                int readByte = fis.read();
                System.out.print((char) readByte);
            }
        } else {
            System.out.println("Ghj,tks xntybz afqkf!");
        }
        fis.close();

    }
}
