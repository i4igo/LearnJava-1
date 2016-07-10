package dejavu.Lesson09;

import static dejavu.Lesson09.SelectTask.sc;

/**
 * Created by dejavu on 07.07.2016.
 * Задание 1
 * Анализ введеной строки и подсчет символов
 */
public class Task5 {
    static {
        new Task5();
    }
    private Task5() {
        String pass;
        int mode;

        System.out.println("Программа – подборщик пароля. Введите пароль для подбора:");
        pass = sc.next();

        System.out.println("Выберите режим подбора. Нажмите:\n" +
                "1 - справа налево\n" +
                "2 - слева направо\n" +
                "0 - выйти из программы");

        mode = sc.nextInt();

        if(mode == 1)       getPassRL(pass);
        else if (mode == 2) getPassLR(pass);
    }

    private void getPassLR(String pass) {
        int i = 0;
        String output="";

        while ( i < pass.length() ){
            int n = 33;

            while ( n < 256){
                if ( (char)n == pass.charAt(i)) break;

                System.out.println(output + ( (char) n ) );
                n++;
            }

            output += (char) n;

            i++;
        }

        System.out.println("Ваш пароль:\n\n" + output);
    }

    private void getPassRL(String pass) {
        int i = pass.length()-1;
        String output="";

        while ( i >= 0 ){
            int n = 33;

            while ( n < 256){
                if ( (char)n == pass.charAt(i)) break;

                System.out.println(( (char) n ) + output);
                n++;
            }

            output = (char) n + output;

            i--;
        }

        System.out.println("Ваш пароль:\n\n" + output);
    }
}
