package i4igo.lesson08;

import java.util.Scanner;

/** Created by Ev on 17.06.2016.
 *
 *  Программа-калькулятор - на экран выводится текст вычисления.
 *  Символами арифметических операций будут соответствующие клавиши "+", "-", "*" и "/". Необходимо делать проверки:
 *
 * 1) Пользователь может случайно нажать несколько клавиш одновременно – предлагать повторить ввод символа операции
 * 2) Пользователь может случайно нажать клавишу, не соответствующую требуемой – например, служебный символ, цифру или букву.
 *
 * Перед процессом непосредственного вычисления результата предложить пользователю способ обращения с введенными числами
 * – считать их как целые или как дробные.
 *
 */

public class Calc {

    static String[] massZnak={"+","-","*","/"};

    // ввод знака и его проверка на правильность
    private static String znakInput(Scanner vvod) {
        System.out.println("Выберите операцию которую хотите провести: +, -, *, /");
        vvod.nextLine();
        String znak = null;
        int k=-1;
        while (k==-1) {
            znak = vvod.nextLine();
            if (znak.length() > 1) {
                System.out.println("Ошибка ввода!!! Введенно больше одного символа\nПовторите ввод");
                k=-1;
                continue;
            } else
                k = 1;
            if (k==1){
                    for (int i=0; i<massZnak.length; i++){
                        if (!znak.equals(massZnak[i]))
                            k=-1;
                        else {
                            k=1;
                            break;
                        }
                    }
                    if (k==-1) {
                        System.out.println("Ошибка ввода!!! Введенно неправильный символ\nПовторите ввод");
                        continue;
                    }
            }
        }
        return znak;
    }

    // исходя из выбранного символа, проводяться арифметические операции
    private static void arithmetic(int chislo1, String znak, int chislo2) {
        int result;

        switch(znak.charAt(0)){
            case '+':
                result = chislo1 + chislo2;
                System.out.println("Результат " + chislo1 + "+" + chislo2 + "=" + result);
                break;

            case '-':
                result = chislo1 - chislo2;
                System.out.println("Результат " + chislo1 + "-" + chislo2 + "=" + result);
                break;

            case '*':
                result = chislo1 * chislo2;
                System.out.println("Результат " + chislo1 + "*" + chislo2 + "=" + result);
                break;

            case '/':
                result = chislo1 / chislo2;
                System.out.println("Результат " + chislo1 + "/" + chislo2 + "=" + result);
                break;

            default:
                System.out.println("ОШИБКА!!!");
        }
    }


    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        int modeBack=-1;

        do {
            System.out.println("Введите первое число");
            int chislo1 = vvod.nextInt();

            String znak = znakInput(vvod);

            System.out.println("Введите второе число");
            int chislo2 = vvod.nextInt();

            arithmetic(chislo1, znak, chislo2);

            System.out.println("Продолжить?\n1 - Да\n0 - Выйти из программы");
            int modeVariable = vvod.nextInt();
            if (modeVariable == 0)
                modeBack = 0;

        } while(modeBack!=0);

        vvod.close();

    }

}
