
public class Scond_largest {
	public static void main(String[] args) {
		int[] arr= {5,2,4,7,9,3,10};
		int second=arr[0];
		int first=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}else if(arr[i]> second) {
				second=arr[i];
				
			}
		}
		System.out.println("First Largest element: "+first);

		System.out.println("Second Largest element: "+second);
	}

}
