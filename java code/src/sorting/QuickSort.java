package sorting;

public class QuickSort {

	static int partitionAlgo(int[] arr, int left, int right) {

		int pivot = arr[right];

		int i = (left - 1);

		for (int j = left; j <= right - 1; j++) {

			if (arr[j] < pivot) {
				i++;
				swapNumbers(arr, i, j);
			}
		}
		swapNumbers(arr, i + 1, right);
		return (i + 1);
	}

	static void swapNumbers(int[] arr, int i, int j) {
		int swapNo = arr[i];
		arr[i] = arr[j];
		arr[j] = swapNo;
	}

	public void executeSorting(int[] arr, int left, int right) {
		if (left < right) {
			int pivot = partitionAlgo(arr, left, right);
			executeSorting(arr, left, pivot - 1);
			executeSorting(arr, pivot + 1, right);
		}
	}
}
