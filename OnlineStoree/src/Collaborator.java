import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Collaborator  {
    
    private String collabname;
    private String storeName;
    int choice;
    public void Collaborate() throws IOException {
    	System.out.println("Options: ");
    	System.out.print("1- Add Product.\n  " + "2- View Products.\n"+ "3- Show Statistics.\n" +
    	                 "4- Assign BRand.\n" );
    	Scanner sc = new Scanner(System.in); 
        choice = sc.nextInt();
    	
    	switch(choice) {
    	case 1:
    		addProduct();
    		break;
    	case 2:
    		viewNewProducts();
    		break;
    	case 3:
    		StoreStatistics();
    		break;
    	case 4: 
    		AssignBrand();
    		break;
    		
    		
    	
    }}
CollaboratorController c = new CollaboratorController();
	
   public void addProduct() throws FileNotFoundException {
       c.addProduct();
	 }
        
   public void viewNewProducts() throws FileNotFoundException, IOException {
        c.VNP();
	 }
    
    public void StoreStatistics() throws IOException { 
         c.Stats();                 
     }

    public void AssignBrand() throws IOException {     
       c.assignB();
        }
        
}