package questions1to6;
/**
 * 
 * @author DELL
 *
 *Yes, there can be a try block with out catch but with only finally.
 */

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x=2;
			int y=1;
			int d=x/y;
			System.out.println(d);
		}finally {
			System.out.println("inside finally block");
		}

	}

}
