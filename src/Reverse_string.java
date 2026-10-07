import java.util.*;

public class Reverse_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("original String:"+str);
		String reverse_string="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			reverse_string=ch+reverse_string;
		}
		System.out.println("Reverse String:"+reverse_string);
		if(str.equals(reverse_string)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not an palindrome");
		}
		sc.close();

	}
	

}
