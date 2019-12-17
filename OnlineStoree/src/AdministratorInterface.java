import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministratorInterface {
	AdministratorController AC = new AdministratorController();
	int AdminChoice;
	String ProductInfo;
	
	public void AdministratorOptions() throws IOException {
		System.out.println("Options: ");
		System.out.print("1- Add New Product.\n  " + "2- Add New Brand.\n"+ 
		                 "3- New Store Request " + "4- ");
		Scanner sc = new Scanner(System.in); 
		AdminChoice = sc.nextInt();
	    
		switch (AdminChoice) { 
	    case 1: 
	    	AddNewProduct(null, null, null); //sprint 2  
	        break; 
		}
	}
	
	public void AddNewProduct(String ProductName, String ProductCategory, String ProductPrice) throws IOException {
    	System.out.println("Please Enter Number of products you want to add ");
    	Scanner n = new Scanner(System.in);
    	int y= n.nextInt();
    	for(int i=0; i<y;i++) {
    	System.out.println("Please Enter Product "+i+ " Name:\n");
    	 Scanner pname = new Scanner(System.in);
         ProductName = pname.nextLine();
         System.out.println("Enter: Category\n");
         Scanner pcategory = new Scanner(System.in);
         ProductCategory = pcategory.nextLine();
         System.out.println("Enter: Price\n");
         Scanner pprice = new Scanner(System.in);
         ProductPrice = pprice.nextLine();
      
 
        AC.AddProducts(ProductName, ProductCategory, ProductPrice);
        System.out.println("Product is added.");
        }
    }
	
	
	public void AddNewBrand() {
		System.out.println("Enter your Brand name: ");
    	Scanner bn = new Scanner(System.in);
        String brandname = bn.nextLine();
        System.out.println("Enter Brand Type: ");
        Scanner bt = new Scanner(System.in);
        String brandtype = bt.nextLine();
         System.out.println("Enter Brand Code: ");
        Scanner bc = new Scanner(System.in);
        String brandecode = bc.nextLine();
        AC.AddBrand(brandname, brandtype, brandcode);
	}

}
