package i4igo.lesson06;

import java.util.Scanner;

public class task11 {

	/** Программа считает среднее арифметическое вводимых с клавиатуры чисел.
	 *  Сначала программа предлагает ввести количество этих чисел,
	 *  а потом предлагает непосредственно вводить эти числа. 
	 *  Ответ должен быть округлен по правилу правилам округления.
	 *  
	 *  Использовать решение задачи 8 и создать повторяемую программу анализатор текста.
	 *  Программа на входи принимает строку текста и затем символ,
	 *  количество которого в строке необходимо высчитать программе.
	 *  Повторившись, программа должна принять другой текст и произвести аналогичные действия
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int variant = 0;
		int k=0;
				
	do {
		Scanner vvod = new Scanner(System.in);
		
		System.out.println("Введите текст который вы хотите проанализировать");
		String text = vvod.nextLine();
		
		while(text.isEmpty()){
			System.out.println("ОШИБКА!!! Строка пустая. Введите текст");
			text = vvod.nextLine();
		}
		
		System.out.println("Ведите символ, который нужно найти в тексте");
		String poisk = vvod.nextLine();
		
		while(poisk.length()>1){
			System.out.println("ОШИБКА!!! Вы ввели больше 1 символа. Повторите ввод");
			poisk = vvod.nextLine();
		}
		
		char simbol = poisk.charAt(0);
		
		for (int i=0; i<text.length(); i++){
			if (text.charAt(i)==simbol)
				k++;
			}
		
		System.out.println("Символ "+simbol+" встречается в тексте "+k+" раз");
				
		System.out.println("Хотите продолжить? Да - введите 1, нет - введите 0");
		variant=vvod.nextInt();
		
	}
		while(!(variant==0));		
		System.out.println("Спасибо за внимание");
	}
}
