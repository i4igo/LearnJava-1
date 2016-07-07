package i4igo.lesson06;

import java.util.Scanner;

public class task09 {

	/** Программа считает среднее арифметическое вводимых с клавиатуры чисел.
	 *  Сначала программа предлагает ввести количество этих чисел,
	 *  а потом предлагает непосредственно вводить эти числа. 
	 *  Ответ должен быть округлен по правилу правилам округления.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner vvod = new Scanner(System.in);
		
		System.out.println("Введите к-во чисел для определения среднего арифметического:");
		int k_vo = vvod.nextInt();
		int [] spisok = new int[k_vo];
		
		for (int i=1; i<=k_vo; i++){
			System.out.println("Введите "+i+"-е число:");
			spisok[i-1]=vvod.nextInt();
		}
	
		float sum=0;
		
		for (int i=0; i<spisok.length; i++){
			sum+=spisok[i];
		}
		
		System.out.println("Среднее арифметическое: "+(int)Math.rint(sum/spisok.length));
	
	}
}
