package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sorting.BubbleSort;
import sorting.HeapSort;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.SelectionSort;
import sorting.ThreeWayQuickSort;

public class UserInterface implements ActionListener {

	int arr[];
	static int length;
	JFrame frame;
	JTextField getarray_input, getarraysize_input;
	JPanel getarray_panel, getarraysize_panel, button_panel, sorted_panel, compare_panel;
	JButton InsertionSort_button, SelectionSort_button, BubbleSort_button, MergeSort_button, QuickSort_button,
			Q3_buttton, HeapSort_button, Exit_button, Compare_button;

	JLabel getarray_label, getarraysize_label, sorted_label, display1_label, unsorted_label, display2_label,
			insertionSort_label, selectionSort_label, bubbleSort_label, mergeSort_label, quickSort3way_label,
			quickSort_label, heapSort_label, time_label;

	long startTime, endTime;
	double time;
	final DecimalFormat df = new DecimalFormat("0.0000000000");
	String text;

	public static void main(String args[]) {
		UserInterface userInterface = new UserInterface();
	}

	UserInterface() {

		// Insertion SORT BUTTON
		InsertionSort_button = new JButton();
		InsertionSort_button.setBounds(100, 230, 200, 50);
		InsertionSort_button.addActionListener(this);
		InsertionSort_button.setText("Insertion Sort");
		InsertionSort_button.setFocusable(false);
		InsertionSort_button.setHorizontalTextPosition(JButton.CENTER);

		// Selection SORT BUTTON
		SelectionSort_button = new JButton();
		SelectionSort_button.setBounds(100, 230, 200, 50);
		SelectionSort_button.addActionListener(this);
		SelectionSort_button.setText("Selection Sort");
		SelectionSort_button.setFocusable(false);
		SelectionSort_button.setHorizontalTextPosition(JButton.CENTER);

		// Bubble SORT BUTTON
		BubbleSort_button = new JButton();
		BubbleSort_button.setBounds(100, 230, 200, 50);
		BubbleSort_button.addActionListener(this);
		BubbleSort_button.setText("Bubble Sort");
		BubbleSort_button.setFocusable(false);
		BubbleSort_button.setHorizontalTextPosition(JButton.CENTER);

		// MERGE SORT BUTTON
		MergeSort_button = new JButton();
		MergeSort_button.setBounds(300, 130, 200, 50);
		MergeSort_button.addActionListener(this);
		MergeSort_button.setText("Merge Sort");
		MergeSort_button.setFocusable(false);
		MergeSort_button.setHorizontalTextPosition(JButton.CENTER);

		// Quick SORT BUTTON
		QuickSort_button = new JButton();
		QuickSort_button.setBounds(100, 230, 200, 50);
		QuickSort_button.addActionListener(this);
		QuickSort_button.setText("Quick Sort");
		QuickSort_button.setFocusable(false);
		QuickSort_button.setHorizontalTextPosition(JButton.CENTER);

		// Quick Sort using 3 median BUTTON
		Q3_buttton = new JButton();
		Q3_buttton.setBounds(100, 230, 200, 50);
		Q3_buttton.addActionListener(this);
		Q3_buttton.setText("Quick Sort using 3 median");
		Q3_buttton.setFocusable(false);
		Q3_buttton.setHorizontalTextPosition(JButton.CENTER);

		// HEAP SORT BUTTON
		HeapSort_button = new JButton();
		HeapSort_button.setBounds(100, 230, 200, 50);
		HeapSort_button.addActionListener(this);
		HeapSort_button.setText("Heap Sort");
		HeapSort_button.setFocusable(false);
		HeapSort_button.setHorizontalTextPosition(JButton.CENTER);

		// Compare BUTTON
		Compare_button = new JButton();
		Compare_button.setBounds(100, 230, 200, 50);
		Compare_button.addActionListener(this);
		Compare_button.setText("Compare");
		Compare_button.setFocusable(false);
		Compare_button.setHorizontalTextPosition(JButton.CENTER);

		// EXIT BUTTON
		Exit_button = new JButton();
		Exit_button.setBounds(100, 230, 200, 50);
		Exit_button.addActionListener(this);
		Exit_button.setText("EXIT");
		Exit_button.setFocusable(false);
		Exit_button.setHorizontalTextPosition(JButton.CENTER);

		// Display Text
		getarraysize_label = new JLabel();
		getarraysize_label.setText("Enter Array Size: ");
		getarraysize_panel = new JPanel();
		getarraysize_panel.setBackground(Color.cyan);
		// INPUT TEXT FIELD
		getarraysize_input = new JTextField();
		getarraysize_input.setPreferredSize(new Dimension(50, 40));

		// Display Text
		getarray_label = new JLabel();
		getarray_label.setText("Enter Comma Seperated Array : ");
		getarray_panel = new JPanel();
		getarray_panel.setBackground(Color.cyan);

		// INPUT TEXT FIELD
		getarray_input = new JTextField();
		getarray_input.setPreferredSize(new Dimension(700, 40));

		// Display Sorted Array
		sorted_label = new JLabel();
		display1_label = new JLabel();
		unsorted_label = new JLabel();
		display2_label = new JLabel();
		time_label = new JLabel();

		// sorted_label.setText("*********************");
		sorted_panel = new JPanel();
		sorted_panel.setLayout(new GridLayout(5, 2));
		sorted_panel.setBackground(Color.cyan);
		/****** Panel to Adjust Buttons ******/
		button_panel = new JPanel();
		button_panel.setBackground(Color.cyan);
		button_panel.setPreferredSize(new Dimension(900, 50));
		button_panel.setLayout(new FlowLayout());

		/****** Compare panel ******/
		compare_panel = new JPanel();
		compare_panel.setPreferredSize(new Dimension(900, 100));
		compare_panel.setLayout(new GridLayout(7, 1));
		mergeSort_label = new JLabel();
		heapSort_label = new JLabel();
		quickSort_label = new JLabel();
		insertionSort_label = new JLabel();
		quickSort3way_label = new JLabel();
		selectionSort_label = new JLabel();
		bubbleSort_label = new JLabel();

		frame = new JFrame();
		frame.setTitle("Sorting Algorithms");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 800);

