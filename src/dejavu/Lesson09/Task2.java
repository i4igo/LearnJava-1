package dejavu.Lesson09;

import static dejavu.Lesson09.SelectTask.sc;

/**
 * Created by dejavu on 07.07.2016.
 * Задание 1
 * Валютный конвертор
 */
public class Task2 {
    static {
        new Task2();
    }
    private Task2() {
        int inCur;
        int outCur;
        float sum;

        inCur   = getCurrency(true);
        outCur  = getCurrency(false);

        if (inCur == 0 || outCur == 0) return;

        System.out.println("Совершить перевод из " + getCySymbol(inCur, false) +
                " в валюту " + getCySymbol(outCur, false) + "\n" +
                "Введите исходную сумму:");
        sum = sc.nextFloat();

        convertCurrency(inCur, outCur, sum);

        System.out.println("Продолжить?\n1 - да\n0 - выход");

        if(sc.nextInt() == 1 ) new Task2();
    }

    private int getCurrency(boolean exit){
        int currency;

        System.out.println("Выберите " +
                (exit ? "исходную": "целевую") +
                " валюту:\n" +
                "1 - гривна\n" +
                "2 - доллар\n" +
                "3 - евро\n" +
                "4 - фунт\n"+
                (exit ? "0 - Выйти из программы": "" )
        );

        currency = sc.nextInt();

        getCySymbol(currency, true, exit);

        return currency;
    }

    private String getCySymbol( int currency, boolean ...print){
        String cySymbol;

        switch (currency){
            case 1:
                cySymbol = "₴";
                break;
            case 2:
                cySymbol = "$";
                break;
            case 3:
                cySymbol = "€";
                break;
            case 4:
                cySymbol = "£";
                break;
            default:
                return "exit";
        }

        if ( print[0]) System.out.println("Выбрана " + (print[1] ? "исходная": "целевая") + " валюта: " + cySymbol);

        return cySymbol;
    }

    private void convertCurrency(int inCur, int outCur, float sum){
        double result;
        double exchange[] = {1, 24.577, 26.971, 30.848};

        result = Math.round( sum*exchange[outCur-1]/exchange[inCur-1] );

        System.out.println("Введенная сумма " + sum + " " +
                getCySymbol(inCur, false) +
                " пересчитана в " + result + " " +
                getCySymbol(outCur, false));
    }
}
