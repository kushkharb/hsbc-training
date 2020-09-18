
public class Box {
	
	public int length;
	public int breadth;
	public int height;
	public String color="Color Not Set";
	public double weight;
	
	public Box(int l,int b,int h) {
		this.length=l;
		this.breadth=b;
		this.height=h;
	}
	
	public Box(int l) {
		this(l,l,l);
	}
	public Box(int l,int b,int h,String c) {
		this(l,b,h);
		this.color=c;
	}
	
	public Box(int l,int b,int h,String c,double w) {
		this(l,b,h,c);
		this.weight=w;
	}
	
	public double getVolume() {
		return (breadth*height*length);
	}
	
	public String getColor() {
		return color;
    }
	public double getWeight() {
		return weight;
	}

	
	


}
