package dejavu.Lesson09;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static dejavu.Lesson09.SelectTask.sc;

/**
 * Created by dejavu on 07.07.2016.
 * Задание 1
 * Анализ введеной строки и подсчет символов
 */
public class Task1 {
    static {
        new Task1();
    }
    private Task1() {
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
        if(toDo == 1) this.analyzeSensitive(inputText, true);
        if(toDo == 2) this.analyzeSensitive(inputText, false);
    }

    private void analyzeSensitive(String inputText, boolean sensitive){
        int[] resultCount = new int[6000];
        char currentSymbol;

        for(int i = 0; i < inputText.length(); i++){
            currentSymbol = inputText.charAt(i);

            if(!sensitive)
                currentSymbol = (("" + currentSymbol).toUpperCase()).charAt(0);

            resultCount[currentSymbol] += 1;
        }

        for (int i = 0; i < resultCount.length; i++ ){
            if(resultCount[i] != 0)
                System.out.println("Символ " +
                        ((char)i) +
                        ": " +
                        resultCount[i]
                        + " штук");
        }

        System.out.println("\nПродолжить?\n1 - да\n2 - нет");

        int toDo = sc.nextInt();

        if(toDo == 2) return;
        if(toDo == 1) new Task1();
    }
}
