package questions1to6;

/**
 * 
 * @author DELL
 *
 *Yes,there can be a catch block without a matching try block like i use NullPointerException in this code.
 */

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=1;
			int y=0;
			int d=x/y;
			System.out.println(d);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}
