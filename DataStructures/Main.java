package SortingTechniques;
class RotateArray{
	public void rotate(int[] num,int k) {
		if(k>num.length)
			k=k%num.length;
		int[] result=new int[num.length];
		for(int i=0;i<k;i++) {
			result[i]=num[num.length-k+i];
		}
		int j=0;
		for(int i=k;i<num.length;i++) {
			result[i]=num[j];
			j++;
		}
		System.arraycopy(result,0,num,0,num.length);
	}
}

public class Main{
	public static void main(String[] args) {
		RotateArray r=new RotateArray();
		int arr[]= {1,2,3,4,5,6,7};
		r.rotate(arr, 5);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}

