package sasi.s;

import java.io.File;
import java.io.IOException;

public class FilesHandling {
	public static void main(String[] args) throws IOException {
		File file = new File("newfolder");
	       boolean present= file.exists();
	       System.out.println(file);
	       if (present==true) {
	    	   System.out.println("the folder %s is created");
	       }
	       else {
	    	   file.mkdir();
	    	   present=file.exists();
	    	   System.out.println("the folder %s is created ");
	    	  
	       
	       }
	       File thefile= new File(file,"filename");
	   		thefile.createNewFile();
	   		System.out.println(thefile);
	   		DeleteOperation(null);
	}
	
	   		
	    	 
	       
	    
		
	
	public static void DeleteOperation( String thefile) {
		
		 
	 }
	
	

}
