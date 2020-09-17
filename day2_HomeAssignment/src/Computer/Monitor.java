package Computer;

public class Monitor {

	private int price;
	private int screenSize;
	
	public Monitor(int p, int s) {
		this.price=p;
		this.screenSize=s;
	}
	
	public void getinfo() {
		System.out.println("monitor-price:"+price+" "+ screenSize);
	}
}
