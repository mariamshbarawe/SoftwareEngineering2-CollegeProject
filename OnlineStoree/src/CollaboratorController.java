
import java.io.IOException;


public class CollaboratorController {
    
    StoreOwner p=new StoreOwner();
    History h= new History();
    
    public void addProduct(){
        p.addProduct();
    }
    
    public void VNP() {
    p.viewNewProducts(); 
    }
    
    public void assignB() throws IOException{   
    p.AssignBrand();
    }
    
    public void Stats() throws IOException { 
    p.StoreStatistics();   
    }
}
