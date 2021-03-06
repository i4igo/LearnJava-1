package i4igo.lesson07;

import java.util.Scanner;

/**
 * Created by Ev on 27.05.2016.
 */
public class PuntoSwitcher {

    /** С клавиатуры вводится любая последовательность буквенных символов в одной раскладке клавиатуры,
     *  программа превращает ее в последовательность символов, которые стоят в соответствии с раскладкой клавиатуры.
     *
     *  Пример входных данных: > QWerty asdf zxcVBN
     *  Результат программы  : > ЙЦукен фыва ячсМИТ
     *
     *  символы , . / выводят и на англ. и на рус. раскладке - бю.
     *
     */

    public static void main(String[] args) {

        System.out.println("Введите строку на англ. или рус. раскладке");

        Scanner vvod = new Scanner(System.in);
        String text = vvod.nextLine();

        Character[] en = {' ','q','w','e','r','t','y','u','i','o','p','[',']',
                        'a','s','d','f','g','h','j','k','l',';','\'',
                        'z','x','c','v','b','n','m',
                        'Q','W','E','R','T','Y','U','I','O','P','{','}',
                        'A','S','D','F','G','H','J','K','L',':','"',
                        'Z','X','C','V','B','N','M','<','>','?',',','.','`','~','/','|','\\'};

        Character[] ru = {' ','й','ц','у','к','е','н','г','ш','щ','з','х','ъ',
                        'ф','ы','в','а','п','р','о','л','д','ж','э',
                        'я','ч','с','м','и','т','ь',
                        'Й','Ц','У','К','Е','Н','Г','Ш','Щ','З','Х','Ъ',
                        'Ф','Ы','В','А','П','Р','О','Л','Д','Ж','Э',
                        'Я','Ч','С','М','И','Т','Ь','Б','Ю',',','б','ю','ё','Ё','.','/','\\'};

        for(int i=0; i<text.length(); i++){
            for(int j=0; j<en.length; j++){
                if (((int)text.charAt(i))<=126) {
                    if (text.charAt(i) == en[j])
                        System.out.print(ru[j]);
                } else
                if (text.charAt(i)==ru[j]){
                    System.out.print(en[j]);
                }
            }
        }

    }
}
