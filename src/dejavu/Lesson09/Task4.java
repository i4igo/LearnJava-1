package dejavu.Lesson09;

import java.util.ArrayList;

import static dejavu.Lesson09.SelectTask.sc;

/**
 * Created by dejavu on 07.07.2016.
 * Задание 4
 * База Данных сотрудников
 */
public class Task4 {
    private ArrayList<String[]> db = new ArrayList<>();

    static {
        new Task4();
    }
    private Task4() {
        db.add(new String[]{"Имя", "Фамилия", "Возраст", "Зарплата"});

        System.out.print("База данных сотрудников. ");
        getMenu();
    }

    private void getMenu() {
        int menuSelected;

        System.out.println("Введите:\n" +
                "1 - добавить сотрудника\n" +
                "2 - вивести список сотрудников\n" +
                "0 - завершить программу");

        menuSelected = sc.nextInt();

        if( menuSelected == 1 ) addWorker();
        else if ( menuSelected == 2) showWorkers();
        else return;
        getMenu();
    }

    private void addWorker() {
        String firstName;
        String lastName;
        String age;
        String salary;

        System.out.println("Добавление информации по сотруднику.\n" +
                "Введите фамилию сотрудника:");
        lastName = sc.next();

        System.out.println("Введите имя сотрудника:");
        firstName = sc.next();

        System.out.println("Введите возраст сотрудника:");
        age = sc.next();

        System.out.println("Введите зарплату сотрудника:");
        salary = sc.next();

        db.add(new String[]{lastName, firstName, age, salary});
        System.out.println("Работник добавлен");
    }

    private void showWorkers() {
        int maxLengths[] = getMaxLengths(db);
        String outputText = "";

        for (String[] worker: db){
            int i = 0;
            String row ="";

            while( i < 4){
                row += prepareString(worker[i], maxLengths[i]);
                i++;
            }

            outputText += row + "\n";
        }

        System.out.println(outputText);
    }

    private int[] getMaxLengths(ArrayList<String[]> db) {
        int maxLengths[] = {0,0,0,0};

        for (String[] rows: db) {
            int i = 0;
            while ( i < 4 ) {
                maxLengths[i] = (rows[i].length() > maxLengths[i]) ? rows[i].length() : maxLengths[i];
                i++;
            }
        }

        return maxLengths;
    }

    private String prepareString(String s, int maxLength) {
        return String.format("%-" + maxLength + "s", s) + "\t";
    }
}
