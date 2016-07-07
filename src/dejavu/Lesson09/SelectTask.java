package dejavu.Lesson09;

import java.util.Scanner;

/**
 * Created by dejavu on 07.07.2016.
 * Select home task
 */
public class SelectTask {
    static Scanner sc = new Scanner(System.in);

    public SelectTask() {
        System.out.println("Укажите номер задачи (1-7)");
        int selectedTask = sc.nextInt();


        try {
            Class.forName("dejavu.Lesson09.Task"+selectedTask);

        } catch (ClassNotFoundException e) {
            System.out.println("Такой задачи не существует");
            new SelectTask();
        }
    }
}
