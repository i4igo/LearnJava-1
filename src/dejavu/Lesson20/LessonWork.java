package dejavu.Lesson20;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by dejavu on 13.07.2016.
 * Class Work 20
 */
public class LessonWork {
    public static void main(String[] args) throws IOException {

//        httpWork();

        String post;

        post = "{region:{" +
                "id:12;name_ua:"+
                "}}";

        jsonWork(post);

    }

    private static void httpWork() throws IOException {

        URL url = new URL("http://i.ua");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        int responseCode = con.getResponseCode();

        System.out.println(responseCode);

    }

    private static void jsonWork(String post){

//        post;

        class Region{
            String id;
            String name_ua;
            String name_ru;
            String name_en;

            class RegionCouncil{
                String id;
                String name_ua;
                String name_ru;
                String name_en;
            }
        }

        class CityResponce{
            String code;
            String prefix;
            City data[];

            class City{
                String id;
                String name;
                String district;
            }
        }
    }

    private void downloadText() throws IOException {

        URL iua = new URL("http://i.ua/");

        InputStream is = iua.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader in = new BufferedReader(isr);

        in.close();
    }

    private void downloadFile(){


    }

}
