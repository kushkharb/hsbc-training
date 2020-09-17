package Computer;

public class Computer {
	
	/**
	 * @author DELL
	 */
	
	private Cpu c;
	private Monitor m;
	private Keyboard k;
	private Mouse mouse;

	public Computer() {
		 c = new Cpu(30000,8);
		 m = new Monitor(15000,16);
		 mouse = new Mouse(2000,true);
		 k = new Keyboard(2000,true);
	}
	public void getComputerDetails() {
		c.getinfo();
		m.getinfo();
		mouse.getinfo();
		k.getinfo();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c1= new Computer();
		c1.getComputerDetails();
	}

}
