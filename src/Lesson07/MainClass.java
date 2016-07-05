package Lesson07;

import java.util.Scanner;

public class MainClass {

	private static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		selectorTask();
	}

	public static void selectorTask(){
		int selectedTask;

		System.out.println("Выберите Задачу (1-7)");


		selectedTask = sc.nextInt();

		switch (selectedTask){
			case 1:
				task1();
				break;
			case 2:
				task2();
				break;
			case 3:
				task3();
				break;
			case 4:
				task4();
				break;
			case 5:
				task5();
				break;
			case 6:
				task6();
				break;
			case 7:
				task7();
				break;
		}
	}
	// Задача 1
	public static void task1(){
		int i;

		System.out.println("Задача 1");

		System.out.println("Введите текст");
		String inputText = sc.next();

		for ( i = inputText.length()-1; i >= 0 ; i-- ) System.out.print( inputText.charAt(i) );


	}
	public static void task2(){

	}

	public static void task3(){

	}

	public static void task4(){

	}

	public static void task5(){

	}

	public static void task6(){

	}

	public static void task7() {

	}
}