package questions1to6;

/**
 * 
 * @author DELL
 *
 *Yes there can be try block without catch block when we use finally block
 */

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=1;
			int y=0;
			int d=x/y;
			System.out.println(d);
		}finally {
			System.out.println("inside finally block");
		}
	}

}
