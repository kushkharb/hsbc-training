package Computer;

public class Keyboard {
	
	private int price;
	private boolean backlight;
	
	public Keyboard(int p, boolean b) {
		this.price=p;
		this.backlight=b;
	}
	
	public void getinfo() {
		System.out.println("keyboard- price:"+price+" "+ backlight);
	}

}
