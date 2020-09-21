package q8;

public class MainApp {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		ClassA a =new ClassA();
		try {
			a.fun();
		}catch(MyNullPointerException e) {
			System.out.println(e);
		}

	}

}
