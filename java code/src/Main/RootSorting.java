package Main;

import java.text.DecimalFormat;
import java.util.Scanner;

import sorting.BubbleSort;
import sorting.HeapSort;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.SelectionSort;
import sorting.ThreeWayQuickSort;

public class RootSorting {

	static Scanner getInputData = new Scanner(System.in);

	static int length;
	static int arr[];

	public void getInputArray() {

		System.out.println("Enter the number of elements you want to store: ");
		length = getInputData.nextInt();
		arr = new int[length];
		System.out.println("Enter the elements of the array with space, do not use comma: ");
		for (int i = 0; i < length; i++) {
			arr[i] = (int) getInputData.nextFloat();
		}

	}

	public void showResult(int result[]) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		long sortingStartTime, sortingEndTime;
		double totalTime;
		final DecimalFormat df = new DecimalFormat("0.0000000000");

		double timeInSecs;
		int userChoice;
		RootSorting rootSorting = new RootSorting();

		do {
			System.out.println("Please select the sorting algorithm of your choice: ");
			System.out.println("1. Insertion Sort");
			System.out.println("2. Selection Sort");
			System.out.println("3. Bubble Sort");
			System.out.println("4. Merge Sort");
			System.out.println("5. QuickSort");
			System.out.println("6. QuickSort using 3 median");
			System.out.println("7. Heap Sort");
			System.out.println("8. Compare Algorithms");
			System.out.println("9. Exit");
			userChoice = getInputData.nextInt();
			rootSorting.getInputArray();

			switch (userChoice) {
			case 1:// Insertion Sort
				InsertionSort objInsertionSort = new InsertionSort();
				sortingStartTime = System.nanoTime();

				System.out.println("Array Before Sorting values");
				rootSorting.showResult(arr);
				objInsertionSort.executeSorting(arr);
				System.out.println("Array After Sorting using Insertion Sort");

				rootSorting.showResult(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Insertion sort completed in " + df.format(totalTime)
						+ " seconds for input with array length " + arr.length);
				break;

			case 2:// Selection Sort
				SelectionSort objSelectionSort = new SelectionSort();
				sortingStartTime = System.nanoTime();

				System.out.println("Array Before Sorting values");
				rootSorting.showResult(arr);
				objSelectionSort.executeSorting(arr);
				System.out.println("After Sorting using Selection Sort");

				rootSorting.showResult(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Selection sort completed in " + df.format(totalTime)
						+ " seconds for input with array length " + arr.length);
				break;

			case 3:// Bubble Sort
				BubbleSort objBubbleSort = new BubbleSort();
				sortingStartTime = System.nanoTime();

				System.out.println("Array Before Sorting values");
				rootSorting.showResult(arr);
				objBubbleSort.executeSorting(arr);
				System.out.println("After Sorting using Bubble Sort");

				rootSorting.showResult(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Bubble sort completed in " + df.format(totalTime)
						+ " seconds for input with array length " + arr.length);
				break;

			case 4:// Merge Sort
				MergeSort objMergeSort = new MergeSort();
				sortingStartTime = System.nanoTime();

				System.out.println("Array Before Sorting values");
				rootSorting.showResult(arr);
				objMergeSort.executeSorting(arr, 0, arr.length - 1);
				System.out.println("After Sorting using Merge Sort");

				rootSorting.showResult(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Merge sort completed in " + df.format(totalTime)
						+ " seconds for input with array length " + arr.length);
				break;

			case 5:// Quick Sort
				QuickSort objQuickSort = new QuickSort();
				sortingStartTime = System.nanoTime();

				System.out.println("Array Before Sorting values");
				rootSorting.showResult(arr);
				objQuickSort.executeSorting(arr, 0, arr.length - 1);
				System.out.println("After Sorting using Quick Sort");

				rootSorting.showResult(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Quick sort completed in " + df.format(totalTime)
						+ " seconds for input with array length " + arr.length);
				break;

			case 6:// Quick Sort using 3 median method
				ThreeWayQuickSort objThreeWayQuickSort = new ThreeWayQuickSort();
				sortingStartTime = System.nanoTime();

				System.out.println("Array Before Sorting values");
				rootSorting.showResult(arr);
				objThreeWayQuickSort.executeSorting(arr, 0, arr.length - 1);
				System.out.println("After Sorting using Quick Sort 3 median");

				rootSorting.showResult(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Quick sort using 3 median completed in " + df.format(totalTime)
						+ " seconds for input with array length " + arr.length);
				break;

			case 7:// Heap Sort
				HeapSort objHeapSort = new HeapSort();
				sortingStartTime = System.nanoTime();

				System.out.println("Array Before Sorting values");
				rootSorting.showResult(arr);
				objHeapSort.executeSorting(arr);
				System.out.println("After Sorting using Heap Sort");

				rootSorting.showResult(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Heap sort completed in " + df.format(totalTime)
						+ " seconds for input with array length " + arr.length);
				break;

			case 8:
				// Insertion Sort
				InsertionSort compareInsertionSort = new InsertionSort();
				sortingStartTime = System.nanoTime();
				compareInsertionSort.executeSorting(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;

				System.out.println("Insertion Sort :" + df.format(totalTime) + " seconds");

				// Selection Sort
				SelectionSort compareSelectionSort = new SelectionSort();
				sortingStartTime = System.nanoTime();
				compareSelectionSort.executeSorting(arr);
				sortingEndTime = System.nanoTime();

				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Selection Sort :" + df.format(totalTime) + " seconds");

				// Bubble Sort
				BubbleSort compareBubbleSort = new BubbleSort();
				sortingStartTime = System.nanoTime();
				compareBubbleSort.executeSorting(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Bubble Sort :" + df.format(totalTime) + " seconds");

				// Merge Sort
				MergeSort compareMergeSort = new MergeSort();
				sortingStartTime = System.nanoTime();
				compareMergeSort.executeSorting(arr, 0, arr.length - 1);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Merge Sort :" + df.format(totalTime) + " seconds");

				// Quick Sort
				QuickSort compareQuickSort = new QuickSort();
				sortingStartTime = System.nanoTime();
				compareQuickSort.executeSorting(arr, 0, arr.length - 1);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Quick Sort :" + df.format(totalTime) + " seconds");

				// Quick Sort using 3 median
				ThreeWayQuickSort compareThreeWayQuickSort = new ThreeWayQuickSort();
				sortingStartTime = System.nanoTime();
				compareThreeWayQuickSort.executeSorting(arr, 0, arr.length - 1);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Quick Sort using 3 median :" + df.format(totalTime) + " seconds");

				// Heap Sort
				HeapSort compareHeapSort = new HeapSort();
				sortingStartTime = System.nanoTime();
				compareHeapSort.executeSorting(arr);
				sortingEndTime = System.nanoTime();
				totalTime = sortingEndTime - sortingStartTime;
				totalTime = totalTime / 1000000000;
				System.out.println("Heap Sort :" + df.format(totalTime) + " seconds");
				System.out.println();
				break;

			case 9:
				System.exit(0);
				break;

			default:
				System.out.println("This is an invalid Input , Please enter correct input!");

			}
		} while (true);

	}
}
