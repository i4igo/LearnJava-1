package Lesson04;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
/*		
		// Задача 1
		System.out.println("Введите число а");
		double a = sc.nextInt();
		
		System.out.println("Введите число b");
		double b = sc.nextInt();

		double c = a / b;
		
		double d = c - (int)c;
		
		System.out.println("Остаток от деления: " + d);
*/
		// Задача 2
		System.out.println("Введите значущее число");
		int a = sc.nextInt();
		
		System.out.println("Его необходимо изменить на:");
		int b = sc.nextInt();
		
		System.out.println("Если увеличить - введите 1, \n уменьшить - введите 2, \n увеличить в n раз - введите 3, \n уменьшить в n раз - введите 4");
		
		int toDo = sc.nextInt();
		
		switch (toDo){
		case 1:
			System.out.println("Ваш результат: " + (a+b) );
			break;
		case 2:
			System.out.println("Ваш результат: " + (a-b) );
			break;
		case 3:
			System.out.println("Ваш результат: " + (a*b) );
			break;
		case 4:
			System.out.println("Ваш результат: " + (a/b) );
			break;
		default:
			System.out.println("Вы ввели число отличное от 1 или 2:");
			break;
		}
			
		sc.close();
	}
}