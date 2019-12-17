
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CollaboratorController {
    
    StoreOwnerInterface SOI =new StoreOwnerInterface();
   
    
    public void addProduct() throws FileNotFoundException{
        SOI.AddProducttoStore();}
    
    public void VNP() throws FileNotFoundException, IOException {
            File file = new File("Products.txt");
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String st; 
             while ((st = br.readLine()) != null) 
              System.out.println(st);  
    }
    	
    
    public void assignB() throws IOException{   
    	SOI.AssignBrand(String passign, String brandassign );
    }
    
    public void Stats() throws IOException { 
    	SOI.ShowStatistics();   
    }
}
