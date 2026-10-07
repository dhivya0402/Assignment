
public class reversee_num {
	public static void main(String[] args) {
		int num=1234;
		int reverse_num=0;
		while(num>0) {
			int last_digit=num%10;
			reverse_num=reverse_num*10+last_digit;
			num=num/10;
		}
		System.out.println(reverse_num);
	}

}
