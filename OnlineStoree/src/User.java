import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class User  {   
	public void AddNewStore() throws IOException{
	    Administrator a = new Administrator();
	    
	       System.out.println("Enter your Store name: ");
	    	Scanner sn = new Scanner(System.in);
	        String name = sn.nextLine();
	        System.out.println("Enter Store type: Online or Onsite" );
	        Scanner type = new Scanner(System.in);
	        String Type = type.nextLine();
	        String Location = null;
	        if ("Onsite".equals(Type))
	        {
	        System.out.println("Enter Store location: " );
	        Scanner location = new Scanner(System.in);
	        Location= location.nextLine();
	        }
	        
	        System.out.println("Enter Store Category: " );
	        Scanner category = new Scanner(System.in);
	        String Category= category.nextLine();
	        System.out.println("Enter Store Hotline: " );
	        Scanner hotline= new Scanner(System.in);
	        String Hotline= hotline.nextLine();
	        File s = new File("Store.txt");
	        if(s.exists()==false){
	            System.out.println("there's an error!.");}
	            
	        else{
	      s.createNewFile();
	      PrintWriter s2 = new PrintWriter(new FileWriter("Store.txt", true));
	      
	       
	       try{
	           if( a.AcceptNewStore() == true)
	               {
	                s2.append("Name: " + name + "\n" + "Type: " + Type + "\n" +"Category: " +  Category + "\n" + "Location: " + Location + "\n" +"Hotline: " +  Hotline +"\n");
	                System.out.println("Your Store is added Successfuly. ");
	                s2.close();}
	           else
	           {
	               s2.print("");
	               s2.close();
	               System.out.println("Your Store is rejected by administrator! ");
	           }
	               
	       }    
	     catch(IOException e){}
	        }
	    
	   }

public void BuyProduct() throws FileNotFoundException, IOException{
    String tp = null;
    String a = null; 
    String ad = null;
    Customer cu = new Customer();
    Administrator admin = new Administrator();
    cu.ViewProducts();
    PrintWriter s2 = new PrintWriter(new FileWriter("Cart.txt", true));
    System.out.println("How many products you want to buy? " );
    Scanner number = new Scanner(System.in);
    int num = number.nextInt();
    
    for(int i=1;i<=num;i++){ 
    System.out.println("Please Enter your target product & Details:" );
    cu.ViewProducts();
    System.out.println("Product " + i +  " Name:  " );
    Scanner tproduct = new Scanner(System.in);
    tp = tproduct.nextLine();
    System.out.println("\nRequired Amount:  " );
    Scanner amount = new Scanner(System.in);
    a = amount.nextLine();
    System.out.println("\nShipping Address:  " );
    Scanner address = new Scanner(System.in);
    ad = address.nextLine();
    
    s2.append("Target Product : " + tp + "\n" + "Amount: " + a + "\n" +"Address: " +  ad + "\n");}
   
    System.out.println("\nConfirm Information?  " );
    Scanner confirm = new Scanner(System.in);
    String c = confirm.nextLine();
    boolean Accept = false;
    if(c == "yes"){
        if (admin.AcceptBuyingProduct() == true){
         
           System.out.println(" product added to your cart Successfuly. ");
           s2.close();}
    }
    else{
           s2.print("");
           s2.close();
           System.out.println("Order is Canceled! ");
          } 
       
  

     
}
}