		frame.add(getarray_panel);
		getarray_panel.add(getarray_label);
		getarray_panel.add(getarray_input);
		getarray_panel.setVisible(true);

		frame.add(button_panel);
		button_panel.add(MergeSort_button);
		button_panel.add(HeapSort_button);
		button_panel.add(QuickSort_button);
		button_panel.add(Q3_buttton);
		button_panel.add(InsertionSort_button);
		button_panel.add(SelectionSort_button);
		button_panel.add(BubbleSort_button);
		button_panel.setVisible(true);

		frame.add(sorted_panel);
		sorted_panel.add(display1_label);
		sorted_panel.add(unsorted_label);
		sorted_panel.add(display1_label);
		sorted_panel.add(sorted_label);
		sorted_panel.add(time_label);

		frame.add(Compare_button);
		frame.add(compare_panel);
		compare_panel.add(mergeSort_label);
		compare_panel.add(heapSort_label);
		compare_panel.add(quickSort_label);
		compare_panel.add(quickSort3way_label);
		compare_panel.add(insertionSort_label);
		compare_panel.add(selectionSort_label);
		compare_panel.add(bubbleSort_label);

		compare_panel.setVisible(true);
		compare_panel.setBackground(Color.cyan);

		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Insertion SORT BUTTON
		if (e.getSource() == InsertionSort_button) {
			System.out.println("Insertion Sort");
			getInputArray();

			InsertionSort is = new InsertionSort();
			System.out.println("Before Sorting");
			display1_label.setText("Before Sorting");
			showResult(arr);
			text = Arrays.toString(arr);
			unsorted_label.setText(text);
			startTime = System.nanoTime();
			is.executeSorting(arr);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("After Sorting using Insertion Sort");
			display1_label.setText("After Sorting using Insertion Sort");
			showResult(arr);
			text = Arrays.toString(arr);
			sorted_label.setText(text);

			System.out.println(
					"Insertion sort took " + df.format(time) + " seconds for input with array length " + arr.length);
			time_label.setText(
					"Insertion sort took " + df.format(time) + " seconds for input with array length " + arr.length);
		}

