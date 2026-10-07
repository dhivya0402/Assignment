class Animal {
    String Name;
    int age;
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
    class Dog extends Animal{
    	@Override
       void makeSound(){
            System.out.println("Dog Barks");
    }
    void fetch(){
        System.out.println("Dog is Fetching");
        super.makeSound();
    }
}
class Cat extends Animal{
	String colour;
	void makeSound() {
		System.out.println("Cat meows");
	}
	void climb() {
		System.out.println("Cat is climbing");
	}
	
}
public class Main {
  public static void main(String[] args){
    Dog obj=new Dog();
    obj.Name="Golden";
    obj.age=5;
    System.out.println(obj.age);
    
    System.out.println(obj.Name);
    obj.makeSound();//it will call the function which is created in Dog class
    obj.fetch();
    
    
    Cat obj1=new Cat();
    obj1.Name="Pussy";
    obj1.age=2;
    System.out.println(obj.Name);
    
    System.out.println(obj.age);
    obj1.makeSound();
    obj1.climb();
     
    }
  }
    


