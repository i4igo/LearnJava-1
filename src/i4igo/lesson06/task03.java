package i4igo.lesson06;

import java.util.Scanner;

public class task03 {

	/**Дано двузначное число. Определить:
	 * а) какая из его цифр больше, первая или вторая;
	 * б) одинаковы ли его цифры.
	 * 
	 * проверка на двузначность числа - (chislo/10>=1) & (chislo/10<10)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Введите двузначное число");
		
		Scanner vvod = new Scanner(System.in);
		int chislo = vvod.nextInt();
		
		int a=chislo/10;
		int b=chislo%10;
		
		if ((a>=1) & (a<10))
			if (a>b)
				System.out.println("Число "+chislo+" двузначное. Первая цифра "+a+" больше второй цыфры "+b);
			else
				System.out.println("Число "+chislo+" двузначное. Первая цифра "+a+" меньше второй цыфры "+b);
		else
			System.out.println("Чиcло "+chislo+" недвузначное ");
	}

}