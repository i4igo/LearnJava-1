package i4igo.lesson06;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class task08 {
	
	/** Проверить вводимый с клавиатуры текст на предмет содержания в нем:
	 *  а) ТОЛЬКО больших латинских букв;
	 *  б) больших и малых букв латинского алфавита;
	 *  в) служебных символов
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner vvod = new Scanner(System.in);
		String text = vvod.nextLine();
		
		System.out.println("Ведите номер желаемой задачи: анализ");
		System.out.println("1 - только больших латинских букв");
		System.out.println("2 - больших и малых букв латинского алфавита");
		System.out.println("3 - служебных символов");
		
		int v = vvod.nextInt();
		int k=0;
		
		switch(v){
		
		case 1:
			for (int i=0; i<text.length(); i++){
				char simbol = text.charAt(i);
				if (simbol>='A' & simbol<='Z'){
					k++;
					System.out.println(k+"-я заглавная буква: "
									   +simbol+" /позиция "+i+"/");
				}
			}
			break;
			
		case 2:
			for (int i=0; i<text.length(); i++){
				char simbol = text.charAt(i);
				if (simbol>='A' & simbol<='z'){
					k++;	
				}
			}
			System.out.println("текс содержит "
					   +k+" латинских символа(-ов)");
			break;
			
		case 3:
			for (int i=0; i<text.length(); i++){
				char simbol = text.charAt(i);
				if (simbol>='!' & simbol<='/' | simbol>=':' & simbol<='@' | simbol>='[' & simbol<='`'){
					k++;
					System.out.println(k+"-й служебный символ: "
							   +simbol+" /позиция "+i+"/");
				}
			}
			break;
			
		default:
			System.out.println("ОШИБКА ввода текста или выбора операции");
		}
	}
}
