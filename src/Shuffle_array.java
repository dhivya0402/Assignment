import java.util.*;
public class Shuffle_array {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		List<int[]> list=Arrays.asList(arr);
		System.out.println("Original Array: "+ Arrays.toString(arr));
		Collections.shuffle(list);
		list.toArray();
		System.out.println("Shuufled Array: "+list(arr));
		
		
	}

	private static String list(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

}
