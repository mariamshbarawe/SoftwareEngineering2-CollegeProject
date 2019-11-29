import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.log;
import java.util.Scanner;




public class Administrator extends User { 
    private String adminName;
    
    
    public static void addNewProduct() throws IOException 
    {
    	System.out.println("Please Enter Number of products you want to add ");
    	Scanner n = new Scanner(System.in);
    	int y= n.nextInt();
    	for(int i=0; i<y;i++) {
    	System.out.println("Please Enter Product Name, Category, Price, Store Name, and Product Brand: ");
        Scanner pname = new Scanner(System.in);
        String pn = pname.nextLine();
        BufferedWriter writer = new BufferedWriter(
                                    new FileWriter("Product.txt", true)  //Set true for append mode
                                );  
        writer.newLine();   //Add new line
        writer.write(pn);
        writer.close();
      
        System.out.println("Product is added.");
        }
    }
    
    
    
    
    
    
    
    
    public  boolean AcceptNewStore() throws IOException{
        boolean request = false;
          System.out.println("There's new store request to be added in the website.\n" + "Store Details:\n " );
         
        File file = new File("Store.txt");
        BufferedReader st = new BufferedReader(new FileReader(file));
        String s;
        /*while((s=st.readLine()) != null){
            System.out.println(s);
        }*/
             System.out.println("Administrator Decision: ");
             System.out.println("Would you like to accept new Store? ");
             Scanner sc =  new Scanner(System.in);
             String input = sc.nextLine();
              if( input.equals("yes")){
                System.out.println("Store is added in website. ");
                return true;}
              else {
                   System.out.println("Store is rejected");
                   return request;}
              
            }




    
   public static void AddNewBrand() throws IOException{
       System.out.println("Enter your Brand name: ");
    	Scanner bn = new Scanner(System.in);
        String name = bn.nextLine();
        System.out.println("Enter Brand Type: ");
        Scanner bt = new Scanner(System.in);
        String type = bt.nextLine();
         System.out.println("Enter Brand Code: ");
        Scanner bc = new Scanner(System.in);
        String code = bc.nextLine();
         
    File b = new File("Brand.txt");
    try{
     if(b.exists()==false){
            System.out.println("there's an error!.");
            b.createNewFile();
    }
     
    PrintWriter b2 = new PrintWriter(new FileWriter("Brand.txt", true));
    b2.append("Name: " + name + "  -  " + " Type: " + type + "  -  " + " Code: " + code +"\n");
    b2.close();
    }catch(IOException e){
        System.out.println("COULD NOT ADD!!");}
    
       
   }   

    public boolean AcceptBuyingProduct() throws FileNotFoundException{
       boolean request = false;
          System.out.println("There's new products added to user cart " + "purchasing Details:\n " );
         
        File file = new File("CustomerCart.txt");
        BufferedReader st = new BufferedReader(new FileReader(file));
        String s;
        
             System.out.println("Administrator Decision: ");
             System.out.println("Would you like to accept new purchasing? ");
             Scanner sc =  new Scanner(System.in);
             String input = sc.nextLine();
              if( input.equals("yes")){
                System.out.println("product is added to user cart. ");
                return true;}
              else {
                   System.out.println("purchasing process is rejected");
                   return request;}
       
   }

    

}
 


