package i4igo.lesson08;

import java.util.Scanner;

/** Created by Ev on 01.07.2016.
 *
 *  Существует список писателей и список их произведений в формате "писатель - название произведения".
 *  У каждого писателя должно быть несколько произведений.
 *  При вводе имени писателя пользователем с клавиатуры на консоль выводится список произведений этого писателя в случайном порядке.
 *  Программа должна работать и при неполном введенном имени  писателя.
 *
 */

public class Library {

    private static final String[][] LIBRARY = {
                                              {"Чехов А.П.","Чайка","О любви","Дама с собачкой","Три сестры"},
                                              {"Франко И.Я.","Захар Беркут","Украденное счастье","Если бы камни говорили","Крашеный лис"},
                                              {"Гоголь Н.В.","Тарас Бульба","Мертвые души","Ревизор","Нос"}
                                              };

    // метод исчет
    private static void writerSearch(String writer) {

        int label = 0;

        if(writer.length()>0) {
            for(int j=0, i=0; i<LIBRARY.length; i++){
                if ((LIBRARY[i][j].toUpperCase()).contains(writer.toUpperCase())) {
                    System.out.println("Запрашиваемый автор: "+LIBRARY[i][j]+" Его произведения есть в библиотеке");
                    for (int k = i + 1; k < LIBRARY[i].length; k++) {
                        label++;
                        System.out.println(LIBRARY[i][k]);
                    }
                } else {
                    if(label==0 && i==LIBRARY.length-1)
                        System.out.println("Такого автора нет в библиотеке");
                }
            }
        } else
            System.out.println("Вы не ввели данные для поиска");
    }

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Программа - библиотека художественной литературы.\nУкажите автора, чтобы просмотреть список его произведений:");
        String writer = vvod.nextLine();
        writerSearch(writer);

        vvod.close();
    }

}
