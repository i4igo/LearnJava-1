package i4igo.lesson02;

import java.util.Scanner;

public class task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите диапазон. Введите начало диапазона:");
		int l1 = scan.nextInt();
		System.out.println("Введите конец диапазона:");
		int l2 = scan.nextInt();
		
		/** Math.random() возвращает псевдослучайное вещественное число из промежутка [0;1).
		 *  Если требуется получить число из другого диапазона,
		 *  то значение функции можно умножать на что-то,
		 *  сдвигать и, при необходимости, приводить к целым числам
		 */
		
		System.out.println((int)(Math.random()*(l2-l1)+l1));
	}

}
