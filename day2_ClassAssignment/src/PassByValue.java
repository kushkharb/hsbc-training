
public class PassByValue {
 int x=20;
 String[] names= {"ram","shyam","kush","loki"};
 public void display() {
	 x=10;
	 System.out.println("value "+x);
	 
 }
 
 public static void main(String[] args) {
	PassByValue p =new PassByValue();
	
	
	p.display();
	System.out.println(p.x);
	
	for(int i=0;i<p.names.length;i++) {
	System.out.println(p.names[i]);
	}
	
	String[] names2=p.names;
	
	System.out.println(p.names==names2);
	 
}
}
