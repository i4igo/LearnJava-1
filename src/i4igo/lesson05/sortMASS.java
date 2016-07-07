package i4igo.lesson05;

public class sortMASS {

    /**
     * 1.создать массив int-ов со, скажем, 20-ю элементами (длина, по сути, значения не имеет).
     * 2.заполнить его рандомными значениями от 0 до 10. (пока этого не умеем, заполнить единожды в ручную).
     * 3.рандомно выбрать одно значение separ от 0 до 10.
     * 4.перебросить все все значения меньше separ влево, все значения больше вправо.
     * 5.вывести измененный массив на экран.
     * <p>
     * Доп. условие: использовать только ОДИН массив (сущность массива), который изменяется в ходе программы.
     * Т.е., по сути, нужно написать свой сортировщик элементов массива.
     */

    public static void main(String[] args) {
        int[] array = new int[40];

        // заполняем и выводим массив
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // выбираем переменную, которая будет сортировать массив
        int separ = (int) (Math.random() * 11);
        System.out.println(separ);

        int k1 = 0;
        int k2 = 0;
        int value;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < separ)
                k1++;
            else
            if (array[i] == separ)
                k2++;
        }

        // групировка элементов равных переменной separ
        for (int i = 0; i < array.length; i++) {
            if (array[i] == separ) {
                for (int j = k1; j < array.length; j++) {
                    if (array[j] != separ) {
                        value = array[j];
                        array[j] = array[i];
                        array[i] = value;
                    } else
                        continue;
                }
            }
        }

        int k = 1;
        int positionMAX = -1;
        int pMAX = 0;

        // переброс элементов, которые больше вправо, которые меньше - влево
        while (k != 0) {
            k=0;
            pMAX = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > separ){
                    if (pMAX == 0) {
                        positionMAX = i;
                        pMAX++;
                    }
                }

                if (array[i] < separ & positionMAX != -1 & i > positionMAX){
                    value = array[positionMAX];
                    array[positionMAX] = array[i];
                    array[i] = value;
                    positionMAX = -1;
                    pMAX=0;
                    k++;
                }
            }
        }

        // выводим отсортированный массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
