package i4igo.lesson08;

import java.util.Scanner;

/** Created by Ev on 14.06.2016.
 *
 *  Программа "обменник валют" с правильным отображением символов валют.
 *  Известен курс основных валют между собой (использовать любой подходящий источник).
 *  При вводе исходной суммы следует указать ее валюту и валюту целевой суммы.
 *
 *  Дополнительное задание – результат округлить до копеек.
 */

public class Exchange {

    // ₴ - гривна (8372), $ - долар (36), € - евро (8364), £ - англ. фунт стерлингов (163)
    static char[] znakCurrency = {'₴','$','€','£'};

    static  float[] ratesOf_UAH = {1,      0.040137f, 0.035756f, 0.028418f};
    static  float[] ratesOf_USD = {24.91f, 1,         0.89f,     0.71f};
    static  float[] ratesOf_EUR = {27.97f, 1.12f,     1,         0.79f};
    static  float[] ratesOf_GBP = {35.19f, 1.41f,     1.26f,     1};

    // метод перевода валюты в другую валюту
    private static void currencyExchange(int currencyStart, int currencyFinish, float money) {
        float result = 0;

        switch (currencyStart) {
            case 1:
                result = money * ratesOf_UAH[currencyFinish-1];
                System.out.println("Введенна сумма: " + money + " " + znakCurrency[currencyStart-1] + " пересчитана в " + Math.rint(result) + " " + znakCurrency[currencyFinish-1]);
                break;

            case 2:
                result = money * ratesOf_USD[currencyFinish-1];
                System.out.println("Введенна сумма: " + money + " " + znakCurrency[currencyStart-1] + " пересчитана в " + Math.rint(result) + " " + znakCurrency[currencyFinish-1]);
                break;

            case 3:
                result = money * ratesOf_EUR[currencyFinish-1];
                System.out.println("Введенна сумма: " + money + " " + znakCurrency[currencyStart-1] + " пересчитана в " + Math.rint(result) + " " + znakCurrency[currencyFinish-1]);
                break;

            case 4:
                result = money * ratesOf_GBP[currencyFinish-1];
                System.out.println("Введенна сумма: " + money + " " + znakCurrency[currencyStart-1] + " пересчитана в " + Math.rint(result) + " " + znakCurrency[currencyFinish-1]);
                break;

            default:
                System.out.println("ОШИБКА!!!");
        }
    }

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        int currencyStart;

        do {
            // выбираем валюту, которую хотим перевести
            System.out.println("Выберите исходную валюту. Нажмите:\n1 - гривна,\n2 - доллар,\n3 - евро,\n4 - фунт стерлингов,\n0 - выйти из программы");
            currencyStart = vvod.nextInt();
            if (currencyStart == 0)
                continue;

            // выбираем валюту, в которую хотим перевести
            System.out.println("Выберите целевую валюту. Нажмите:\n1 - гривна,\n2 - доллар,\n3 - евро,\n4 - фунт стерлингов");
            int currencyFinish = vvod.nextInt();
            System.out.println("Совершить перевод из " + znakCurrency[currencyStart-1] + " в валюту " + znakCurrency[currencyFinish-1]);

            // вводим количество денежных средств, которые хотим перевести
            System.out.println("Введите исходную сумму:");
            float money = vvod.nextFloat();

            currencyExchange(currencyStart, currencyFinish, money);

            System.out.println("Продолжить?\n1 - Да\n0 - Выйти из программы");
            int modeVariable = vvod.nextInt();
            if (modeVariable == 0)
                currencyStart = 0;
        }
        while (currencyStart!=0);

        vvod.close();
    }
}
