package day5_HomeAssignment;

import java.io.File;

public class FileAttributesQ1 {

	public static void main(String[] args) {

		File file=new File("d:\\temp\\io\\lion.txt");
		System.out.println("Name= "+file.getName());
		System.out.println("canRead= "+file.canRead());
		System.out.println("CanWrite= "+file.canWrite());
		System.out.println("Path= "+file.getPath());
		System.out.println("AbsPath= "+file.getAbsolutePath());
		System.out.println("Exists= "+file.exists());
		System.out.println("Parent= "+file.getParent());
		System.out.println("isDirectory= "+file.isDirectory());
		System.out.println("LastModify= "+file.lastModified());
	}

}
