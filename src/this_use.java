
public class this_use {
	String name;
	//constructor class
	public this_use() {
		///this.x refers to the instance variable
		System.out.println("The topic is :");
		
	}
	void display(String name) {
		System.out.println(this.name);
		System.out.println(name);
	}
	public static void main(String[] args) {
		this_use obj= new this_use();
        obj.display("science");
	}

}