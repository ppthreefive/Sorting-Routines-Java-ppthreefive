/* Author: Phillip Pham
 * Date: 10/17/16
 * Course: CSC205AB Section: 20475
 * 
 * Program Title: Sort Routines
 * Program Description: This program will take an array of 1000 random numbers 10-99, and sort them from least to greatest.
 */

package com.phillippham.sort_routines;

public class Quicksort
{
	// Attributes
	private int[] numbers;

	// Constructor
	public Quicksort(int[] numbers)
	{
		this.numbers = numbers;
	}

	public void sort()
	{
		quicksort(numbers, 0, numbers.length - 1);
	}

	private void quicksort(int[] numbers, int min, int max)
	{
		int leftPointer = min, rightPointer = max;
		double pivot = numbers[min + (max - min) / 2];

		while (leftPointer <= rightPointer)
		{
			while (numbers[leftPointer] < pivot)
			{
				leftPointer++;
			}
			while (numbers[rightPointer] > pivot)
			{
				rightPointer--;
			}
			if (leftPointer <= rightPointer)
			{
				exchange(leftPointer, rightPointer);
				leftPointer++;
				rightPointer--;
			}
		}

		if (min < rightPointer)
		{
			quicksort(numbers, min, rightPointer);
		}

		if (leftPointer < max)
		{
			quicksort(numbers, leftPointer, max);
		}
	}

	private void exchange(int leftPointer, int rightPointer)
	{
		int temp = numbers[leftPointer];
		numbers[leftPointer] = numbers[rightPointer];
		numbers[rightPointer] = temp;
	}
}