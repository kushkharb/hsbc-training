
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		String s="";
		for(int i=0;i<args.length;i++) {
			s=s+" "+args[i];
		}
		System.out.println(s);
	}

}
