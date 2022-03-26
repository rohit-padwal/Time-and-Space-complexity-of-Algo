package sorting;

public class HeapSort {

	// To heapify a subtree rooted with node i which is an index in arrayData[] and
	// count is size of heap
	void heapify(int arrayData[], int count, int length) {
		int largest = length;
		int left = 2 * length + 1;
		int right = 2 * length + 2;

		// If left child is larger than root

		if (left < count && arrayData[left] > arrayData[largest])
			largest = left;

		// to check if the right child is larger than largest

		if (right < count && arrayData[right] > arrayData[largest])
			largest = right;

		// If largest is not root

		if (largest != length) {
			int temp = arrayData[length];
			arrayData[length] = arrayData[largest];
			arrayData[largest] = temp;
			// recursive call
			heapify(arrayData, count, largest);
		}
	}

	// implementation of Heap Sort
	public void executeSorting(int arrayData[]) {
		int length = arrayData.length;

		// building heap
		for (int size = length / 2 - 1; size >= 0; size--)
			heapify(arrayData, length, size);

		for (int newSize = length - 1; newSize > 0; newSize--) {
			// move current node to end
			int temp = arrayData[0];
			arrayData[0] = arrayData[newSize];
			arrayData[newSize] = temp;

			heapify(arrayData, newSize, 0);
		}
	}
}