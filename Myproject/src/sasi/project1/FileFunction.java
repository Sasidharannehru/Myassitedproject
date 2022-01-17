package sasi.project1;

import java.io.File;

public class FileFunction {
	public static void Createfolder() {
		File file=new File("C:\\Users\\ELCOT\\Desktop\\folder");
		file.exists();
		System.out.println(file);
		
	}

}
