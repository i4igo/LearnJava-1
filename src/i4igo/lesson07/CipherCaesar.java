package i4igo.lesson07;

import java.util.Scanner;

/**
 * Created by Ev on 30.05.2016.
 */
public class CipherCaesar {

    /** "Шифр Цезаря". Необходимо ввести некий текст и в результате работы программы получить зашифрованный текст
     *  Пользователь должен ввести с клавиатуры ключ - количество сдвигов символов и также режим шифровать/дешифровать.
     *      Важно!!! При сдвиге символов за пределы последнего шифр начинается с начала алфавита,
     *      например если буква z сдвигается на 2 символа вправо, она становится буквой b.
     *  Также можно предоставить пользователю возможность выбора на каком языке шифровать - английском или русском.
     *
     */

    static Character[] en = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                             'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    static Character[] ru = {'А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П',
                             'Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};

    // шифрование текста
    public static void cipher(String text, int key, Character[] alfabet) {

        Character symbol='$';
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < alfabet.length; j++) {
                if (text.charAt(i) == alfabet[j]) {
                    System.out.print(alfabet[(j + key) % (alfabet.length)]);
                    break;
                } else {
                    if (j != alfabet.length - 1)
                        symbol = text.charAt(i);
                    else
                        System.out.print(symbol);
                }
            }
        }
    }

    // дешифрование текста
    public static void decipher(String text, int key, Character[] alfabet) {

        Character symbol='$';
        for (int i = 0; i < text.length(); i++) {

            for (int j = 0; j < alfabet.length; j++) {
                if (text.charAt(i) == alfabet[j]) {
                    System.out.print(alfabet[(j - key + (alfabet.length)) % alfabet.length]);
                    break;
                } else {
                    if (j != alfabet.length - 1)
                        symbol = text.charAt(i);
                    else
                        System.out.print(symbol);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        Character[] alfabet;

        System.out.println("Выберите язык на котором будет введен текст.\nЕсли текст на английском языке, нажмите 1, на русском - 2");
        int language = vvod.nextInt();
        if (language == 1) {
            alfabet = new Character[en.length];
            System.arraycopy(en, 0, alfabet, 0, en.length);
        } else {
            alfabet = new Character[ru.length];
            System.arraycopy(ru, 0, alfabet, 0, ru.length);
        }

        System.out.println("Введите текст который вы хотите зашифровать");
        vvod.nextLine();
        String text = (vvod.nextLine()).toUpperCase();
        System.out.println("Введите ключ шифрования");
        int key = vvod.nextInt();
        System.out.println("Выберите режим - шифрование(1) или дешифрование(2)");
        int mode = vvod.nextInt();

        if (mode == 1)
            cipher(text, key, alfabet);
        else
            decipher(text, key, alfabet);

    }

}
