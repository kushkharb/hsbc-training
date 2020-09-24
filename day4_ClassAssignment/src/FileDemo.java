import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("d:\\temp\\io");
//		file.isDirectory()?System.out.println("its a Directory"):System.out.println("Not a Directory");
		System.out.println("Directory: "+file.isDirectory());
		System.out.println("is Writable: "+file.canWrite());
	}
	

}
