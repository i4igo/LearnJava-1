package i4igo.lesson02;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите имя файла:");
		String file = scan.next();
		
		System.out.println("Введите расширение файла:");
		String _file = scan.next();
		
		System.out.println("Ваш файл: " + file +"."+_file);
	}
}