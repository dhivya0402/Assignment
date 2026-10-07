interface Printable{
	void Display();
	
}
interface Showable{
	void Display();
}
 interface Writable{
	 void write();
 }
class Document implements Printable,Showable,Writable{

	@Override
	public void Display() {
		System.out.println("Displaying...");
		
	}
	public void write() {
		System.out.println("Writing....");
	}
	
	
}
public class Multiple_inheritance {
	public static void main(String[] args) {
		Document obj=new Document();
		obj.Display();
		obj.write();
		
	}

}
