package Computer;

public class Cpu {
	
	private int price;
	private int ram;
	
	public Cpu(int p, int r) {
		this.price=p;
		this.ram=r;
	}
	
	public void getinfo() {
		System.out.println("monitor-price:"+price+" "+ ram);
	}

}
