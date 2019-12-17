import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AdministratorController {
	
	AdministratorInterface AI = new AdministratorInterface();
	
	
	public  boolean AcceptNewStore(String StoreNameToAccept ) throws IOException{
        boolean request = false;
        System.out.println("There's new store request to be added in the website.\n" + "Store Details:\n " );
        File file = new File(StoreNameToAccept);
        BufferedReader st = new BufferedReader(new FileReader(file));
		return false;}
	
	
	
	
	public void AddProducts(ArrayList<String> ProductName, String ProductCategory, String ProductPrice) throws IOException {
		ProductName = new ArrayList<String>();
		ProductName.add(ProductCategory);
		ProductName.add(ProductPrice);
		 BufferedWriter writer = new BufferedWriter(
                 new FileWriter("Products.txt", true));  
                 writer.newLine();   //Add new line
                 for(String str: ProductName) {
                	  writer.write(str + System.lineSeparator());}
                 writer.close();
                 ShowProduct(ProductName);
	     }
	
	public void ShowProduct(ArrayList<String> Product) {
		for (int i = 0; i < Product.size(); i++) {
		      System.out.println(Product.get(i));
		      }
		
	}
	
	public void AddBrand(String BrandName, String BrandType, String BrandCode) throws IOException{
		PrintWriter b2 = new PrintWriter(new FileWriter("Brand.txt", true));
	    b2.append("Name: " + BrandName +  "  -  " + " Type: " +
		BrandType + "  -  " + " Code: " + BrandCode +"\n");
	    b2.close();}
	

}