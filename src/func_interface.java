interface A{
	
	void display();
}
public class func_interface {

	public static void main(String[] args) {
		
		A obj=new A() {
			public void display() {
				System.out.println("This is display Method");
			}
		};
		
       obj.display();
	}
}
