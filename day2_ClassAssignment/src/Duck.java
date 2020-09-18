
public class Duck {

	static {
		
	}
	static int duckCount=0;
	
	public Duck() {
		duckCount++;
	}
	
	public static String getDuckBreed() {
		return "swedish Duck";
	}
}
