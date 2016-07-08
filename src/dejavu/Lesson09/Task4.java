package dejavu.Lesson09;

import static dejavu.Lesson09.SelectTask.sc;

/**
 * Created by dejavu on 07.07.2016.
 * Задание 1
 * Анализ введеной строки и подсчет символов
 */
public class Task4 {
    static {
        new Task4();
    }
    private Task4() {
        String inputText;
        int toDo;

        System.out.println("Введите текст:");
        sc.nextLine();
        inputText = sc.nextLine();

        System.out.println("Выберите метод анализа\n" +
                "1 - анализ с учетом регистра\n" +
                "2 - анализ без учета регистра\n" +
                "0 - выйти из программы");

        toDo = sc.nextInt();

        if(toDo == 0) return;
    }
}
