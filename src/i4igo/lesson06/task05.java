package i4igo.lesson06;

import java.util.Scanner;

public class task05 {

	/** Создать программу,
	 *  выводящую на экран случайно сгенерированное трёхзначное натуральное число
	 *  и его наибольшую цифру.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int chislo=(int)(100+Math.random()*899);
		
		int a=(chislo/100);
		int b=(chislo%100)/10;
		int c=(chislo%10);
			
		System.out.println("Введенное число: "+chislo);
		System.out.println("Найбольшая цыфра: "+(Math.max(a, (Math.max(b, c)))));
	}
}
