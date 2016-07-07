package i4igo.lesson08;

import java.util.Scanner;

/** Created by Ev on 03.07.2016.
 *
 *  На многих сайтах при регистрации следует ввести свой e-mail.
 *  Приблизительно достоверным значением адреса является такой, который:
 *      1) обязательно содержит символ @ в единственном числе и как минимум одну точку (которая должна обязательно быть в доменном адресе - после "@").
 *      2) количество лексем (ник, домен) как минимум три, например my@unicum.email
 *       3) в лексемах не должно быть служебных символов.
 *
 */

public class ParsingEmail {

    private static boolean valid = false;

    // метод проводит валидацию введенного e-mail адреса
    private static boolean parsing(String email) {

        if (email.indexOf('@') == -1) {
            System.out.println("Адрес является неполным. Введите адрес заново");
            return false;
        } else {
            if (email.indexOf('@') != email.lastIndexOf('@')) {
                System.out.println("Адрес содержит несколько символов @, что не допустимо! Введите адрес заново");
                return false;
            } else {
                String domen = email.substring(email.indexOf('@') + 1, email.length());
                if ((domen.indexOf('.') == -1) | (domen.indexOf('.') == 0) | (domen.indexOf('.') == domen.length() - 1)) {
                    System.out.println("Адрес является неполным. Введите адрес заново");
                    return false;
                }
            }
        }

        for (int i = 0; i < email.length(); i++ ){
            char symbol = email.charAt(i);
            if (!((symbol >= 65 & symbol <= 90) | (symbol >= 97 & symbol <= 122) | symbol == 46 | symbol == 64)) {
                System.out.println("Адрес содержит содержит недопустимые символы! Введите адрес заново");
                return false;
            }


        }

        System.out.println("Длинна " + email + " : " + email.length() + " символов");
        System.out.println("Адрес " + email +" ПРОШЕЛ Валидацию. УРА!");

        return true;
    }

    // метод возвращает true если пользователь хочет выйти с программы
    private static boolean validationOff(Scanner vvod) {

        System.out.println("Продолжить? Нажмите\n" +
                "1 - Да,\n" +
                "0 - Выйти из программы\n");
        int mode = vvod.nextInt();

        if (mode == 0)
            return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Программа проводит валидацию e-mail адреса");

        while(valid == false) {

            System.out.println("Введите email:");
            String email = vvod.nextLine();

            if (parsing(email)) {
                if (validationOff(vvod)) {
                    System.out.println("Программа завершилась!");
                    valid = true;
                }
            }
        }

        vvod.close();

    }

}
