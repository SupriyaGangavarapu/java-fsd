package project2;

public class ClassTry {

	public static void main(String[] args) {
		int[] array=new int[3];
		try {
			array[5]=3;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index is out of bounds!");
		}
		finally {
			System.out.println("the array is of size "+array.length);
		}
	}

}
