package sasi.project1;

public class MyFirstProject {

	public static void main(String[] args) {
		menu.welcomemessage("to my application", "Sasidharan"); 
		 FileOperation.CreateFolder();

	}

}
  class menu{
	public static void welcomemessage(String ApplicationName,String developerName) {
		 String Details=String.format(" welcome to %s.\n"+"this application developed by %s.\n", ApplicationName,developerName);
		 String function="the below function are specified in this project.\n"+"Retreve all file,add,search,delete";
		 System.out.println(Details);
		 System.out.println(function);
		 menu.DisplayMenu();
       
		 
	 }
	  public static  void DisplayMenu() {
		  String MainMenu="\n__please select option to for the respective function .__\n"
				  +"1.Retrive "+"2.display menu "+"3.exit ";
		  System.out.println(MainMenu);
		  fileMenu();
		  }
	  public  static void fileMenu() {
		  
		  String FileMenu="\n Enter your choise in below option and press enter \n"
				  +"1.add a file "+"\n2.Delete a file"+"\n3.Search for a file "+"\n4.show previous menu"+"\n5.Exit";
		  System.out.println(FileMenu);
		
	}
	
	 
	
}


