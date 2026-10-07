
public class Reverse_num {
	public static void main(String[] args) {
		int num=635;
		int reverse_number=0;
		int temp=num;
		while(temp>0) {
			int last=temp%10;
			reverse_number=reverse_number*10+last;
			temp=temp/10;
		}
		System.out.println(reverse_number);
		//if(num == reverse_number) {
			//System.out.println("palindrom number");
		//}else {
			//System.out.println("Not a palindrome");
		//}
	}

}
