package i4igo.lesson06;

import java.util.Scanner;

public class task06 {

	/** "Умножение без умножения".
	 *  Считать с клавиатуры 2 числа и вычислить их умножение
	 *  не используя математическое операцию *
	 *  
	 *  Math.multiplyExact(a1, a2) - произведение двух чисел
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner vvod = new Scanner(System.in);
		
		System.out.println("Введите первое число: ");
		int a1 = vvod.nextInt();
		System.out.println("Введите второе число: ");
		int a2 = vvod.nextInt();
		
		System.out.println(Math.multiplyExact(a1, a2));
	}
}
