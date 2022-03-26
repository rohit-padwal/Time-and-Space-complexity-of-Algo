package sorting;

public class SelectionSort {

	public void executeSorting(int arrayData[]) {
		int arryaSize = arrayData.length;

		for (int i = 0; i < arryaSize - 1; i++) {
			int minimum = i;
			for (int k = i + 1; k < arryaSize; k++)
				if (arrayData[k] < arrayData[minimum])
					minimum = k;

			int swap = arrayData[minimum];
			arrayData[minimum] = arrayData[i];
			arrayData[i] = swap;
		}
	}

}
