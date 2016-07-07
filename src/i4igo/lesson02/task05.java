package i4igo.lesson02;

import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Введите радиус круга:");
		
		/** метод nextInt() - сканирует следующий токен как float
		 */
		float r_circle = scan.nextFloat();
		
		/** Math.PI - число Пи
		 *  Math.pow(a,b) - возведение числа a в степень b
		 */
		double v_circle = (4*Math.PI*Math.pow(r_circle, 3))/3;
		System.out.println("Введите радиус круга: " + v_circle);
	}
}
