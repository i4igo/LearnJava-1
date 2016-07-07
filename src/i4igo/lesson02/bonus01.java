
package i4igo.lesson02;


public class bonus01 {

    /** Красиво вывести на экран все возможные решения задачи календарь,
     *  которые Вы на текущий момент можете произвести в формате:
     *
     * С 1-го января 1970-го года прошло .... дней
     * С 1-го января 1970-го года прошло .... минут
     * Сейчас ....-й год. Это (не)високосный год
     *
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        long time = System.currentTimeMillis();

        int day = 86400000;         // 1 день = 86400000 мс

        System.out.println("С 1-го января 1970-го года прошло "+(time/day)+" дней");
        System.out.println("С 1-го января 1970-го года прошло "+(time/60000)+" минут");

        int year = (int)(1970+(time/day/365));
        String v=null;

        for(int i=1972; i<2020; i+=4){
            if(year==i)
                v="";
            else
                v="не";
        }

        System.out.println("Сейчас "+year+"-й год. Это "+v+"високосный год");

        // System.out.println(time-(time/86400000/365)*86400000*365);

        /*
           BigInteger bigIntegerA = BigInteger.valueOf(86400000);
           BigInteger bigIntegerB = BigInteger.valueOf(365);
           BigInteger bigIntegerC = bigIntegerA.multiply(bigIntegerB);
           System.out.println(bigIntegerC);
        */

    }

}