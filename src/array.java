
public class array {

	public static void main(String[] args) {
		int[] arr= {1,2,4,6,5,7,8,9};
		int min_value=arr[0];
		int max_value=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min_value) {
				min_value=arr[i];
			}
			if(arr[i]>max_value) {
				max_value=arr[i];
			}
		}
	    System.out.println(min_value);
	    System.out.println(max_value);
	   

	}

}
