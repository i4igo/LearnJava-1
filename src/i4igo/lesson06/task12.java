package i4igo.lesson06;

public class task12 {

	/** Функция перемешивания списка исполнения песен.
	 *  На вход подается упорядоченный список песен в альбоме исполнителя:
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] spisok = {
				"track_01.mp3",
				"track_02.mp3",
				"track_03.mp3",
				"track_04.mp3",
				"track_05.mp3",
				"track_06.mp3",
				"track_07.mp3",
				"track_08.mp3",
				"track_09.mp3",
				"track_10.mp3"
		};

		String[] list = new String[spisok.length];

		for (int i = 0; i < spisok.length; i++){

			int l=0;
			while(l<1){
				int k = (int) (Math.random() * 10) - 0;
				if (list[k]!=null){
					continue;
				}
				list[k]=spisok[i];
				l=1;
			}
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(i + 1 + "-" + list[i]);
		}
	}
}
