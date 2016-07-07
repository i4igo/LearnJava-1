package i4igo.lesson06;

import java.util.Scanner;

public class task04 {

	/**Дано четырехзначное число. Определить:
	 *  а) равна ли сумма двух первых его цифр сумме двух его  последних цифр; 
	 *  б) кратна ли трем сумма его цифр; 
	 *  в) кратно ли четырем произведение его цифр; 
	 *  г) кратно ли произведение его цифр числу а, которое нужно ввести с клавиатуры.
	 *  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Введите четырехзначное число");
		
		Scanner vvod = new Scanner(System.in);
		int chislo = vvod.nextInt();
		int chislo2 = vvod.nextInt();
		
		if ((chislo/1000>=1) & (chislo/1000<10)){
			int a=chislo/1000;
			int b=(chislo%1000)/100;
			int c=(chislo%100)/10;
			int d=chislo%10;
			
			System.out.println("Введенное число: "+chislo);
			System.out.println("Сумма первых двух цыфр "+a+"+"+b+"="+(a+b)+
							  ((a+b)==(c+d)?"":" не")
							  +" равна сумме вторых двух цыфр "+c+"+"+d+"="+(c+d));
			System.out.println("Сумма его цыфр: "+a+"+"+b+"+"+c+"+"+d+"="+(a+b+c+d)+
					  		  (((a+b+c+d)%3==0)?"":" не")
					  		  +" кратна 3");
			System.out.println("Произведение его цыфр: "+a+"*"+b+"*"+c+"*"+d+"="+(a*b*c*d)+
			  		  		  (((a*b*c*d)%4==0)?"":" не")
			  		  		  +" кратна 4");
			System.out.println("Произведение его цыфр: "+a+"*"+b+"*"+c+"*"+d+"="+(a*b*c*d)+
							  (((a*b*c*d)%chislo2==0)?"":" не")
							  +" кратна "+chislo2);
		}	
		else
			System.out.println("ОШИБКА!!! Введенное число не четырехзначное!!!");
		
	}

}
