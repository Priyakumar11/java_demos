package lesson4;

import java.util.*;

final public class LargestIncreSub {

	static int lis(int arr[], int n) {
		int lis[] = new int[n];
		int i, j, max = 0;

		for (i = 0; i < n; i++)
			lis[i] = 1;

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[]) {

		// int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		// int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		System.out.println("\nEnter " + n + " elements");
		for (int i = 1; i <= n; i++)
			arr[i] = sc.nextInt();
          sc.close();
          System.out.println("Longest increasing sub seqeunce is ");
		System.out.println(lis(arr, n));
	}
}
