package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {2,3,5,7,9,12};
		int key=7;
		int arrlength=arr.length;
		binarySearch(arr,0,key,arrlength);
			
		}
public static void binarySearch(int[] arr,int start,int key,int length) {
	int midvalue=(start+length)/2;
	while(start<=length) {
		if(arr[midvalue]<key) {
			start=midvalue+1;
		}else if(arr[midvalue]==key) {
			System.out.println("element is found at index: "+midvalue);
			break;
		}else {
			length=midvalue-1;
		}
		midvalue=(start+length)/2;
	}
	if(start>length) {
		System.out.println("element is not found");
	}
	}

}
