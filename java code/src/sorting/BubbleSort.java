package sorting;

public class BubbleSort {
	public void executeSorting(int arr[]) {
		int l = arr.length;
		for (int k = 0; k < l - 1; k++)
			for (int j = 0; j < l - k - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
}
