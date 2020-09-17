package Computer;

public class Mouse {

	private int price;
	private boolean wireless;
	
	public Mouse(int p, boolean w) {
		this.price=p;
		this.wireless=w;
	}
	
	public void getinfo() {
		System.out.println("monitor-price:"+price+" "+ wireless);
	}
}
