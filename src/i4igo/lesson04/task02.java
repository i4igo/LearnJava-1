package i4igo.lesson04;

import java.util.Scanner;

public class task02 {

	/** Используя тернарный оператор, написать алгоритм простейшего калькулятора
	 * в формате программа-диалог - программа спрашивает какое число ввести.
	 * Далее программа спрашивает на сколько изменить значение,
	 * а потом программа спрашивает - увеличить или уменьшить на это значение.
	 * Для этого необходимо ввести определенный код - например,
	 * чтобы увеличить - ввести 1, чтобы уменьшить - ввести 2.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner vvod = new Scanner(System.in);
		
		System.out.println("введите число:");
		int a=vvod.nextInt();
		System.out.println("введите значение на которое нужно изменить введенное число");
		int b=vvod.nextInt();
		System.out.println("выберите, арифметическую операцию:");
		System.out.println("увеличть НА - введите 1, увеличить В - 2, уменьшить НА - 3, уменьшить В - 4");
		int c=vvod.nextInt();
		System.out.println("результат: "+((c==1)? (a+b) : (a-b)));
	}

}
