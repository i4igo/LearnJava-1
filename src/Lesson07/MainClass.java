package Lesson07;

import java.util.Scanner;

public class MainClass {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		selectorTask();
		sc.close();
	}

	private static void selectorTask(){
		int selectedTask;

		System.out.println("Выберите Задачу (1-7)");


		selectedTask = sc.nextInt();

		System.out.println("Задача " + selectedTask);

		switch (selectedTask){
			case 1:
				System.out.println("Обратный текст");
				System.out.println("");
				task1();
				break;
			case 2:
				System.out.println("Транслитерация");
				System.out.println("");
				task2();
				break;
			case 3:
				System.out.println("Транслит звуков");
				System.out.println("");
				task3();
				break;
			case 4:
				System.out.println("Шифр Цезаря");
				System.out.println("");
				task4();
				break;
			case 5:
				System.out.println("Генерация паролей");
				System.out.println("");
				task5();
				break;
			case 6:
				System.out.println("Таблица городов");
				System.out.println("");
				task6();
				break;
			case 7:
				System.out.println("Парсинг текста");
				System.out.println("");
				task7();
				break;
			default:
				task1();
				break;
		}
		sc.close();
	}
	// Задача 1
	private static void task1(){
		int i;
		String inputText;

		System.out.println("Введите текст");
		// sc.reset(); // Не работает
		sc.nextLine(); // WTF, Why?
		inputText = sc.nextLine();

		for ( i = inputText.length()-1; i >= 0 ; i-- )
			System.out.print( inputText.charAt(i) );


	}
	private static void task2(){
		String inputText;
		String outputText= "";
		String currentLetter;

		String rusAbet = "йЙцЦуУкКеЕнНгГшШщЩзЗхХъЪфФыЫвВаАпПрРоОлЛдДжЖэЭяЯчЧсСмМиИтТьЬбБюЮёЁ ";
		String engAbet = "qQwWeErRtTyYuUiIoOpP[{]}aAsSdDfFgGhHjJkKlL;:'\"zZxXcCvVbBnNmM,<.>`~ ";

		System.out.println("Введите текст");

		sc.nextLine();
		inputText = sc.nextLine();

		for ( int i = 0; i < inputText.length(); i++ ) {
			currentLetter = "" + inputText.charAt(i);

			if ( engAbet.contains(currentLetter) ) {
				outputText += rusAbet.charAt( engAbet.indexOf(  currentLetter ) );
			}
			else if ( rusAbet.contains(currentLetter) ) {

				outputText += engAbet.charAt( rusAbet.indexOf(  currentLetter ) );
			}
		}

		/*
		String currentLetter = "" + inputText.charAt(i); // как еще можно обойти сравнение типов с char

		if ( engAbet[n] == inputText.charAt(i) ) // как сравнить две буквы одну из масива вторую из char??
		*/

		System.out.println("Возможно вы хотели ввести:" + outputText );
	}

	private static void task3(){
		String inputText;
		String outputText	= "";
		String currentLang;
		String firstLetter;
		int currentSound;
		String[] sound;

		String langEng 		= "abcdefghijklmnopqrstuvwxyz ";
		String langRus 		= "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ";
		String[] soundToEn 	= {"a", "b", "v", "g", "d", "e", "ye", "zh", "z", "i", "y", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", " ", "y", " ", "e", "yu", "ya", " "};
		String[] soundToRu 	= {"эй", "би", "си", "ди", "и", "эф", "джи", "эйч", "ай", "джей", "кей", "эл", "эм", "эн", "оу", "пи", "кью", "ар", "эс", "tи", "ю", "ви", "дабл-ю", "экс", "вай", "зед", " "};

		System.out.println("Введите текст");
		sc.nextLine();
		inputText = sc.nextLine();

		firstLetter = "" + inputText.charAt(0); // снова дурацкая ситуация
		//   Character.toUpperCase(inputText.charAt(0));

		if( langEng.contains( firstLetter.toLowerCase() ) ){
			currentLang = langEng;
			sound 		=  soundToRu;

		} else if ( langRus.contains( firstLetter.toLowerCase() ) ){
			currentLang = langRus;
			sound 		=  soundToEn;
		} else {
			System.out.println("Мы не знаем таких букоф");
			return;
		}

		for( int i = 0; i < inputText.length(); i++){

			String currentLetter = "" + inputText.charAt(i);

			if ( currentLetter == currentLetter.toUpperCase() ) {
				currentSound	= currentLang.indexOf( currentLetter.toLowerCase() );
				outputText		+= sound[currentSound].toUpperCase();

			} else {
				currentSound	= currentLang.indexOf( currentLetter );
				outputText		+= sound[currentSound];
			}


		}

		System.out.println( outputText );
	}

	private static void task4(){
		String inputText;
		String outputText = "";
		String lang;
		int key;
		int toDo;
		int numLetter = 0;
		boolean isBigLetter;
		String langRU = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
		String langEN = "abcdefghijklmnopqrstuvwxyz";


		System.out.println("Введите текст");
		sc.nextLine();
		inputText = sc.nextLine();

		System.out.println("Введите ключ");
		key = sc.nextInt();

		System.out.println("Введите 1 или 2 (Шифровать - 1; Дешифровать - 2)");
		toDo = sc.nextInt();

		for (int i = 0; i < inputText.length(); i++) {

			String currentLetter = "" + inputText.charAt(i);

			isBigLetter = (currentLetter == currentLetter.toUpperCase());

			currentLetter = currentLetter.toLowerCase();

			if (langRU.contains(currentLetter)) {
				lang = langRU;

			} else if (langEN.contains(currentLetter)) {
				lang = langEN;

			} else {
				outputText += currentLetter;
				continue;
			}

			if (toDo == 1) numLetter = lang.indexOf(currentLetter) + key;
			if (toDo == 2) numLetter = lang.indexOf(currentLetter) - key;

			if ( numLetter >= lang.length() ) numLetter -= lang.length();
			if ( numLetter < 0) numLetter += lang.length();

			currentLetter = "" + lang.charAt(numLetter);

			if ( isBigLetter )  currentLetter = currentLetter.toUpperCase();

			outputText += currentLetter;
		}

		System.out.println( outputText );
	}

	private static void task5(){
		System.out.println("Выберите режим генерации. Нажмите:");
		System.out.println("1 - простой пароль");
		System.out.println("2 - сложный пароль");
		System.out.println("0 - выйти из программы");

		String symbolCollection;
		String letters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		String symbols = "`~!@#$%^&*()_+=-:;\"'\\|/?,.<>[]{}";
		String passForUser = "";


		int programMode = sc.nextInt();

		if ( programMode == 1 ) symbolCollection = letters;
		else if ( programMode == 2 ) symbolCollection = letters + symbols;
		else {
			System.out.println("Bye-bye!");
			return;
		}

		int dictLenth = symbolCollection.length();
		int qtyPassChar = (int)(Math.random()*10+6);


		for(int i = 0; i < qtyPassChar; i++){

			int dictChar = (int)(Math.random()*dictLenth);

			passForUser += symbolCollection.charAt( dictChar );
		}

		System.out.println( passForUser );
		task5();
	}

	private static void task6(){

		String[] cities = {"Киев", "Санкт-Петербург", "Осло", "Копенгаген", "Лондон", "Магнитогорск",
				"Одесса", "Минск", "Чернигов", "Афины", "Львов", "Днепропетровск", "Донецк",
				"Ивано-Франковск", "Николаев", "Полтава", "Ровно", "Париж", "Владивосток", "Кривой Рог"};

		System.out.println("Введите количество строк");
		int rowsCities = sc.nextInt(); // 4

		System.out.println("Введите количество столбцов");
		int columnsCities = sc.nextInt(); // 5

		String[][] rowCities = new String[rowsCities][columnsCities];
		int currentCity;
		int maxLengthCity;
		int i = 0;
		int n;

		if ( ( rowsCities * columnsCities) > cities.length ) {
			System.out.println( "Недостаточно городов в массиве: max-" +  cities.length);
			return;
		}

		while (i < rowsCities){

			n = 0;
			while (	n < columnsCities){
				currentCity = (int) (Math.random() *  cities.length);

				int c = 0;

				if ( cities[currentCity] != "") {

					rowCities[i][n]		= cities[currentCity];
					cities[currentCity] = "";

					n++;
					continue;
				}

				while( c <  cities.length ){
					c++;
					if (currentCity + 1 >= cities.length ) currentCity = currentCity + 1 - cities.length;
					else currentCity = currentCity + 1;

					if (cities[currentCity] != "") {
						rowCities[i][n] = cities[currentCity];
						cities[currentCity] = "";
						break;
					}
				}

				n++;
			}

			i++;
		}

		n=0;

		while (n < columnsCities){
			maxLengthCity = 0;

			i = 0;
			while (	i < rowsCities){
				int lengthCity = rowCities[i][n].length();
				maxLengthCity = ( maxLengthCity < lengthCity ) ? lengthCity : maxLengthCity;

				i++;
			}

			i = 0;
			while (i < rowsCities){
				String cityToWidthRow = String.format("%-" + maxLengthCity + "s", rowCities[i][n]);
				String endRow = (n > 0 && n == columnsCities -1 ) ? "\n" : " \t";
				rowCities[i][n] =  cityToWidthRow + endRow;

				i++;
			}

			n++;
		}

		for (String[] rows: rowCities ) {
			for (String city: rows ) {
				System.out.print( city );
			}
		}

	}

	private static void task7() {
		String data = "Java is a computer programming language that is concurrent, " +
				"class-based, object-oriented, and specifically designed to have as " +
				"few implementation dependencies as possible. " +
				"It is intended to let application developers \"write once, run anywhere\" " +
				"(WORA), " + "meaning that code that runs on one platform does not need " +
				"to be recompiled to run on another. " +
				"Java applications are typically compiled to bytecode that can run on any Java " +
				"virtual machine (JVM) regardless of computer architecture. " +
				"Java is, as of 2014, one of the most popular programming languages in use, " +
				"particularly for client-server web applications, with a reported 9 million " +
				"developers. " +
				"Java was originally developed by James Gosling at Sun Microsystems " +
				"(which has since merged into Oracle Corporation) and released in 1995 as a core " +
				"component of Sun Microsystems' Java platform. The language derives much of its " +
				"syntax from C and C++, but it has fewer low-level facilities than either of them.";

		int workerString = 0;
		String stringDigits = "";
		String stringBigLetter = "";
		String stringSmallLetter = "";
		String charToString;
		boolean isBreak = true;


		for (int i = 0 ; i < data.length(); i++){
			int c = (int) data.charAt(i);
			charToString = "" + data.charAt(i);


			if( Character.isLetterOrDigit(c) ){

				if (isBreak){
					switch (workerString) {
						case 2:
							stringDigits += "\n";
							break;
						case 3:
							stringBigLetter += "\n";
							break;
						case 4:
							stringSmallLetter += "\n";
							break;
						default:
							break;
					}

					if( Character.isAlphabetic(c)
							&& charToString == charToString.toUpperCase() )
						workerString = 3;

					else workerString = 4;

					if( Character.isDigit(c) ) {
						workerString = 2;
					}

				}

				switch (workerString) {
					case 2:
						stringDigits += charToString;
						break;
					case 3:
						stringBigLetter += charToString;
						break;
					case 4:
						stringSmallLetter += charToString;
						break;
					default:
						break;
				}

				isBreak = false;

			} else {
				isBreak = true;
			}
		}

		System.out.println(stringDigits + stringBigLetter + stringSmallLetter);
	}
}