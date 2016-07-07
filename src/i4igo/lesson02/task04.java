package i4igo.lesson02;

import java.util.Scanner;

public class task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите величину скорости:");
		
		/** метод nextInt() - сканирует следующий токен как int 
		 */
		int inputSpeed = scan.nextInt();
		// int translateSpeed = (int)(inputSpeed/3.6);
		// double translateSpeed = inputSpeed/3.6;
		
		/** Math.round() - возвращает аргумент, округлённый вверх до ближайшего числа 
		 */
		int translateSpeed = (int) Math.round(inputSpeed/3.6);
		
		System.out.println("Введенная скорость: "+inputSpeed+" км/час, "+" переводится в: "+translateSpeed+" м/сек");
	}

}
