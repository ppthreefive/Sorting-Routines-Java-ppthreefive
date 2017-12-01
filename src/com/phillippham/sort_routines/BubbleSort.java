/* Author: Phillip Pham
 * Date: 10/17/16
 * Course: CSC205AB Section: 20475
 * 
 * Program Title: Sort Routines
 * Program Description: This program will take an array of 1000 random numbers 10-99, and sort them from least to greatest.
 */

package com.phillippham.sort_routines;

public class BubbleSort
{
	// Attributes
	private int[] numbers;
	
	// Constructor
	public BubbleSort(int[] numbers)
	{
		this.numbers = numbers;
	}

	public void sort()
	{
		for (int pass = 0; pass < numbers.length - 1; pass++)
		{
			for(int i = 0; i < numbers.length - (pass + 1); i++)
			{
				if(numbers[i] > numbers[i + 1])
				{
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
		}
	}
}