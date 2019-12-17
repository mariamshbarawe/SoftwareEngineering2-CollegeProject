import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CustomerInterface {
	 int choice;

	public void Options() throws IOException{
	    
        System.out.println("Options: ");
        System.out.println("1- View Products. ");
        System.out.println("2- Buy product. ");
        System.out.println("3- Show My Cart. ");
      
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
            ShowCart(); 
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
	
	
	public void BuyProduct() {}
	
	public void ShowCart(){
		File file = new File("MyCart.txt");
		filee.createNewFile(); 
	}
}
