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
				System.out.println("");
				task6();
				break;
			case 7:
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

		sc.nextLine(); // WTF, Why?
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

	}

	private static void task7() {

	}
}