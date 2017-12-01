/* Author: Phillip Pham
 * Date: 10/17/16
 * Course: CSC205AB Section: 20475
 * 
 * Program Title: Sort Routines
 * Program Description: This program will take an array of 1000 random numbers 10-99, and sort them from least to greatest.
 */

package com.phillippham.sort_routines;

import java.util.Arrays;

public class ArraysSort
{

	// Attributes
	private int[] numbers;

	// Constructor
	public ArraysSort(int[] numbers)
	{
		this.numbers = numbers;
	}

	public void sort()
	{
		Arrays.sort(numbers);
	}
}