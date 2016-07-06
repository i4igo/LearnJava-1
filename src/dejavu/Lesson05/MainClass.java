package dejavu.Lesson05;

public class MainClass {

	public static void main(String[] args) {
		
		int arrInt[] = {3, 3, 1, 1, 4, 3, 6, 4, 2, 6, 1, 2, 6, 2, 6, 1, 3, 2, 1, 2, 0, 1, 1, 2, 0, 4, 1, 7, 3, 3, 0, 0, 1, 0, 6, 1, 3, 4, 1, 4, 3, 2, 4, 6, 6, 2, 0, 7, 1, 2};
		int randomElemArray = 1; // Номер элемента массива ЧПУ
		int positionL = 0;
		int positionR = arrInt.length-1;
		int tempArrayElem;
		int selectedNum = arrInt[randomElemArray-1]; // 5; // Значение в массиве или число которого нет в массиве

		// Статистика
		int passingArray = 0;
		int couterArray = 0;
		
		for(int i = 0; i < positionR; i++){
			couterArray++;
			passingArray = i;

			// Меньше числа закидываем влево и увеличиваем левую каретку
			if( arrInt[i] < selectedNum ){
				
				tempArrayElem = arrInt[positionL];
				arrInt[positionL] = arrInt[i];
				arrInt[i] = tempArrayElem;
				positionL++;
			}

			// Больше числа закидываем вправо и уменьшаем правую каретку, повторяем итерацию 
			else if( arrInt[i] > selectedNum ){
				
				tempArrayElem = arrInt[positionR];
				arrInt[positionR] = arrInt[i];
				arrInt[i] = tempArrayElem;
				positionR--;
				i--;
			}
			// Больше числа закидываем вправо не уменьшая правую каретку, повторяем итерацию
			else {
				if( arrInt[positionR] == selectedNum ){

					// Ищем позицию не занятую числом
					for(int k = positionR-1; arrInt[k] == selectedNum; k-- ){
						
						if( k == positionL ) break;
						if(arrInt[k] == selectedNum) continue;
						// Здесь как-то красивее не придумал, через переменную разве что
						tempArrayElem = arrInt[k];
						arrInt[k] = arrInt[i];
						arrInt[i] = tempArrayElem;
						i--;
					}
				}
				else {
					tempArrayElem = arrInt[positionR];
					arrInt[positionR] = arrInt[i];
					arrInt[i] = tempArrayElem;
					i--;
				}
				
			}
		}

		// Выводим результат
		System.out.println("Длина массива: " + arrInt.length);
		System.out.println("Количество итераций: " + couterArray);
		System.out.println("Массив просмотрен на: " + ( passingArray * 100 / arrInt.length ) + "%" );
		System.out.print("Массив после обработки: ");

		for(int i = 0; i < arrInt.length; i++ ){
			System.out.print(arrInt[i] + " ");
		}
	}
}