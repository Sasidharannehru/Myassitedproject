package sasi.project1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOperation {
	public  static void CreateFolder() {
		
		
		File newFolder = new File("newFolder");
		
		newFolder.mkdir();
		File newfile= new  File(newFolder,"filename");
		System.out.println( newfile);
	}
	public static void displayAllfile(String path) {
		FileOperation.CreateFolder();
		System.out.println("display all file in directory in ascending order \n");
		List<String > Filesname= FileOperation.FilesInDirectory(path,0,new ArrayList<String>());
		
	}
	public static List<String> FilesInDirectory(String path, int i, ArrayList<String> arrayList) {
		File directory= new File(path);
		File[] files=directory.listFiles();
		List<File> filelist=Arrays.asList(files);
		return null;
	}

}

