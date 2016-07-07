package i4igo.lesson08;

import java.util.Scanner;

/** Created by Ev on 30.06.2016.
 *
 *  Программа – визуальный хакер пароля. По введенному с клавиатуры паролю программа должна отобразить на экране процесс его подбора как в голливудских фильмах.
 *
 *  Программа должна производить подбор в двух направлениях – с начала в конец и наоборот
 *
 */
public class PasswordSelection {

    private static StringBuilder passwordSelection = new StringBuilder();

    // в переменную записывает символы которые подобал
    private static void fromLeftToRight(String password) {

        StringBuilder passwordReverse = new StringBuilder();

        for (int i=password.length()-1; i>=0; i--){
            for(int j=33; j<127; j++){
                Character symbol = password.charAt(i);
                if (symbol == j) {
                    passwordReverse.append(symbol);
                    System.out.println(passwordReverse);
                    break;
                } else
                    System.out.println(passwordReverse +""+(char)j);
            }
        }

        for(int i = passwordReverse.length()-1; i>=0; i--) {
            passwordSelection.append(passwordReverse.charAt(i));
        }
    }

    // в переменную записывает символы которые подобал
    private static void fromRightToLeft(String password) {
        for (int i=0; i<password.length(); i++){
            for(int j=33; j<127; j++){
                Character symbol = password.charAt(i);
                if (symbol == j) {
                    passwordSelection.append(symbol);
                    System.out.println(passwordSelection);
                    break;
                } else
                    System.out.println(passwordSelection +""+(char)j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.println("Программа – подборщик пароля. Введите пароль для подбора:");

        String password = vvod.nextLine();

        System.out.println("Выберите режим подбора. Нажмите:\n" +
                "1 – справа налево\n" +
                "2 – слева направо\n" +
                "0 – выйти из программы\n");

        int mode = vvod .nextInt();

        switch (mode) {
            case 1:
                fromRightToLeft(password);
                System.out.println("Ваш пароль: " + passwordSelection);
                break;

            case 2:
                fromLeftToRight(password);
                System.out.println("Ваш пароль: " + passwordSelection);
                break;

            case 0:
                break;

            default:
                System.out.println("Ошибка ввода!!! Повторите попытку");
        }
    }


}
