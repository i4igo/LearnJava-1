package Lesson15;

import java.io.File;
import java.util.Date;

/**
 * Created by dejavu on 22.06.2016.
 */
public class MainClass {
    public static void main(String[] args){
        File f = new File("c:\\BOOTNXT");
        String fName = f.getName();

        Date d = new Date();
        MainClass mc = new MainClass();

        System.out.println(d);
        System.out.println(fName);

    }
}
