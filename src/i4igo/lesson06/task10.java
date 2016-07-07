package i4igo.lesson06;

import java.util.Scanner;

public class task10 {

	/** Придумать алгоритм "старых досовских" программ.
	 *  Программа может повторять свои действия.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner vvod = new Scanner(System.in);
		
		System.out.println("Программа вычисляет степень введенного числа");
		int variant;
		
		do {
			System.out.println("Введите число");
			int chislo=vvod.nextInt();
			System.out.println("Введите степень в которую вы хотите возвести Ваше число");
			int chislo_st=vvod.nextInt();
			
			int result=(int) Math.pow(chislo, chislo_st);
			System.out.println("Число "+chislo+" в степени "+chislo_st+" равно "+result);
			System.out.println("Хотите продолжить? Да - введите 1, нет - введите 0");
			variant=vvod.nextInt();
		}
		
		while(!(variant==0));
		
		System.out.println("Спасибо за внимание");
	}

}
