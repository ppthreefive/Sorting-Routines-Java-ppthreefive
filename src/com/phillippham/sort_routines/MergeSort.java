/* Author: Phillip Pham
 * Date: 10/17/16
 * Course: CSC205AB Section: 20475
 * 
 * Program Title: Sort Routines
 * Program Description: This program will take an array of 1000 random numbers 10-99, and sort them from least to greatest.
 */

package com.phillippham.sort_routines;

public class MergeSort
{
	// attributes
	int[] numbers;

	// constructors
	public MergeSort(int[] numbers)
	{
		this.numbers = numbers;
	}

	public void sort()
	{
		numbers = sort(numbers);
	}
	
	public int[] sort(int numbers[])
	{
		// sort the numbers array
		if (numbers.length > 1)
		{

			int elementsInA1 = numbers.length / 2;
			int elementsInA2 = numbers.length - elementsInA1;

			int arr1[] = new int[elementsInA1];
			int arr2[] = new int[elementsInA2];

			for (int i = 0; i < elementsInA1; i++)
			{
				arr1[i] = numbers[i];
			}
			
			for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
			{
				arr2[i - elementsInA1] = numbers[i];
			}

			arr1 = sort(arr1);
			arr2 = sort(arr2);

			int i = 0, j = 0, k = 0;

			while (arr1.length != j && arr2.length != k)
			{

				if (arr1[j] < arr2[k])
				{
					numbers[i] = arr1[j];
					i++;
					j++;
				}

				else
				{
					numbers[i] = arr2[k];
					i++;
					k++;
				}
			}

			while (arr1.length != j)
			{
				numbers[i] = arr1[j];
				i++;
				j++;
			}

			while (arr2.length != k)
			{
				numbers[i] = arr2[k];
				i++;
				k++;
			}
		}
		
		return numbers;
	}
}