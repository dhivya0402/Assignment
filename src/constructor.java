
public class constructor {

	String name;
	
	constructor(){
		System.out.println("hello");
	}
	constructor(String name){
     this.name=name;
	System.out.println(name);
	}
	public static void main(String[] args) {
		constructor obj1=new constructor();
		constructor obj=new constructor("Hi");
		System.out.println(obj.name);
		
		
	}
	
}
