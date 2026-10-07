class Animals{
	void makeSound(String name) {
		System.out.println(name+ " makes sound");
	}
}

class Dogs extends Animals{
	void makeSound() {
		super.makeSound("Animal");//it will call the parent class method
		System.out.println("Dog says:bow bow");
		
	}
}
public class super_key {
	public static void main(String[] args) {
		Dogs obj=new Dogs();
		obj.makeSound();//if we have same method name in sub and superclass ,automatically it will call subclass when subclass object is created 
	}

}
