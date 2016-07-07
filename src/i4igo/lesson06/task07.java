package i4igo.lesson06;

public class task07 {
	
	/** Программа должна вывести на экран распечатку времени
	 * от 9:00 до 18:00 через каждые 10 мин.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l=0;
		for(int i=9; i<=18; i++){
			
			if (i==18){
				System.out.println(i+":00");
				break;
			}
			
			for (int k=0; k<6; k++){
				System.out.println(i+":"+k+l);
			}
		}
	}
}
