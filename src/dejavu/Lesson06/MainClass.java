package dejavu.Lesson06;

import java.util.Scanner;

public class MainClass {



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
/*		
		// Задача 1
		System.out.println("Задача 1");
		
		System.out.println("Введите текст:");
		String userText = sc.nextLine();
		
		for(int i = userText.length()-1; i >= 0; i-- ){
			System.out.print("Текст перевертыш: " + userText.charAt(i) );
		}

		// Задача 2
		System.out.println("Задача 2");
		
		System.out.println("Введите текст:");
		String textForTranslit = sc.nextLine();
		
		char findChar;
		int symbol;
		String textTranslit = "";
		
		String latin	= "qwertyuiop[]asdfghjkl;\'zxcvbnm,./QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>? ";
		String kirilica	= "йцукенгшщзхъфывапролджэячсмитьбю.ЙЦУКЕНГШЩЗХЪ/ФЫВАПРОЛДЖЭЯЧСМИТЬБЮ, ";
		
		for(int i=0; i < textForTranslit.length(); i++){
			
			findChar = textForTranslit.charAt(i);
			symbol = latin.indexOf(findChar);
			textTranslit += kirilica.charAt(symbol);
		}
		
		System.out.println(textTranslit);
*/
		// Задача 3
		System.out.println("Задача 3");	
		
	
		sc.close();
	}
}