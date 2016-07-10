package dejavu.Lesson09;

import static dejavu.Lesson09.SelectTask.sc;

/**
 * Created by dejavu on 07.07.2016.
 * Задание 3
 * Калькулятор
 */
public class Task3 {
    static {
        new Task3();
    }
    private Task3() {
        float firstNum;
        float secondNum;
        String action;
        int resultType;

        System.out.println("Введите первое число:");
        firstNum = sc.nextFloat();

        System.out.println("Укажите действие");
        action = getAction();

        System.out.println("Введите второе число:");
        secondNum = sc.nextFloat();

        System.out.println("Указанная операция будет проводится с введенными числами как с\n" +
                "Целыми - нажмите 1\n" +
                "Дробными - нажмите 2");
        resultType = sc.nextInt();

        if( resultType == 2 )
            calculate( firstNum, secondNum, action);

        else if( resultType == 1 )
            calculate( (int) firstNum, (int) secondNum, action);

        else System.out.println("Вы не выбрали тип чисел");

        System.out.println("Продолжить? Нажмите\n" +
                "1 - Да,\n" +
                "0 - Выйти из программы");
        if( sc.nextInt() == 1 ) new Task3();
    }

    private String getAction(){
        String toDo;
        String sings = "+-*/";

        toDo = sc.next();

        if(toDo.length() > 1 || toDo.length() == 0) {
            System.out.println("Вы неправильно ввели знак действия. " +
                    "Знак состоит из одного символа, Вы ввели " + toDo.length() + ". Введите еще раз");
            getAction();
        }

        if( sings.indexOf(toDo) < 0 ) {

            System.out.println("Вы неправильно ввели знак действия. Ваш знак " +
                    toDo + " не является знаком математической операции. Введите еще раз");
            getAction();
        }

        return "" + toDo;
    }

    private void calculate( float firstNum, float secondNum, String action ){
        float result;

        switch (action){
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            default:
                result = 0;
                break;
        }

        System.out.println(firstNum + " " + action + " " + secondNum  + " = " + result);
    }
    private void calculate( int firstNum, int secondNum, String action ){
        int result = 0;

        switch (action){
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            default:
                break;
        }

        System.out.println(firstNum + " " + action + " " + secondNum  + " = " + result);
    }
}
