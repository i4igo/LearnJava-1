package i4igo.lesson08;

import java.util.Scanner;

/** Created by Ev on 12.06.2016.
 *
 * Дана строка текста. Написать программу - отчет по статистике - какие символы сколько раз встречаются в тексте. Выполнить для двух вариантов:
 *      а) с учетом регистра – заглавные буквы (A, B, C, ... А, Б, В, ...) и строчные (a, b, c, ... а, б, в, ...) принимать как разные символы,
 *      б) без учета регистра – заглавные буквы и строчные принимать как один и тот же символ.
 *
 */

public class AnalysisText {

    static int k =0;

    // метод проверает был ли символ (symbol) в строке (text) с позиции 0 и до j, возвращает true
    public static boolean withRegister(int j, char symbol, String text) {
        for (int i=0; i<j; i++) {
            if (text.charAt(i) == symbol)
                return true;
        }
        return false;
    }

    // метод проверает был ли символ (symbol) в строке (text) с позиции 0 и до j не учитывая регистр, возвращает true
    public static boolean notRegister(int j, char symbol, String text) {
        for (int i=0; i<j; i++) {
            if (Character.toUpperCase(text.charAt(i)) == Character.toUpperCase(symbol))
                return true;
        }
        return false;
    }

    // метод считает сколько раз символы строки (text) встречаются в строке
    public static void analysisWithRegister(String text) {
        for (int i=0; i<text.length(); i++){                    // шагаем по строке
            char symbol = text.charAt(i);                       // выбираем элемент строки
            if (withRegister(i, symbol, text))                   // если метод возвращает true, оканчиваем итерацию
                continue;
            for (int j=i; j<text.length(); j++){                // если этого символа раньше небыло, то шагаем по строке дальше и считаем повторения
                if (text.charAt(j) == symbol)
                    k++;
            }
            System.out.println("Символ " + symbol + " встречается в тексте " + k + " раз");
            k=0;
        }
    }

    // метод повторяет действия метода analysisWithRegister() не учитывая их регистр
    public static void analysisNotRegister(String text) {
        for (int i=0; i<text.length(); i++){                    // шагаем по строке
            char symbol = text.charAt(i);                       // выбираем элемент строки
            if (notRegister(i, symbol, text))                   // если метод возвращает true, оканчиваем итерацию
                continue;
            for (int j=i; j<text.length(); j++){                // если этого символа раньше небыло, то шагаем по строке дальше и считаем повторения
                if (Character.toUpperCase(text.charAt(j)) == Character.toUpperCase(symbol))
                    k++;
            }
            System.out.println("Символ " + symbol + " встречается в тексте " + k + " раз");
            k=0;
        }
    }

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите текст для анализа:");
        String text = vvod.nextLine();
        System.out.println("Выберите режим:\n1 - анализ с учетом регистра\n2 - анализ без учета регистра\n0 - выйти с программы ");
        int mode = vvod.nextInt();

        while(mode!=0) {

            switch (mode) {
                case 1:
                    analysisWithRegister(text);

                    break;

                case 2:
                    analysisNotRegister(text);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("ОШИБКА ввода текста или выбора операции");
            }

            System.out.println("Хотите продолжить, нажмите 1, если хотите выйти нажмите 0");
            int modeVariable = vvod.nextInt();
            if (modeVariable == 0)
                break;

            System.out.println("Введите текст для анализа:");
            vvod.nextLine();
            text = vvod.nextLine();
            System.out.println("Выберите режим:\n1 - анализ с учетом регистра\n2 - анализ без учета регистра\n0 - выйти с программы ");
            mode = vvod.nextInt();
        }

        vvod.close();
    }

}
