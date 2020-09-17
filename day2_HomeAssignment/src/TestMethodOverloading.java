
public class TestMethodOverloading {
	
	public void add() {
		System.out.println("nothing to add");
	}
	
	public int add(int a, int b) {
		System.out.println("int + int"+(a+b));
		return a+b;
	}
	public float add(int a ,float b) {
		System.out.println("int + float"+(a+b));
		return a+b;
	}
	public double add(int a, double b) {
		System.out.println("int + double"+(a+b));
		return a+b;
	}
	public double add(double a, double b) {
		System.out.println("double + double"+(a+b));
		return a+b;
	}
	
	public static void main(String[] args) {
		TestMethodOverloading a = new TestMethodOverloading();
		a.add();
		a.add(2,3);
	    a.add(2,3.0f);
	    a.add(2,3.0);
	    a.add(2.0,3.0);

	}

}
