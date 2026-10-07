import java.io.FileWriter;
public class WriteA_file {

	public static void main(String[] args) {
		try {
		FileWriter fw=new FileWriter("Output.txt",true);
		//this true will mark as that add the text in that alraedy created file
		//to check the file we have to find the package where this file created
		fw.append(" Mate"); //for append fw.append("text")//to add the text text in continuous
		fw.close();
		System.out.println("Success");
		}catch(Exception e) {
			System.out.println("Something has finished");
		}

	}

}
