package Lesson08;

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
			case 8:
				task8();
				break;
			case 9:
				task9();
				break;
			case 10:
				task10();
				break;
			case 11:
				task11();
				break;
			case 12:
				task12();
				break;
		}
	}

	private static void task1(){}
	private static void task2(){}
	private static void task3(){}
	private static void task4(){}
	private static void task5(){}
	private static void task6(){}
	private static void task7(){}
	private static void task8(){}
	private static void task9(){}
	private static void task10(){}
	private static void task11(){}
	private static void task12(){}

}
