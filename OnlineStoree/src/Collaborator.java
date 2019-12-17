import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Collaborator  {
    
    private String collabname;
    private String storeName;
CollaboratorController c = new CollaboratorController();
	
   public void addProduct() {
       c.addProduct();
	 }
        
   public void viewNewProducts() {
        c.VNP();
	 }
    
    public void StoreStatistics() throws IOException { 
         c.Stats();                 
     }

    public void AssignBrand() throws IOException {     
       c.assignB();
        }
        
}


