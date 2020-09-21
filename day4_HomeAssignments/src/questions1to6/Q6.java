package questions1to6;

/**
 * 
 * @author DELL
 *
 * we can catch every exception that a statement may throw by "Exception Class".
 */

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int x=1;
			int y=0;
			int d=x/y;
			System.out.println(d);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
