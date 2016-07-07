package i4igo.lesson02;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		// для примера: "Фотограф проявил выдержку"
		System.out.println("Введите текст:");
		
		/** метод nextLine(), позволяющий считывать целую последовательность символов,
		 *  т.е. строку, а, значит, полученное через этот метод значение нужно сохранять в объекте класса String.
		 */
		String inputText = scan.nextLine();
		System.out.println(inputText.length());
	}

}
