
public class NestedTryCatchQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				int x=1;
				int y=0;
				int d=x/y;
				System.out.println(d);
				}
			catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside arithmetic exception");
			System.out.println(e);
		}
	}

}
