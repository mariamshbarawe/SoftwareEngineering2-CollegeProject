import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Account extends User {
   private String address;
   private String creditCardInfo;
   private float accountBalance;
   protected String email;
   protected String password;
    
   public void Account() throws IOException{
 
    System.out.println("Would you Login or Register? ");
    Scanner choose = new Scanner(System.in);
    String s = choose.nextLine();
    
    
       if( s.equals("Login")|| s.equals("login")){
         Login();}
        
       else if(s.equals("Register")|| s.equals("register")) {
        Register();}
       else
    	   System.out.println("Invalid input.");
    }
   
    public void Login() throws FileNotFoundException {
        VerifyAccount us = new VerifyAccount();
       us.VerifyLogin();

    }

    public void Register () throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scanner.nextLine();
       //System.out.println("Create Account ");
       System.out.println("Enter new password: ");
       String password  = scanner.nextLine();
       
       try{
         VerifyAccount x = new VerifyAccount();
         x.setEmail(email);
         x.setPassword(password);
         
         if(x.VerifyRegisteration()) {
             
             Scanner Choice = new Scanner(System.in);
             String choice= Choice.nextLine();
             if ("Login".equals(choice)||"login".equals(choice))
             {
                 Login();
                 
             }
             else if ("Register".equals(choice)||"register".equals(choice))
             {
            	
            	 Register ();
             }
             else 
            	 System.out.println("Invalid Input.");
         } else { 
	        	 BufferedWriter writer = new BufferedWriter(
	             new FileWriter("Users.txt", true) );
	                
	
	              writer.write(x.getEmail());
	              writer.newLine();   
	              writer.write(x.getPassword());
	              writer.newLine();
	              System.out.println("Account has been created successfully .");
	              writer.close();
         }
      }
       catch (Exception e){
    	   
        }
       
     }

}


                      



        
        
        
       