		// Selection SORT BUTTON
		if (e.getSource() == SelectionSort_button) {
			System.out.println("Selection Sort");
			getInputArray();

			SelectionSort ss = new SelectionSort();
			System.out.println("Before Sorting");
			display1_label.setText("Before Sorting");
			showResult(arr);
			text = Arrays.toString(arr);
			unsorted_label.setText(text);
			startTime = System.nanoTime();
			ss.executeSorting(arr);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("After Sorting using Selection Sort");
			display1_label.setText("After Sorting using Selection Sort");
			showResult(arr);
			text = Arrays.toString(arr);
			sorted_label.setText(text);

			System.out.println(
					"Selection sort took " + df.format(time) + " seconds for input with array length " + arr.length);
			time_label.setText(
					"Selection sort took " + df.format(time) + " seconds for input with array length " + arr.length);
		}

		// Bubble SORT BUTTON
		if (e.getSource() == BubbleSort_button) {
			System.out.println("Bubble Sort");
			getInputArray();

			BubbleSort bs = new BubbleSort();
			System.out.println("Before Sorting");
			display1_label.setText("Before Sorting");
			showResult(arr);
			text = Arrays.toString(arr);
			unsorted_label.setText(text);
			startTime = System.nanoTime();
			bs.executeSorting(arr);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("After Sorting using Bubble Sort");
			display1_label.setText("After Sorting using Bubble Sort");
			showResult(arr);
			text = Arrays.toString(arr);
			sorted_label.setText(text);

			System.out.println(
					"Bubble sort took " + df.format(time) + " seconds for input with array length " + arr.length);
			time_label.setText(
					"Bubble sort took " + df.format(time) + " seconds for input with array length " + arr.length);
		}

		// MERGE SORT BUTTON
		if (e.getSource() == MergeSort_button) {
			System.out.println("Merge Sort");
			getInputArray();

			MergeSort ms = new MergeSort();
			System.out.println("Before Sorting");
			display1_label.setText("Before Sorting");
			showResult(arr);
			text = Arrays.toString(arr);
			unsorted_label.setText(text);
			startTime = System.nanoTime();
			ms.executeSorting(arr, 0, arr.length - 1);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("After Sorting using Merge Sort");
			display1_label.setText("After Sorting using Merge Sort");
			showResult(arr);
			text = Arrays.toString(arr);
			sorted_label.setText(text);

			System.out.println(
					"Merge sort took " + df.format(time) + " seconds for input with array length " + arr.length);
			time_label.setText(
					"Merge sort took " + df.format(time) + " seconds for input with array length " + arr.length);
		}

		// Quick SORT BUTTON
		if (e.getSource() == QuickSort_button) {
			System.out.println("Quick Sort");
			getInputArray();
			QuickSort qs = new QuickSort();
			System.out.println("Before Sorting");
			display1_label.setText("Before Sorting");
			showResult(arr);
			text = Arrays.toString(arr);
			unsorted_label.setText(text);
			startTime = System.nanoTime();

			qs.executeSorting(arr, 0, arr.length - 1);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("After Sorting using Quick Sort");
			display1_label.setText("After Sorting using Quick Sort");
			showResult(arr);
			text = Arrays.toString(arr);
			sorted_label.setText(text);

			System.out.println(
					"Quick sort took " + df.format(time) + " seconds for input with array length " + arr.length);
			time_label.setText(
					"Quick sort took " + df.format(time) + " seconds for input with array length " + arr.length);
		}

		// Quick SORT using 3 median BUTTON
		if (e.getSource() == Q3_buttton) {
			System.out.println("Quick SORT using 3 median ");
			getInputArray();
			QuickSort qs3 = new QuickSort();
			System.out.println("Before Sorting");
			display1_label.setText("Before Sorting");
			showResult(arr);
			text = Arrays.toString(arr);
			unsorted_label.setText(text);
			startTime = System.nanoTime();
			qs3.executeSorting(arr, 0, arr.length - 1);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("After Sorting using Quick Sort 3 median ");
			display1_label.setText("After Sorting using Quick Sort 3 median ");
			showResult(arr);
			text = Arrays.toString(arr);
			sorted_label.setText(text);

			System.out.println("Quick Sort using 3 median  took " + df.format(time)
					+ " seconds for input with array length " + arr.length);
			time_label.setText("Quick Sort using 3 median  took " + df.format(time)
					+ " seconds for input with array length " + arr.length);
		}

