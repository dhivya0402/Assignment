interface Playable{
	void play();
	
}

class Guitar implements Playable{
	@Override
	public void play() {
		System.out.println("Play Guitar");
	}
	
}
class Piano implements Playable{
	@Override
	public void play() {
		System.out.println("Play Piano");
	}
	
}
public class interface_t {
	public static void main(String[] args) {
		Piano obj1=new Piano();
		Guitar obj2=new Guitar();
		obj1.play();
		obj2.play();
	}

}
