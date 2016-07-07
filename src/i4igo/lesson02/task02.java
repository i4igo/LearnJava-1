package i4igo.lesson02;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите имя:");
		String name = scan.next();
		
		System.out.println("Введите пароль:");
		String parol = scan.next();
		
		System.out.println("Введите сегодняшнее число:");
		int date = scan.nextInt();
		
		System.out.println("Введите сегодняшний день:");
		String day = scan.next();
		
		System.out.println("Ваш имя: " + name);
		System.out.println("Ваш пароль: " + parol);
		System.out.println("Сегодня: " + date + " число " + day);
		
		// в скобках с переменной можно проводить арифметические операции
		System.out.println("Вчера было: " + (date-1) + " число");
		System.out.println("Завтра будет: " + (date+1) + " число");
	}

}
