/* Author: Phillip Pham
 * Date: 10/17/16
 * Course: CSC205AB Section: 20475
 * 
 * Program Title: Sort Routines
 * Program Description: This program will take an array of 1000 random numbers 10-99, and sort them from least to greatest.
 */

package com.phillippham.sort_routines;

public class ShellSort
{
	private int[] numbers;

	public ShellSort(int[] numbers)
	{
		this.numbers = numbers;
	}

	public void sort()
	{
		// Sort the numbers array
		for(int gap = numbers.length / 2; gap > 0; gap /= 2)
		{
			for(int i = gap; i < numbers.length; i++)
			{
				int temp = numbers[i];
				int j;
				
				for(j = i; j >= gap && temp < numbers[j - gap]; j -= gap)
				{
					numbers[j] = numbers[j - gap];
				}
				
				numbers[j] = temp;
			}
		}
	}
}