package i4igo.lesson07;

/**
 * Created by Ev on 11.06.2016.
 */

import java.util.Scanner;

/** Дан довольно объемный  текст, который необходимо распарсить по следующим требованиям:
 *
 * 1) вывести отдельно по одному слову в столбик (правильно "отделаться" от пробелов, точек, запятых и других знаков препинания)
 * 2) Оптимизировать программу для случая двойных слов, написанных через дефис - /т.е считать слово 'объектно-ориентированный' одним словом/
 * 3) Отсортировать слова:
 *      - сначала вывести группу слов, состоящих их цифр;
 *      - после нее группу слов, состоящих из слов, начинающихся с большой буквы;
 *      - после - группу оставшихся слов с маленькой буквы.
 *
 *      Подсказки:
 *      1) символы начинаются с кода 33;
 *      2) Чтобы определить является ли символ буквой, использовать метод Character.isAlphabetic(char с)
 *      3) Чтобы определить является ли символ цифрой, использовать метод Character.isDigit(char с)
 *      4) Чтобы определить является ли символ буквой или цифрой, использовать метод Character.isLetterOrDigit(char с)
 *      5) В задаче используются String-методы.
 *
 */

public class Parsing {

    // метод parsDigit() выводит на экран в числа с текста переданному ему как параметр
    public static void parsDigit(String text){

        int k=-1;
        for (int i=0; i<text.length(); i++)
            if (Character.isDigit(text.charAt(i))){                 // проверка если символ цифра
                System.out.print(text.charAt(i));                   // выводим его
                k++;                                                // счетчик +1
            } else if (k!=-1){                                      // если символ не цыфра, а предыдущий был цифрой, значит число закончилось
                System.out.println();                               // переводим курсор на новую строку
                k=-1;                                               // очищаем счетчик
            }

    }

    // метод parsLLitter() выводит на экран все слова которые начинаются с большой буквы с текста переданному ему как параметр
    public static void parsLLitter(String text){

        int k=-1;
        int bigL=-1;
        for (int i=0; i<text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                if (text.charAt(i) >= 65 & text.charAt(i) <= 90) {                  // проверяем символ это большая латинская буква
                    System.out.print(text.charAt(i));
                    k++;
                    bigL++;
                } else if (bigL != -1) {                                            // если нет, но счетчик больших букв говорит что большая буква была раньше и относится к этому слову
                    System.out.print(text.charAt(i));

                }
            } else if (k!=-1){                                                      // если это не буква и слово закончилось, переводим курсор на новую строку, очищаем счетчичи
                System.out.println();
                bigL=-1;
                k = -1;
            }
        }
    }

    // метод parslLitter() выводит на экран все слова которые начинаются с маленькой буквы с текста переданному ему как параметр
    public static void parslLitter(String text){

        int k=-1;
        int bigL=-1;
        for (int i=0; i<text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                if (text.charAt(i) >= 65 & text.charAt(i) <= 90) {                  // если буква большая, включаем счетчик
                    bigL++;
                } else if (bigL == -1) {                                            // если буква маленькая и больших небыло, выводим на экран
                    System.out.print(text.charAt(i));
                    k++;
                }
            } else if (text.charAt(i) == 45 & k!=-1) {                              // если символ не буква, проверяем может "-"
                System.out.print(text.charAt(i));                                   // если да, то выводим его на экран как часть слова
                k++;
            } else {                                                                // если нет, то заканчиваем слово, переводим курсор на новую строку, чистим счетчики
                bigL = -1;
                if (k != -1) {
                    System.out.println();
                    k = -1;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        String text = vvod.nextLine();

        parsDigit(text);
        System.out.println();
        parsLLitter(text);
        System.out.println();
        parslLitter(text);

        vvod.close();
    }
}
