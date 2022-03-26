package sorting;

public class MergeSort {

	public void executeSorting(int arr[], int left, int right) {
		if (left < right) {

			int mid;
			mid = left + (right - left) / 2;

			executeSorting(arr, left, mid);
			executeSorting(arr, mid + 1, right);

			mergeElements(arr, left, mid, right);
		}
	}

	void mergeElements(int arr[], int left, int mid, int right) {
		int i = 0;
		int j = 0;

		int element1 = mid - left + 1;
		int element2 = right - mid;

		int leftArray[] = new int[element1];
		int rightArray[] = new int[element2];

		for (int indexofLeft = 0; indexofLeft < element1; ++indexofLeft)
			leftArray[indexofLeft] = arr[left + indexofLeft];
		for (int indexOfRight = 0; indexOfRight < element2; ++indexOfRight)
			rightArray[indexOfRight] = arr[mid + 1 + indexOfRight];

		int mergedIndex = left;
		while (i < element1 && j < element2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[mergedIndex] = leftArray[i];
				i++;
			} else {
				arr[mergedIndex] = rightArray[j];
				j++;
			}
			mergedIndex++;
		}
		// Copy remaining elements of leftArray[]

		while (i < element1) {
			arr[mergedIndex] = leftArray[i];
			i++;
			mergedIndex++;
		}
		// Copy remaining elements of rightArray[]

		while (j < element2) {
			arr[mergedIndex] = rightArray[j];
			j++;
			mergedIndex++;
		}
	}

}
