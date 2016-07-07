package i4igo.lesson07;

import java.util.Scanner;

/**
 * Created by Ev on 05.06.2016.
 */
public class PasswordGenerator {

    /** Программа генерирует пароли. Она имеет два режима
     *  а) простой - содержит только латинские буквы вернего и нижнего регистра
     *  б) сложный - буквы, цифры и знаки препинания.
     *
     *  пароль должен быть длинной от 6-ти до 15-ти символов
     *  Сделать программу-диалог, которая по выбору пользователем типа режима выводит на экран сгенерированный пароль.
     *
     */

    static Character[] en1 = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                              'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                              'a','b','c','d','e','f','g','h','i','j','k','l','m',
                              'n','o','p','q','r','s','t','u','v','w','x','y','z'};

    static Character[] en2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                              'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                              'a','b','c','d','e','f','g','h','i','j','k','l','m',
                              'n','o','p','q','r','s','t','u','v','w','x','y','z',
                              '0','1','2','3','4','5','6','7','8','9',',','.','!',
                              '?',';',':','@','#','$','%','^','&','*','(',')','-',
                              '=','+','/','\\','<','>','[',']','{','}'};

    // генератор пароля
    public static void pGenerator(Character[] mass){

        Character[] array = new Character[(int)(6 + Math.random()*9)];
        for (int i = 0; i < array.length; i++) {
            array[i] = mass[(int) (Math.random() * mass.length)];
        }
        System.out.print("Ваш пароль: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        Character[] mass;
        int mode;

        do {
            System.out.println("Программа генерирует пароли.\nВыберите режим генерации");
            System.out.println("1 - простой пароль\n2 - сложный пароль\n0 - выйти из программы");

            mode = vvod.nextInt();

            if (mode == 1) {
                mass = new Character[en1.length];
                System.arraycopy(en1, 0, mass, 0, en1.length);
                pGenerator(mass);
            } else if (mode == 2){
                mass = new Character[en2.length];
                System.arraycopy(en2, 0, mass, 0, en2.length);
                pGenerator(mass);
            }

        } while(mode!=0);

        System.out.println("пока-пока)))");

        vvod.close();
    }

}
