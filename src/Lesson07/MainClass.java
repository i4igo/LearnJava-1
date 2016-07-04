package Lesson07;

import java.util.Scanner;

public class MainClass {

	private Scanner sc = new Scanner(System.in);
	private int i;

	public static void main(String[] args) {
		this.selectorTask();
	}

	public void selectorTask(){
		int selectedTask;

		System.out.println("Выберите Задачу (1-7)");


		selectedTask = sc.nextInt();

		switch (selectedTask){
			case 1:
				this.task1();
				break;
			case 2:
				this.task2();
				break;
			case 3:
				this.task3();
				break;
			case 4:
				this.task4();
				break;
			case 5:
				this.task5();
				break;
			case 6:
				this.task6();
				break;
			case 7:
				this.task7();
				break;
		}
	}

	public void task1(){
		// Задача 1
		System.out.println("Задача 1");

		System.out.println("Введите текст");
		String inputText = sc.next();

		for ( i = inputText.length(); i >= 0 ; i-- ) System.out.print(inputText.charAt(i));


	}
	public void task2(){

	}

	public void task3(){

	}

	public void task4(){

	}

	public void task5(){

	}

	public void task6(){

	}

	public void task7() {

	}
}