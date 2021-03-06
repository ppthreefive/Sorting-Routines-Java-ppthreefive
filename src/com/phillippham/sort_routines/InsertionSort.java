/* Author: Phillip Pham
 * Date: 10/17/16
 * Course: CSC205AB Section: 20475
 * 
 * Program Title: Sort Routines
 * Program Description: This program will take an array of 1000 random numbers 10-99, and sort them from least to greatest.
 */

package com.phillippham.sort_routines;

public class InsertionSort
{
	//Attributes
	private int[] numbers;
	
	// Constructor
	public InsertionSort(int[] numbers)
	{
		this.numbers = numbers;
	}

	public void sort()
	{
		int temp;
		int i, j;
		int lowerBound, upperBound;
		
		lowerBound = 0;
		upperBound = numbers.length - 1;
		
		for (i = lowerBound + 1; i <= upperBound; i++)
		{
			temp = numbers[i];		
			
			for (j = i - 1;  j >= lowerBound; j--)
			{
				if(numbers[j] <= temp)
				{
					break;
				}
				numbers[j+1] = numbers[j];
			}
			
			numbers[j+1] = temp;
		}
	}
}