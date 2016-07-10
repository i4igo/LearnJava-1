package dejavu.Lesson09;

import static dejavu.Lesson09.SelectTask.sc;

/**
 * Created by dejavu on 07.07.2016.
 * Задание 7
 * Валидация Емейл
 */
public class Task7 {
    static {
        new Task7();
    }
    private Task7() {
        System.out.println("Программа проводит валидацию e-mail адреса");
        inputMail();

        getMenu();
    }

    private void getMenu() {
        System.out.println("Продолжить? Нажмите\n" +
                "1 - Да,\n" +
                "0 - Выйти из программы");

        if(sc.nextInt() == 1) inputMail();
    }

    private void inputMail() {
        System.out.println("Введите email:");
        String email = sc.next();

        if( checkMail(email) ) System.out.println("Адрес " + email + " ПРОШЕЛ Валидацию. УРА!");
        else inputMail();
    }

    private boolean checkMail(String email) {
        char currentSymbol;

        int lenghtMail = email.length();
        int abes = email.indexOf("@");
        int lastDot = email.lastIndexOf(".");

        if(abes > lastDot) {
            System.out.println("Нет точки в доменном адресе");
            return false;
        }

        if( abes != email.lastIndexOf("@") ) {
            System.out.println("Адрес содержит несколько символов @, что не допустимо! Введите адрес заново");
            return false;
        }

        if( !email.contains(".") ) {
            System.out.println("Адрес содержит ошибку в доменном имени - отсутствует точка! Введите адрес заново");
            return false;
        }

        if( abes < 1
                || (lenghtMail - abes - (lenghtMail - lastDot) ) < 2
                || (lenghtMail - lastDot) < 4) {
            System.out.println("Адрес является неполным. Введите адрес заново");
            return false;
        }

        for (int i = 0; i < lenghtMail; i++){
            currentSymbol = email.charAt(i);

            if( !Character.isAlphabetic(currentSymbol) && currentSymbol != '@' && currentSymbol != '.') {
                System.out.println("Адрес содержит содержит недопустимые символы. Введите адрес заново");
                return false;
            }
        }

        return true;
    }
}
