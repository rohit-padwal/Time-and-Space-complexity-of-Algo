package sorting;

public class ThreeWayQuickSort {

	public int medianOf3(int[] arr, int left, int right) {
		int center = (left + right) / 2;

		if (arr[left] > arr[center])
			swapNumbers(arr, left, center);

		if (arr[left] > arr[right])
			swapNumbers(arr, left, right);

		if (arr[center] > arr[right])
			swapNumbers(arr, center, right);

		swapNumbers(arr, center, right - 1);
		return arr[right - 1];
	}

	public void swapNumbers(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public void manualSort(int[] intArray, int left, int right) {
		int size = right - left + 1;
		if (size <= 1)
			return;
		if (size == 2) {
			if (intArray[left] > intArray[right])
				swapNumbers(intArray, left, right);
			return;
		} else {
			if (intArray[left] > intArray[right - 1])
				swapNumbers(intArray, left, right - 1);
			if (intArray[left] > intArray[right])
				swapNumbers(intArray, left, right);
			if (intArray[right - 1] > intArray[right])
				swapNumbers(intArray, right - 1, right);
		}
	}

	public int partitionIt(int[] intArray, int left, int right, double pivot) {
		int leftPtr = left;
		int rightPtr = right - 1;
		while (true) {
			while (intArray[++leftPtr] < pivot)
				;
			while (intArray[--rightPtr] > pivot)
				;
			if (leftPtr >= rightPtr)
				break;
			else
				swapNumbers(intArray, leftPtr, rightPtr);
		}
		swapNumbers(intArray, leftPtr, right - 1);
		return leftPtr;
	}

	public void executeSorting(int[] arr, int left, int right) {
		int size = right - left + 1;
		if (size <= 3)
			manualSort(arr, left, right);
		else {
			double median = medianOf3(arr, left, right);
			int partition = partitionIt(arr, left, right, median);
			executeSorting(arr, left, partition - 1);
			executeSorting(arr, partition + 1, right);
		}
	}

}
