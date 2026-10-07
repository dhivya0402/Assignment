import java.util.*;
public class Exception_handling {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  try {
	  int a=sc.nextInt();
	  }catch(Exception e) {
	  System.out.println(e);
	  }
	  System.out.println("The program ended");
	}

}
