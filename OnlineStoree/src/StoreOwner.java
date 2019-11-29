
import static com.sun.org.apache.xalan.internal.lib.ExsltMath.random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class StoreOwner extends Account {

	private String ownerName;
	private String storeName;
        String p2;
        String b2;
        
        Brands B = new Brands();

	
   public void addProduct() {	
	 }
        
   public void viewNewProducts() {
		
	 }
        
        
   public void StoreStatistics() throws IOException{
       
            Customer C = new Customer();
            int ch = C.choice;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            
            if (ch == 1){
                count1 = count1 +1;}
            System.out.println("Number of users viewed the store’s products");
            System.out.println(count1);
            
            if (ch == 2){
                 count2 = count2 + 1;}
            System.out.println("Number of user buy a store’s produce:");
            System.out.println(count2);
            
            if(ch == 3){
                
            }
     }
        
        
        
        public void AssignBrand() throws IOException{
         System.out.println("Showing Products List: ");
         File file = new File("Products.txt");//open products file to view products and choose which one
         BufferedReader br = new BufferedReader(new FileReader(file));
         String st;
         while((st=br.readLine()) != null){
            System.out.println(st);
           }
         System.out.println("Choose product and assign its brand beside it please: \n");
         Scanner p = new Scanner(System.in); // enter name of product 
          p2 = p.nextLine();
          Scanner b = new Scanner(System.in); // enter name of brand 
          b2 = b.nextLine();
         
         Brands.AddProductBrand();
       
        }
        
}
        
      
