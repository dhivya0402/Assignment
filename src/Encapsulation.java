class A1{

 private String name;

 //getter
 public String getName(){
  return name;
 }
 
  //setter
 public void setName(String Sname){
    this.name=Sname;
  }
 
 }
public class Encapsulation {

	public static void main(String[] args) {
		 A1 obj=new A1();
	     obj.setName("John");
	     System.out.println(obj.getName());

	}

}
