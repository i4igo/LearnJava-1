package i4igo.lesson06;

import java.util.Scanner;

public class task01 {

	/**Ввести число и программа должна по номеру месяца вывести пору года
	 * и название месяца. Учесть потенциальные ошибки ввода.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Введите номер месяца");
		
		Scanner vvod = new Scanner(System.in);
		int m = vvod.nextInt();
					
		switch(m){
		case 1:
			System.out.println("Январь - месяц зимы");
			break;
			
		case 2:
			System.out.println("Февраль - месяц зимы");
			break;
			
		case 12:
			System.out.println("Декабрь - месяц зимы");
			break;
			
		case 3:
			System.out.println("Март - месяц весны");
			break;
			
		case 4:
			System.out.println("Апрель - месяц весны");
			break;
			
		case 5:
			System.out.println("Май - месяц весны");
			break;
			
		case 6:
			System.out.println("Июнь - месяц лета");
			break;
			
		case 7:
			System.out.println("Июль - месяц лета");
			break;
			
		case 8:
			System.out.println("Август - месяц лета");
			break;
			
		case 9:
			System.out.println("Сентябрь - месяц осени");
			break;
			
		case 10:
			System.out.println("Октябрь - месяц осени");
			break;
			
		case 11:
			System.out.println("Ноябрь - месяц осени");
			break;
			
		default:
			if (m<0)
				System.out.println("Неправильный ввод!!! Месяца с номером "+m+" нет");
				if (m>12)
					System.out.println("Ошибка!!! В году всего 12 месяцев. Месяца с номером "+m+" нет");
		}
	}

}