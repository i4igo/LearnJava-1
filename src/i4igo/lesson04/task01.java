package i4igo.lesson04;

import java.util.Scanner;

public class task01 {
	
	/** Написать алгоритм вычисления остатка от целочисленного деления
	 * - алгоритм работы оператора % - для любых двух чисел, которые вводятся с клавиатуры
	 * Использовать в задаче ТОЛЬКО операторы +, -, * или /
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner vvod = new Scanner(System.in);
		
		System.out.println("введите первое число:");
		int a=vvod.nextInt();
		System.out.println("введите второе число:");
		int b=vvod.nextInt();
		
		int c=a/b;
		System.out.print("результат деления "+a +"/"+ b+" : целая часть - "+c);
		System.out.println(", остаток от деления - "+(a-(b*c)));
		
	}

}
