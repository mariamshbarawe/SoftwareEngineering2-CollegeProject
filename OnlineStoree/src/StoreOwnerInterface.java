import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class StoreOwnerInterface {
	int choice;
	String name; //esm el stroe eli hayt3ml
	String type;
	String location;
	String category;
	String hotline;
	String originalowner;
	String action;
	StoreOwnerController SOC = new StoreOwnerController();
	OriginalOWner O = new OriginalOWner();
	Collaborator C = new Collaborator();
	
	
	
	public void StoreOwnerOptions() throws IOException {
	System.out.println("Options: ");
	System.out.print("1- Add New Store.\n  " + "2- Buy Product.\n"+ "3- Show Statistics.\n" +
	                 "4- Add New Collaborate.\n" + "5- Check History Of Actions.\n" +
			         "7- Assign Brand to product.\n" + "8- Delete product from store\n"+ 
	                 "9- Edit product information. \n" + "9- Accept Collaborators Actions. \n");
	Scanner sc = new Scanner(System.in); 
    choice = sc.nextInt();
    
	switch (choice) { 
    case 1: 
    	NewStore(); //sprint 2 -  
        break; 
    case 2: 
        SOC.BuyProduct(); //sprint 3 - story 1
        break; 
    case 3: 
        ShowStatistics(); //sprint 2
        break; 
    case 4: 
        C.Collaborate(); //sprint 4 - story 1
        break; 
        
    case 5: 
        OriginalOwner();  //sprint 4- store 2
        break; 
    case 6: 
    	AssignBrand(null, null); //sprint 2
        break;
    case 7: 
    	AddProducttoStore(); //sprint 1
        break;
    case 8:
    	Deletion(null, null, null);
    	break;
    case 9:
    	EditProduct();
    	break;
    case 10:
    	 O.AcceptActions(null);
    	break;
      } 

	}
	
	
	
	
	public void NewStore() throws IOException {
		    System.out.println("Please Enter Your Name to sign you as the original owner to the store: ");
	     	Scanner ow = new Scanner(System.in); //ow: original owner
            originalowner = ow.nextLine();
		    System.out.println("Enter your Store name: ");
	    	Scanner sn = new Scanner(System.in);
	        name = sn.nextLine();
	        System.out.println("Enter Store type: (Online or Onsite)" );
	        Scanner ty = new Scanner(System.in);
	        type = ty.nextLine();
	        location = null;
		        if ("Onsite".equals(type))
		        {
		        System.out.println("Enter Store location: " );
		        Scanner loc = new Scanner(System.in);
		        location= loc.nextLine();
		        }
		        
		        System.out.println("Enter Store Category: " );
		        Scanner categ = new Scanner(System.in);
		        category= categ.nextLine();
		        System.out.println("Enter Store Hotline: " );
		        Scanner hl= new Scanner(System.in);
		        hotline= hl.nextLine();
		        
		        SOC.AddNewStore();  
		        
	}
	
	
	public void ShowStatistics() {
		
		System.out.println("Number of users viewed the store’s products");
        System.out.println(SOC.count1);
        System.out.println("Number of user buy a store’s produce:");
        System.out.println(SOC.count2);
        
	}
	
	
	
	public void OriginalOwner() throws IOException {
		System.out.println("Enter your Name please: ");
		Scanner owname = new Scanner(System.in);
		String origname = owname.nextLine();
		System.out.println("Enter your store name: ");
		Scanner stname = new Scanner(System.in);
		String storename = stname.nextLine();
		
		 if (originalowner.equals(origname) && name.equals(storename) ) { //check if user is the original store owner or no by copmaring with his name when creating store
			 File s = new File("Store Activities.txt");
		      PrintWriter s2 = new PrintWriter(new FileWriter("Store Activities.txt", true));
		      s2.append("Store : " + name  + "  - Actions");
			   O.HistoryOfActions(); 
		 }
		 else
			 System.out.println("Sorry you are not the original store owner you cant access store history. ");	
		 
		 }
  
	
	
	public void AssignBrand(String productassign, String brandassign ) throws IOException{
	     
	         System.out.println("Choose product and assign its brand beside it please: \n");
	         Scanner productname = new Scanner(System.in); // enter name of product 
	         productassign = productname.nextLine();
	          Scanner brandname = new Scanner(System.in); // enter name of brand 
	          brandassign = brandname.nextLine();
	          SOC.AssigningBrand(productassign, brandassign);
			
	}
	
	
	public void AddProducttoStore() throws FileNotFoundException{
		File file = new File("Products.txt");
        BufferedReader st = new BufferedReader(new FileReader(file));
         System.out.println("Please enter these details to add product successfully. ");
         System.out.println("your store name:\n ");
         Scanner sname = new Scanner(System.in);
         String StoreName= sname.nextLine();
         System.out.println("your name: \n");
         Scanner name = new Scanner(System.in);
         String OwnerName= name.nextLine();
         System.out.println(" are you the 1. original owner or 2. collaborator? \n");
         Scanner type = new Scanner(System.in);
         int ownertype = type.nextInt();
         System.out.println("how many products you wants to add to your store? ");
 		 Scanner n = new Scanner(System.in);
 		 int num = n.nextInt();
         for(int i=0; i<=num; i++) {
        	 System.out.println("Name of product " + i + ":\n");
        	 Scanner product = new Scanner(System.in);
             String ProductName= product.nextLine();
             SOC.AddProductToStore(OwnerName, StoreName, ProductName, ownertype );
        
         }
	}
	
	public void EditProduct() {
		 System.out.println("Assign Store Name: ");
		 Scanner ns = new Scanner(System.in);
		 String StoreName= ns.nextLine();
		 System.out.println("Name of product you want to edit: ");
		 Scanner np = new Scanner(System.in);
		 String NameProduct = np.nextLine();
		 System.out.println("what changes you want to do: ");
		 Scanner ep = new Scanner(System.in);
		 String EditPro = ep.nextLine();
		 SOC.EditProcess(StoreName, NameProduct, EditPro);
	}
	
	public void Deletion(String NameOfStore, String NameOfProduct, String NameOwner) throws IOException {
		 System.out.println("Assign Store Name: ");
		 Scanner ns = new Scanner(System.in);
		 NameOfStore = ns.nextLine();
		 System.out.println("Name of product you want to delete: ");
		 Scanner np = new Scanner(System.in);
		 NameOfProduct = np.nextLine();
		 System.out.println("Assign Your Name: ");
		 Scanner os = new Scanner(System.in);
		 NameOwner = os.nextLine();
		 SOC.DeleteProduct(NameOfStore, NameOfProduct, NameOwner);
		 String Delete = "Delete PRoduct";
		O.AcceptActions(Delete);
	}
	
	
}
