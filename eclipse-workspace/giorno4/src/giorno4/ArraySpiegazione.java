package giorno4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySpiegazione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
		for (int i=0; i< myNumbers.length; i++) {
			for (int j=0; j< myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
		ArrayList<String> cars = new ArrayList();
		
		Integer arr[] = {1, 2, 3, 4, 5, 6};
		System.out.println("Array: " + Arrays.toString(arr));
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
		arrayList.add(7);
		arr = arrayList.toArray(arr);
		System.out.println("array dopo aver aggiunto l\'elemento:" + Arrays.toString(arr));
		
		//da arraylist ad array
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(10);
		arr2.add(43);
		arr2.add(2);
		Integer[] arrayProva = {};
		arrayProva = arr2.toArray(arrayProva);
		for(int i=0; i < arrayProva.length; i++) {
			System.out.println("da ArrayList a array: " + arrayProva[i]);
		}

		
		
		
	}

}
