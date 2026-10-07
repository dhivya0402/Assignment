import java.util.*;
public class pattern_3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rows=sc.nextInt();
	for(int i=0;i<rows;i++) {
		for(int j=0;j<rows-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