		// HEAP SORT BUTTON
		if (e.getSource() == HeapSort_button) {
			System.out.println("Heap Sort");
			getInputArray();

			HeapSort hs = new HeapSort();
			System.out.println("Before Sorting");
			display1_label.setText("Before Sorting");
			showResult(arr);
			text = Arrays.toString(arr);
			unsorted_label.setText(text);
			startTime = System.nanoTime();
			hs.executeSorting(arr);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("After Sorting using Heap Sort");
			display1_label.setText("After Sorting using Heap Sort");
			showResult(arr);
			text = Arrays.toString(arr);
			sorted_label.setText(text);

			System.out.println(
					"Heap sort took " + df.format(time) + " seconds for input with array length " + arr.length);
			time_label.setText(
					"Heap sort took " + df.format(time) + " seconds for input with array length " + arr.length);
		}

		// COMPARE BUTTON
		if (e.getSource() == Compare_button) {

			// Insertion Sort
			startTime = System.nanoTime();
			InsertionSort insertionSort = new InsertionSort();
			insertionSort.executeSorting(arr);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("Insertion Sort :" + df.format(time));
			insertionSort_label.setText("InsertionSort		 :" + df.format(time));

			// Selection Sort
			startTime = System.nanoTime();
			SelectionSort selectionSort = new SelectionSort();
			selectionSort.executeSorting(arr);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("Selection Sort :" + df.format(time));
			selectionSort_label.setText("SelectionSort :" + df.format(time));

			// Bubble Sort
			startTime = System.nanoTime();
			BubbleSort bubbleSort = new BubbleSort();
			bubbleSort.executeSorting(arr);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("BubbleSort :" + df.format(time));
			bubbleSort_label.setText("Bubble Sort :" + df.format(time));
			System.out.println();

			// Merge Sort
			startTime = System.nanoTime();
			MergeSort mergeSort = new MergeSort();
			mergeSort.executeSorting(arr, 0, arr.length - 1);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("MergeSort :" + df.format(time));
			mergeSort_label.setText("Merge Sort :" + df.format(time));

			// Quick Sort
			startTime = System.nanoTime();
			QuickSort quickSort = new QuickSort();
			quickSort.executeSorting(arr, 0, arr.length - 1);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("Quick Sort :" + df.format(time));
			quickSort_label.setText("Quick Sort :" + df.format(time));

			// Quick Sort using 3 median
			startTime = System.nanoTime();
			ThreeWayQuickSort quickSort3way = new ThreeWayQuickSort();
			quickSort3way.executeSorting(arr, 0, arr.length - 1);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("Quick Sort using 3 median :" + df.format(time));
			quickSort3way_label.setText("Quick Sort using 3 median :" + df.format(time));

			// Heap Sort
			startTime = System.nanoTime();
			HeapSort heapSort = new HeapSort();
			heapSort.executeSorting(arr);
			endTime = System.nanoTime();
			time = endTime - startTime;
			time = time / 1000000000;
			System.out.println("Heap Sort :" + df.format(time));
			heapSort_label.setText("Heap Sort :" + df.format(time));

		}
	}

	public void getInputArray() {

		String InputArray = getarray_input.getText();
		String[] InputArrayItems = InputArray.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "")
				.split(",");
		arr = new int[InputArrayItems.length];

		for (int i = 0; i < InputArrayItems.length; i++) {
			try {
				arr[i] = Integer.parseInt(InputArrayItems[i]);
			} catch (NumberFormatException nfe) {
				System.out.println("Array has non integer values");
			}
		}
		showResult(arr);

	}

	public void showResult(int enteredArray[]) {
		int k;
		for (k = 0; k < enteredArray.length; k++) {
			System.out.print(enteredArray[k] + " ");
		}
		System.out.println();
	}

}
