import java.io.BufferedReader;
import java.io.FileReader;
public class ReadA_file {
 
public static void main(String[] args) {
	try{
		FileReader fr=new FileReader("Output.txt");
		BufferedReader br=new BufferedReader(fr);
		String Line=br.readLine();
		
		System.out.println(Line);
		br.close();
		
	}catch(Exception e) {
		System.out.println("An error occured");
	}
}
}