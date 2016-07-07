package i4igo.lesson08;

import java.util.Scanner;

/** Created by Ev on 28.06.2016.
 *
 * Программа - база данных сотрудников.
 *      Необходимо ввести:
 *      - имя
 *      - фамилию
 *      - возраст
 *      - зарплату.
 *
 * В результате программа должна вывести на экран форматированную табличку по этим сотрудникам -
 * данные разделены строго по колонкам. Фамилии, имена и т.д. сотрудников придумать как длинные, так и короткие.
 *
 */

public class DatabasePersonnel {

    final static String[] MASS_TABL = {"Имя","Фамилия","Возраст","Зарплата"};
    static String[][] db = new String[20][4];
    static int[] massMax = new int[4];

    // заполняем массив информацией о сотруднике
    private static void inputDB(Scanner vvod) {

        int i = 0;
        for (i=0; i<db.length; i++){
            if (db[i][0] == null)
                break;
        }

        vvod.nextLine();

                System.out.println("Введите имя сотрудника");
                db[i][0] = vvod.nextLine();

                System.out.println("Введите фамилию сотрудника");
                db[i][1] = vvod.nextLine();

                System.out.println("Введите возраст сотрудника");
                db[i][2] = vvod.nextLine();

                System.out.println("Введите зарплату сотрудника");
                db[i][3] = vvod.nextLine();

                System.out.println("Информация по сотруднику добавлена");
                System.out.println("");
    }


    // метод maxField определяет максимальную длинну элементов массивов
    private static int maxField(int iLength, int column) {
        int maxFieldName = MASS_TABL[column].length();
        int nameDefault;

        for (int j = column, i = 0; i < iLength; i++) {
            nameDefault = db[i][j].length();
            if (nameDefault > maxFieldName)
                maxFieldName = nameDefault;
        }
        return maxFieldName;
    }

    // вывод баззы данных
    private static void outputDB(){

        // поиск строки с ячейкой null
        int i,j=0;
        for (i=0; i<db.length; i++){
            if (db[i][j] == null)
                break;
        }

        // заполняем массив максимальными значения
        for (int column = 0; column<4; column++) {
            massMax[column] = maxField(i, column);
        }

        // выводим оглавление таблицы
        outputTabl();
        System.out.println("");

        // заполняем таблицу, данными сотрудников
        for (j=0; j<i; j++) {
            outputFields(j);
        }
    }

    // форматированный вывод (в столбики)
    private static void outputFields(int i){

        int k;
        int nameDefault;

        for (int column=0; column<4; column++) {

            nameDefault = db[i][column].length();

            if (nameDefault < massMax[column]) {
                k = massMax[column] - nameDefault;
                System.out.print(db[i][column]);

                for (int l = 0; l < k + 3; l++)
                    System.out.print(" ");
            } else
                System.out.print(db[i][column] + "   ");
        }
        System.out.println("");
    }

    private static void outputTabl() {

        int k;
        for (int column=0; column<4; column++) {
            if (MASS_TABL[column].length() < massMax[column]) {
                System.out.print(MASS_TABL[column]);
                k = massMax[column] - MASS_TABL[column].length();
                for (int l = 0; l < k + 3; l++)
                    System.out.print(" ");
            } else {
                massMax[column]=MASS_TABL[column].length();
                System.out.print(MASS_TABL[column] + "   ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        int mode=-1;

        while(mode!=0) {
            System.out.println("База данных сотрудников. Введите\n" +
                    "1 – добавить сотрудника\n" +
                    "2 – Вывести список сотрудников\n" +
                    "0 - завершить программу\n");

            mode = vvod.nextInt();

            switch (mode) {
                case 1:
                    System.out.println("Добавление информации по сотруднику");
                    inputDB(vvod);
                    break;

                case 2:
                    System.out.println("Выводим информации по сотрудникам");
                    System.out.println("");
                    outputDB();
                    System.out.println("");
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Ошибка ввода!!! Повторите попытку");
            }
        }

        vvod.close();

    }

}
