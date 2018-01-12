//Author Peter Adamson

public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] A = {7, 4, 8, 2, 5, 3, 9};
		sort(A);	//sorts A using selection sort
		show(A);	// display the sorted result A
	}

	public static void sort(int[] A)
	{
		for(int i=0; i < A.length - 1; i++)
		{
			int min = i;
			for(int j=i+1; j < A.length; j++)
			{
				if(A[j] < A[min])
				{
					min = j;
				}	
			}
			if(A[i] != A[min])
			{
				int temp = A[i];
				A[i] = A[min];
				A[min] = temp;	
			}
		}
	}

	public static void show(int[] A)
	{
		for(int i=0; i < A.length; i++)
		{
			System.out.println(A[i]);
		}
	}

}
