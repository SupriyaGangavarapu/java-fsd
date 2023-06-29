package searching;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		int[] arr={7,9,3,6,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to search: ");
		int sv=sc.nextInt(); //sv is search element
		int result=(int)linearing(arr,sv);
		if(result== -1) {
			System.out.println("element is not found");
		}else {
			System.out.println("element is found at"+result+" and the search key is "+arr[result]);
		}
	}
	public static int linearing(int arr[],int x) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
}
