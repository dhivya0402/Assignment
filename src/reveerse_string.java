
public class reveerse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dhivyadharshini";
		String reverse_string="";
		for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		reverse_string=ch+reverse_string;
		}
		System.out.println(reverse_string);

	}

}
