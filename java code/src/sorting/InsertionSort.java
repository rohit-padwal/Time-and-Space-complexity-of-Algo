package sorting;

public class InsertionSort {
	public void executeSorting(int arrayData[]) {
		int lengthOfArray = arrayData.length;
		for (int a = 1; a < lengthOfArray; ++a) {
			int temp = arrayData[a];
			int b;
			b = a - 1;

			while (b >= 0 && arrayData[b] > temp) {
				arrayData[b + 1] = arrayData[b];
				b = b - 1;
			}
			arrayData[b + 1] = temp;
		}
	}
}
