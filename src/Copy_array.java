import java.util.Arrays;

public class Copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original_Array= {1,2,3,4,5,6};
		int[] Copy_Array= new int[original_Array.length];
		for(int i=0;i<original_Array.length;i++) {
			Copy_Array[i] = original_Array[i];
			
		}
		System.out.println("Original Array: "+Arrays.toString(original_Array));
		System.out.println("Copy of the original Array: "+Arrays.toString(Copy_Array));

	}

}
