package i4igo.lesson07;

import java.util.Random;

/**
 * Created by Ev on 05.06.2016.
 */

public class Column {

    /** Дан набор 20-ти городов с названиями различной длинны : Киев, Магнитогорск, Днепропетровск, Ровно, Санкт-Петербург, Харьков и т.д.
     *  Эти города необходимо вывести на экран случайным образом в виде форматированной таблички 4*5, чтобы отчетливо было видно колонки.
     *  При втором запуске программы порядок этих городов должен быть другой, но форматирование обязательно сохраняться!
     *
     */

    static String[] cities = {"Киев", "Стамбул", "Новороссийск", "Рига", "Дубно",
                              "Ивано-Франковск", "Львов", "Ужгород", "Гомель", "Магнитогорск",
                              "Днепропетровск", "Одесса", "Курск", "Париж", "Стокгольм",
                              "Осло", "Минск", "Архангельск", "Николаев", "Афины"};

    static int maxx;
    static int city;

    // метод lengthCities(int i) определяет длинну элемента массива, на который указывает параметр
    static int lengthCities(int i) {
        return cities[i].length();
    }

    // метод maxxCities() определяет максимальную длинну элементов массива cities[]
    static void maxxCity() {
        for (int i = 0; i < cities.length; i++) {
            city = lengthCities(i);
            if (city > maxx)
                maxx = city;
        }
    }

    // метод sortCities(int m) сравнив длинну указанного элемента массива с maxx, добавляет в конце слова " " для вывода в виде столбца
    static void tableCities(int m) {
        int k;
        maxxCity();
        city = lengthCities(m);
            if (city < maxx) {
                k = maxx - city;
                System.out.print(cities[m]);

                for (int l = 0; l < k + 1; l++)
                    System.out.print(" ");
            } else
                System.out.print(cities[m]+" ");
    }

    // метод sortMass() сортирует массив cities[] случайным образом
    static void sortMass () {
        Random random = new Random();
        int l;

        for (int i = 0; i < cities.length; i++) {
            l = random.nextInt(cities.length);
            String s;
            s = cities[i];
            cities[i] = cities[l];
            cities[l] = s;
        }
    }


    public static void main(String[] args) {
        int m = 0;
        sortMass();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                tableCities(m);
                m++;
            }
            System.out.println();
        }
    }
}

