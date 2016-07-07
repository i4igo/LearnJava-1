package i4igo.lesson07;

import java.util.Scanner;

/**
 * Created by Ev on 27.05.2016.
 */
public class GoogleTranslate {

    /** С клавиатуры вводится любая последовательность буквенных символов на одном языке,
     *  программа превращает ее в последовательность символов, которые соответствуют звукам в языках.
     *
     *  Пример входных данных: > Я знаю английский как гугл транслейт
     *  Результат программы  : > Ja znayu angliyskiy kak gugl transleit
     *
     */

    public static void main(String[] args) {
        System.out.println("Введите последовательность символов которую хотите перевести");

        Scanner vvod = new Scanner(System.in);
        String text = vvod.nextLine();

        Character[] ru = {'А','Б','В','Г','Д','Е','Ж','З','И','Й','К','Л','М','Н','О',
                        'П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я',
                        'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о',
                        'п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};

        String[] en = {"A","B","V","G","D","E","Zh","Z","I","Y","K","L","M","N","O",
                        "P","R","S","T","U","F","Kh","Ts","Ch","Sh","Shch","","Y","","","Yu","Ya",
                        "a","b","v","g","d","e","zh","z","i","y","k","l","m","n","o",
                        "p","r","s","t","u","f","kh","ts","ch","sh","shch","","y","","","yu","ya"};

        String simbolDouble = "";
        String simbol = "";

        for (int i=0; i<text.length(); i++) {

            if ((int)text.charAt(i) == 32)                  // если введен пробел
                System.out.print(" ");

            else if ((int)text.charAt(i) > 126){            // если введен символ русской расскладки
                    for (int j=0; j<ru.length; j++) {
                        if (text.charAt(i) == ru[j]) {
                            System.out.print(en[j]);
                        }
                    }
                }
                else

                if (i < text.length() - 1) {

                    simbolDouble = (String.valueOf(text.charAt(i))).concat(String.valueOf(text.charAt(i + 1)));

                    for (int j = 0; j < en.length; j++) {
                        if (simbolDouble.equals(en[j]) & !(String.valueOf(text.charAt(i+2)).equals('c'))) {
                            System.out.print(ru[j]);
                            simbol = "";
                            i++;
                            break;
                        }

                        if ((String.valueOf(text.charAt(i))).equals(en[j])) {
                            simbol = String.valueOf(ru[j]);
                        }
                    }
                    System.out.print(simbol);
                }

                // проверка последнего символа
                else
                    for (int j = 0; j < en.length; j++) {
                        if (String.valueOf(text.charAt(i)).equals(en[j])) {
                            System.out.print(ru[j]);
                        }
                    }

        }

    }
}