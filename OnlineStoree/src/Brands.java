

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Brands extends Administrator {

    
    String bname;
    String btype;
    int    bnumber;

          Administrator a = new Administrator();

    
  public static void AddProductBrand() throws IOException{ //List the brands and choose brand 
      StoreOwner s = new StoreOwner();
      String product = s.p2;
      String brand = s.b2;
      
      System.out.println("Choose your product brand:");
      BufferedWriter writer = new BufferedWriter(new FileWriter("ProductsBrand.txt", true) );  
        writer.newLine();   //Add new line
        writer.write(product + " - " + brand);
        writer.close();}
  
        Scanner b = new Scanner(System.in);
        String choose = b.nextLine();
        
  } 