package Lesson02;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
/*        
        // ЗАДАЧА 1
        System.out.println("Задача 1");
        
        System.out.println("Введите имя файла:");
        String fileName = sc.next();
        
        System.out.println("Введите расширения файла:");
        String fileExt = sc.next();
        
        System.out.println("Ваш файл: " + fileName + "." + fileExt);
        
        // ЗАДАЧА 2 
       
        System.out.println("Задача 2");
        
        System.out.println("Введите Ваше имя:");
        String userName = sc.next();
        
        System.out.println("Введите Ваш пароль:");
        String userPass = sc.next();
        
        System.out.println("Введите сегодняшнее число:");
        int currentDay = sc.nextInt();
        
        System.out.println("Введите сегодняшний день");
        String currentDayName = sc.next();
        
        System.out.println("Ваше имя: " + userName);
        System.out.println("Ваш пароль: " + userPass);
        System.out.println("Сегодня: " + currentDay + " число, " + currentDayName);
        System.out.println("Вчера было: " + (currentDay - 1) + " число");
        System.out.println("Завтра будет: " + (currentDay + 1) + " число");
      
        // Задача 3
        System.out.println("Задача 3");
        
        System.out.println("Введите текст:");
        String userText = sc.next();
        
        System.out.println("Введенный текст содержит " + userText.length() + " символов!");
        
        // Задача 4
        System.out.println("Задача 4");
        
        System.out.println("Введите скорость в км/ч:");
        int speedKm = sc.nextInt();
        int speedM = speedKm * 1000 / (60*60); 
        		
        System.out.println("Скорость " + speedM + " м/сек");
   
        // Задача 5
        System.out.println("Задача 5");
        
        System.out.println("Введите радиус шара:");
        int radiusBall = sc.nextInt();
        
        System.out.println("Объем шара: " + ( 3 / 4 * Math.PI * Math.pow(radiusBall, 3) ) );
 !!!!!       System.out.println( (3 / 4) ); // ПОЧЕМУ 0??
        // Правильный ответ 65449.846949787
     
        // Задача 6
        System.out.println("Задача 6");
        
        System.out.println("Введите число:");
        int userRange = sc.nextInt();
        
        System.out.println("Результат: " + ( (int)(Math.random() * userRange) ));
*/          
        // Задача 7
        System.out.println("Задача 7");
        
        System.out.println("Введите первое число:");
        int firstNum = sc.nextInt();
        
        System.out.println("Введите второе число:");
        int secondNum = sc.nextInt();
        
        System.out.println("Результат: " + ( (int)(Math.random() * secondNum + firstNum) ));
/*
        // Задача 8
        System.out.println("Задача 8");
        
        System.out.println("С 1970г. прошло: " + (System.currentTimeMillis()/1000/60/60/24) + " дней");
        System.out.println("С 1970г. прошло: " + (System.currentTimeMillis()/1000/60/60) + " часов");
        System.out.println("С 1970г. прошло: " + (System.currentTimeMillis()/1000/60) + " минут");
        System.out.println("С 1970г. прошло: " + (System.currentTimeMillis()/1000) + " секунд");
*/           
        sc.close();
    }
}