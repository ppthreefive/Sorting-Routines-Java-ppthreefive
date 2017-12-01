/* Author: Phillip Pham
 * Date: 10/17/16
 * Course: CSC205AB Section: 20475
 * 
 * Program Title: Sort Routines
 * Program Description: This program will take an array of 1000 random numbers 10-99, and sort them from least to greatest.
 */

package com.phillippham.sort_routines;

import java.awt.Font;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Launcher
{
	public static void main(String[] args)
	{
		// Teams create the sort classes
		// Bubble Sort, Quicksort
		// Insertion Sort, Shell Sort, MergeSort

		// Create the time variables
		long startTime = 0L;
		long endTime = 0L;
		long durationBubble, durationQuick, durationInsertion, durationShell, durationMerge, durationArraysSort;

		final int SIZE = 1000;
		Random rnd = new Random(); // Randomizer Object
		int[] numbers = null; // Array reference

		// Bubble Sort
		numbers = randomIntArray(SIZE, rnd);
		BubbleSort sort1 = new BubbleSort(numbers);
		startTime = System.currentTimeMillis();
		sort1.sort();
		endTime = System.currentTimeMillis();
		durationBubble = endTime - startTime;
		display("Bubble Sort", numbers);

		// Quicksort
		numbers = randomIntArray(SIZE, rnd);
		Quicksort sort2 = new Quicksort(numbers);
		startTime = System.currentTimeMillis();
		sort2.sort();
		endTime = System.currentTimeMillis();
		durationQuick = endTime - startTime;
		display("Quicksort", numbers);

		// Insertion Sort
		numbers = randomIntArray(SIZE, rnd);
		InsertionSort sort3 = new InsertionSort(numbers);
		startTime = System.currentTimeMillis();
		sort3.sort();
		endTime = System.currentTimeMillis();
		durationInsertion = endTime - startTime;
		display("Insertion Sort", numbers);

		// Shell Sort
		numbers = randomIntArray(SIZE, rnd);
		ShellSort sort4 = new ShellSort(numbers);
		startTime = System.currentTimeMillis();
		sort4.sort();
		endTime = System.currentTimeMillis();
		durationShell = endTime - startTime;
		display("Shell Sort", numbers);

		// Merge Sort
		numbers = randomIntArray(SIZE, rnd);
		MergeSort sort5 = new MergeSort(numbers);
		startTime = System.currentTimeMillis();
		sort5.sort();
		endTime = System.currentTimeMillis();
		durationMerge = endTime - startTime;
		display("Merge Sort", numbers);

		// Arrays.sort() --> Built into Java
		// Arrays Sort
		numbers = randomIntArray(SIZE, rnd);
		ArraysSort sort6 = new ArraysSort(numbers);
		startTime = System.currentTimeMillis();
		sort6.sort();
		endTime = System.currentTimeMillis();
		durationArraysSort = endTime - startTime;
		display("Arrays Sort", numbers);
		
		String output = "Speed for the sort routines (" + SIZE + " items)\n\n";
		output += padRight("Bubble Sort: ", 16) + padLeft(String.valueOf(durationBubble), 10) + " ms\n";
		output += padRight("Quicksort: ", 16) + padLeft(String.valueOf(durationQuick), 10) + " ms\n";
		output += padRight("Insertion Sort: ", 16) + padLeft(String.valueOf(durationInsertion), 10) + " ms\n";
		output += padRight("Shell Sort: ", 16) + padLeft(String.valueOf(durationShell), 10) + " ms\n";
		output += padRight("Merge Sort: ", 16) + padLeft(String.valueOf(durationMerge), 10) + " ms\n";
		output += padRight("Arrays Sort: ", 16) + padLeft(String.valueOf(durationArraysSort), 10) + " ms\n";
		
		// Beep and display the output
		Toolkit.getDefaultToolkit().beep();
		JTextArea txaOutput = new JTextArea(output);
		txaOutput.setFont(new Font("Courier New", Font.PLAIN, 30));
		JOptionPane.showMessageDialog(null, txaOutput);
	}

	private static String padLeft(String str, int n)
	{
		// Apply padding to the left
		return String.format("%1$" + n + "s", str);
	}

	private static String padRight(String str, int n)
	{
		// Apply padding to the right
		return String.format("%1$-" + n + "s", str);
	}

	private static int[] randomIntArray(int size, Random rnd)
	{
		// Create a random number array based on given size
		int[] numbers = new int[size];

		// Load the array with numbers from 10 to 99
		final int MAX = 99;
		final int MIN = 10;
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = rnd.nextInt(MAX - MIN + 1) + MIN;
		}

		// Return the random number array
		return numbers;
	}
	
	public static void display(String sortName, int[] numbers)
	{
		// Display the sorted array
		String output = sortName + "\n\n";
		for(int i = 0; i <numbers.length; i++)
		{
			output += numbers[i] + " ";
			if ( (i + 1) % 50 == 0)
			{
				output += "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, output);
	}
}