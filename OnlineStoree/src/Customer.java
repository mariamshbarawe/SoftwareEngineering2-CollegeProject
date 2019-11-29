
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Customer extends Account {
	private String customerName;
	private String shippingInfo;
        int choice;
        
        
public void Options() throws IOException{
    
        System.out.println("Options: ");
        System.out.println("1- View Products. ");
        System.out.println("2- Buy product. ");
        System.out.println("3- Manage Account. ");
        System.out.println("4- Privacy & Policy.\n ");
        Scanner sc = new Scanner(System.in); 
        choice = sc.nextInt();
  
        
        switch (choice) { 
        case 1: 
            ViewProducts(); 
            break; 
        case 2: 
            BuyProduct(); 
            break; 
        case 3: 
            ManageAccount(); 
            break; 
        case 4: 
            Policy(); 
            break; 
       
        } 
    } 

        
        
        public void ViewProducts() throws FileNotFoundException, IOException {
            File file = new File("Products.txt");
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String st; 
             while ((st = br.readLine()) != null) 
              System.out.println(st); 
            }
       
        
        
        public void Policy()throws FileNotFoundException, IOException {
            File file = new File("Policy.txt");
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String st; 
             while ((st = br.readLine()) != null) 
              System.out.println(st);}
            
        
        
        
        public void  BuyProduct() throws FileNotFoundException, IOException{
             File file = new File("Products.txt");
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String st; 
             while ((st = br.readLine()) != null) 
              System.out.println(st);
          System.out.println("Enter name of product: ");
          Scanner pn = new Scanner(System.in);
          System.out.println("Product added to Cart");
        }
        
        
        
        
        
        
        
        
        
        public void ManageAccount(){}
        }
