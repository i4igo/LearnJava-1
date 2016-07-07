package i4igo.lesson07;

import java.util.Scanner;

/**
 * Created by Ev on 27.05.2016.
 */
public class Task01 {
    /** 1. Ввести с клавиатуры некоторый текст.
     * Программа должна создать новую строку текста, которая будет являтся введенной строкой в обратном порядке символов.
     * вывести эту результирующую String-переменную на консоль:
     *  Пример:
     *  введите текст
     *  Today is Saturday and this is my Birthday!
     *  Ваш текст задом наперед:
     *  !yadhtriB ym si siht dna yadrutaS si yadoT
     *
     */
    public static void main(String[] args) {

        // вариант 1
        /*Scanner vvod = new Scanner(System.in);
        String text = vvod.nextLine();

        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }*/

        // вариант 2
        /*Scanner vvod = new Scanner(System.in);
        String text = vvod.nextLine();

        String vvodText = text;

        for(int i=text.length()-1; i>=0; i++) {
            System.out.print(vvodText.charAt(i));
        }*/

        //вариан
        Scanner vvod = new Scanner(System.in);
        String text = vvod.nextLine();
        char[] newText = new char[text.length()];

        for(int i=text.length()-1; i>=0; i--) {
            newText[(text.length() - 1) - i] = text.charAt(i);
        }

        System.out.println(String.valueOf(newText));
    }
}