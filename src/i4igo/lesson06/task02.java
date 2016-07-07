package i4igo.lesson06;

import java.util.Scanner;

public class task02 {

	/**Дано целое число. Определить: 
	 * а) является ли оно четным; 
	 * б) оканчивается ли оно цифрой 7; 
	 * в) оканчивается ли оно четной цифрой.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Введите любое целое число");
		
		Scanner vvod = new Scanner(System.in);
		int chislo = vvod.nextInt();
		
		// System.out.println("Введенное вами число "+chislo+((chislo%2==0) ? "" : " не")+" четное");
		
		if (chislo%2==0)
			System.out.println("Число "+chislo+" четное. Окончивается на четную цифру");
		else {
			System.out.print("Чиcло "+chislo+" нечетное. ");
			if (chislo%10==7)
				System.out.println("Оканчивается на цыфру 7.");
		}
	}

}