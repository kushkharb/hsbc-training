
public class Hello {
	
	public void hello(int i)
	{
		System.out.println("Integer function");	
	}
	public void hello(byte i)
	{
		System.out.println("Byte function");
	}
	public void hello(short i)
	{
		System.out.println("Short function");		
	}
	public void hello(long i)
	{
		System.out.println("Long function");		
	}
	public static void main(String[] args) {
		Hello h = new Hello();
		h.hello(5);
}

	/**
	 * hello(int i) is called because we pass Integer(5) as an argument so it automatically detect the hello method with integer argument  .
	 */
}
