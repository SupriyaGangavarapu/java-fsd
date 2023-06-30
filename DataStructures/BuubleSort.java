package SortingTechniques;

import java.util.Arrays;

public class BuubleSort {
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {3,2,5,7,1};
		//int[] arr1 = {5, 2, 9, 1, 7, 6, 8, 3, 4};
		bubbleSort(arr);
		//bubbleSort(arr1);
		System.out.println("sorted array: "+Arrays.toString(arr));
		//System.out.println("sorted array: "+Arrays.toString(arr1));
	}
}