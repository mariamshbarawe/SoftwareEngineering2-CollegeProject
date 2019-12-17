import java.io.File;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreOwnerController {
	
	StoreOwnerInterface SOI = new StoreOwnerInterface();
	CustomerController C = new CustomerController();
	AdministratorController AC = new AdministratorController();
	String nameOfProduct;
	String nameOfStore;
    int Choice = C.choice;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int choice;
    
	
	
	 public void StoreStatistics() throws IOException{
         if (Choice == 1)
             count1 = count1 +1;
         
         if (Choice == 2)
              count2 = count2 + 1;
  }  
	 
	 
	 
	 
	 
	 
	 public void AddNewStore() throws IOException{
		    AdministratorController a = new AdministratorController();
		    File StoreFile = new File(SOI.name); 
		    StoreFile.createNewFile();
		   
		      PrintWriter StoreFile1 = new PrintWriter(new FileWriter("Store.txt", true));
		      StoreFile1.append("Name: " + SOI.name +  "\n" + "Original Owner Name: "+ SOI.originalowner + "\n" + "Type: "+ SOI.type + "\n" + "Category: "
		                +  SOI.category + "\n" +  "Location: " + SOI.location + "\n" +"Hotline: " +  SOI.hotline +"\n");
                   String StoreNameToAccept= SOI.name;
		           AC.AcceptNewStore( StoreNameToAccept);
		       if( AC.AcceptNewStore(StoreNameToAccept) == true){
			       System.out.println("Your Store is added Successfuly. ");
			       StoreFile1.close();}
				    
			   else{
				   StoreFile1.print("");
				   StoreFile1.close();
			       System.out.println("Your Store is rejected by administrator! ");
			       }
		       }
	 
	 
	
	 
    public void BuyProduct(){}
	
	
	public void AssigningBrand(String productassign, String brandassign) {
		BufferedWriter writer = new BufferedWriter(new FileWriter("Brands.txt", true) );  
        writer.newLine();   //Add new line
        writer.write(productassign + " - " + brandassign);
        writer.close();
	}
		
		
	public void EditProcess(String NStore, String NProduct, String Edit) {
		 File s = new File(NStore);
	     PrintWriter s2 = new PrintWriter(new FileWriter(NStore, true));
		 s2.append(NProduct + " - New Changes: " +Edit);
		 
		BufferedWriter bw;
     	bw = new BufferedWriter(new FileWriter("StoreActivities.txt"));
     	bw.write("Product Edited: " + NProduct+"\n" 
     	+"Store Name: " + NStore + "Changes: "+ Edit);
	}
	
	
	
	
	
	public  void DeleteProduct(String storeName, String productName, String ownername){
		
		BufferedReader bufferedReader;
        boolean found= false;
        boolean storeExist= false;
        String CheckProduct;
        	String CheckStore;
        	
            bufferedReader = new BufferedReader(new FileReader(storeName));
            boolean productExists = false;
			while((CheckStore = bufferedReader.readLine()) != null) {
            	
                if (CheckStore.equals(storeName)){    
                   boolean storelExists = true;
                   CheckProduct = bufferedReader.readLine();
                    if(CheckProduct.equals(nameOfProduct))
                    {
                        productExists=true;
                        CheckStore = " ";
                        CheckProduct = " ";
                        productName= " ";
                        System.out.println("Product is Deleted!");}
                }
            }
    	System.out.println("Theres an error in processing!");
    	
    	BufferedWriter bw;
    	
    	bw = new BufferedWriter(new FileWriter("StoreActivities.txt"));
    	bw.write("A product Deleted from Store: " + storeName+"\n" 
    	+ "Owner who deleted: "+ ownername + "Product deleted: " + productName);}

        	
   




public void AddProductToStore(String ownername, String storename, String productname, int ownertype) {
		BufferedReader bufferedReader;
		bufferedReader = new BufferedReader(new FileReader("Products.txt"));
        String line;
        while((line = bufferedReader.readLine()) != null) {    
            	BufferedWriter bufferedWritter;
            	if (line.equals(productname)){
            	bufferedWritter = new BufferedWriter(new FileWriter(storename));
            	bufferedWritter.write("Product: " + productname + "Owner Added: "+ ownername);}
           
            	//when he find the store name, add below the product?
            	
            	BufferedWriter bw;
            	bw = new BufferedWriter(new FileWriter("StoreActivities.txt"));
            	bw.write("New Product added to Store: " + productname+"\n" 
            	+ "Owner Adde: "+ownername + "Store Name: " + storename);}}









}
}


