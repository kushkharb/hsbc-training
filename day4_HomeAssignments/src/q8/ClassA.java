package q8;

public class ClassA {

	public void fun() throws MyNullPointerException {
		try
		{
			String s[]=new String[10];
			System.out.println(s[5].length());
		}
		catch (NullPointerException e) {
			throw new MyNullPointerException();
		}
	}
}
