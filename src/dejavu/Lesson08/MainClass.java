package dejavu.Lesson08;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SelectTask();
		sc.close();
	}

	private static void SelectTask(){
		System.out.println("ведите номер задачи (1-12)");
		int selectedTask = sc.nextInt();

		switch (selectedTask){
			case 1:
				System.out.println("Задача1");
				System.out.println("Вывод месяца по номеру");
				task1();
				break;
			case 2:
				System.out.println("Задача2");
				System.out.println("Определить четность, окончание числа");
				task2();
				break;
			case 3:
				System.out.println("Задача3");
				System.out.println("Равенство цифр числа");
				task3();
				break;
			case 4:
				System.out.println("Задача4");
				System.out.println("Операции с четырёхзначным числом");
				task4();
				break;
			case 5:
				System.out.println("Задача5");
				System.out.println("Найбольшая цифра в трёхзначном числе");
				task5();
				break;
			case 6:
				System.out.println("Задача6");
				System.out.println("Умножение без умножения");
				task6();
				break;
			case 7:
				System.out.println("Задача7");
				System.out.println("каждые 10 минут");
				task7();
				break;
			case 8:
				System.out.println("Задача8");
				System.out.println("Подсчет символов в тексте");
				task8();
				break;
			case 9:
				System.out.println("Задача9");
				System.out.println("Среднее арифметическое");
				task9();
				break;
			case 10:
				System.out.println("Задача10");
				System.out.println("Степени Доса");
				task10();
				break;
			case 11:
				System.out.println("Задача11");
				System.out.println("");
				task11();
				break;
			case 12:
				System.out.println("Задача12");
				System.out.println("");
				task12();
				break;
		}
	}

	private static void task1(){
		System.out.println("Введите номер месяца:");
		int numMonth = sc.nextInt();

		if(numMonth < 1 ) {
			System.out.println("Нет такого месяца! Машину времени еще не изобрели!.");
			task1();
		}

		if(numMonth > 12 ) {
			System.out.println("Нет такого месяца! Введенное число больше, чем требуется.");
			task1();
		}


		switch (numMonth){
			case 1:
				System.out.println("Январь - месяц зимы");
				break;
			case 2:
				System.out.println("Февраль - месяц зимы");
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
			case 12:
				System.out.println("Декабрь - месяц зимы");
				break;
		}
	}
	private static void task2(){
		int userNumber;

		System.out.println("Введите число:");
		userNumber = sc.nextInt();

		if( userNumber == 0 ) System.out.println("Введен Ноль!");

		System.out.println("Число " + (userNumber % 2 ==0 ? "": "не ") + "кратное");

		if ( Integer.toString(userNumber).endsWith("7") )
			System.out.println("Число оканчивается на 7");

		else System.out.println("Число не оканчивается на 7");

		String numberToString = Integer.toString(userNumber);
		int lastNum  = (int) numberToString.charAt((numberToString.length() - 1));

		System.out.println("Число оканчивается " + (lastNum %2 ==0 ? "": "не") + " четной цифрой");


	}
	private static void task3(){
		int userNumber;

		System.out.println("Введите двухзначное число:");
		userNumber = sc.nextInt();

		if(userNumber < -99 || userNumber > -10 && userNumber < 10 || userNumber > 99) {
			System.out.println("Вы ввели не двухзначное число");
			task3();

		} else {
			String numberToString = Integer.toString(userNumber);

			int firstNum  	= (int) numberToString.charAt(0);
			int lastNum  	= (int) numberToString.charAt(1);

			if( firstNum == lastNum ) 		System.out.println("Оба числа одинаковы");
			else if (firstNum > lastNum) 	System.out.println("Первое число больше");
			else 							System.out.println("Второе число больше");
		}
	}
	private static void task4(){
		int userNumber;

		System.out.println("Введите четирехзначное число:");
		userNumber = sc.nextInt();

		if(userNumber < -9999 || userNumber > -1000 && userNumber < 1000 || userNumber > 9999) {
			System.out.println("Вы ввели не четирехзначное число");
			task3();

		} else {
			String numberToString = Integer.toString(userNumber);

			int firstNum  	= (int) numberToString.charAt(0);
			int secondNum	= (int) numberToString.charAt(1);
			int threeNun	= (int) numberToString.charAt(2);
			int lastNum  	= (int) numberToString.charAt(3);

			if( (firstNum + secondNum) == (threeNun + lastNum) )
				System.out.println("Сумма пар чисел равна");

			if ((firstNum + secondNum + threeNun + lastNum) % 3 == 0 )
				System.out.println("Сумма чисел кратна трём");

			int multiNum = firstNum * secondNum * threeNun * lastNum;
			if ( multiNum % 4 == 0 )
				System.out.println("Произведение чисел кратна четырём");

			System.out.println("Введите проверочное число");
			int checkNum = sc.nextInt();

			if( multiNum % checkNum == 0)
				System.out.println("Произведение чисел крато проверочному числу");
		}
	}
	private static void task5(){
		int randomNum = (int) (Math.random()*1000);

		String stringNum = "" + randomNum;

		int i = 0;
		char maxNum = 0;

		while( i < stringNum.length()-1 ){
			maxNum = ( (int) (stringNum.charAt(i)) > (int) (stringNum.charAt(i+1)) )
					? stringNum.charAt(i)
					: stringNum.charAt(i+1);
			i++;
		}
		System.out.println( "В числе " + randomNum +" наибольшая цифра " + maxNum);
	}
	private static void task6(){
		System.out.println("Введите первое число");
		int firstNum = sc.nextInt();

		System.out.println("Введите второе число");
		int secondNum = sc.nextInt();

		int result = 0;
		int i = 0;

		while(i < secondNum){
			result += firstNum;
			i++;
		}

		System.out.println(result);
	}
	private static void task7(){
		int sec = 0;

		while (sec < 86400){
			if(sec % 600 == 0 && sec/3600 >= 9 && sec <= 64800) {
				int hour = sec/3600;
				int min = (sec - (hour * 3600)) /60;
				System.out.println( hour + ":" + (min == 0 ? "00": min ) );
			}
			if(sec > 86400) sec = 0;
			sec++;
		}
	}
	private static void task8(){
		String text = "> Внутри Java существуют несколько основных семейств технологий: " +
				"Java SE — Java Standard Edition, основное издание Java, содержит компиляторы, " +
				"API, Java Runtime Environment; подходит для создания пользовательских приложений, " +
				"в первую очередь — для настольных систем. Java EE — Java Enterprise Edition, " +
				"представляет собой набор спецификаций для создания программного обеспечения уровня " +
				"предприятия. Java ME — Java Micro Edition, создана для использования в устройствах, " +
				"ограниченных по вычислительной мощности, например, в мобильных телефонах, КПК, " +
				"встроенных системах; JavaFX — технология, являющаяся следующим шагом в эволюции " +
				"Java как Rich Client Platform; предназначена для создания графических интерфейсов " +
				"корпоративных приложений и бизнеса. Java Card — технология предоставляет безопасную " +
				"среду для приложений, работающих на смарт-картах и других устройствах с очень " +
				"ограниченным объёмом памяти и возможностями обработки.";

		System.out.println("Введите номер желаемой задачи:");
		System.out.println("1 - только больших латинских букв");
		System.out.println("2 - больших и малых букв латинского алфавита");
		System.out.println("3 - служебных символов");

		int anTask = sc.nextInt();
		int i;
		int n;

		if( anTask ==1 ){
			n = 0;

			for(i=0; i < text.length(); i++){
				if( Character.isUpperCase( text.charAt(i) ) ){
					n++;
					System.out.println(n + "-я заглавная буква: " + text.charAt(i) + " /позиция " + i + "/");
				}
			}
		}

		if( anTask ==2 ){
			n = 0;

			for(i=0; i < text.length(); i++){
				char currentLetter = text.charAt(i);

				if((currentLetter >= 'A' && currentLetter <= 'Z')
						|| (currentLetter >= 'a' && currentLetter <= 'z'))
					n++;
			}

			System.out.println("Текст содержит " + n + " латинских символов");
		}

		if( anTask ==3 ){
			n = 0;

			for(i=0; i < text.length(); i++){
				if( !Character.isAlphabetic( text.charAt(i) ) &&  text.charAt(i) != ' '){
					n++;
					System.out.println(n + "-й служебный символ: " + text.charAt(i) + " /позиция " + i + "/");
				}
			}
		}
	}
	private static void task9(){
		System.out.println("Введите количество чисел для определения их среднего арифметического:");
		int qtyNumbers = sc.nextInt();
		int userNumbers[] = new int[qtyNumbers];
		int i;
		float result = 0;


		for( i = 0; i < qtyNumbers; i++) {
			System.out.println("Введите " + ( i + 1 ) + "-е число");
			userNumbers[i] = sc.nextInt();
		}


		for(i = 0; i < qtyNumbers; i++){
			result += userNumbers[i];
		}
		System.out.println("Среднее арифметическое введенных чисел: " + ( Math.round( (result/qtyNumbers)) ));
	}
	private static void task10(){
		System.out.println("Впадло, примитив");
	}
	private static void task11(){
		System.out.println("Впадло, примитив");
	}
	private static void task12(){
		String[] list = {"01-track_01.mp3", "02-track_02.mp3", "03-track_03.mp3", "04-track_04.mp3",
				"05-track_05.mp3", "06-track_06.mp3",
				"07-track_07.mp3", "08-track_08.mp3",
				"09-track_09.mp3", "10-track_10.mp3"};
		for (int i =0; i < list.length; i++){
			int random = (int) ( Math.random()*(list.length-1));
			String bufferText = list[random];
			list[random] = list[i];
			list[i] = bufferText;
		}

		System.out.println(Arrays.toString(list));
	}
}
