
public class StaticExample {
	
	static int a=10;
	
	static public String getDuckBreed() {
		return "swedish Duck";
	}

	public static void main(String[] args) {
		
		System.out.println(StaticExample.a);
		System.out.println(StaticExample.getDuckBreed());
	}
}
