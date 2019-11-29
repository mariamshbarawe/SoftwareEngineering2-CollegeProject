import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class VerifyAccount extends Account{
	private String userID;
    Account a = new Account();
    public void setEmail(String email) {
    	this.email = email;
    }
    public void setPassword(String password) {
    	this.password = password;
    }
    
    public String getEmail() {
    	return this.email;
    }
    public String getPassword() {
    	return this.password;
    }
	
	public boolean VerifyRegisteration()throws FileNotFoundException{
        BufferedReader bufferedReader;
        boolean found= false;
        try {
            bufferedReader = new BufferedReader(new FileReader("Users.txt"));
            String line;
            boolean emailExists = false;
            while((line = bufferedReader.readLine()) != null) {
                if (line.equals(email)) {
                    emailExists = true;  
                    break;
                }
            }
            if (emailExists) {
                System.out.println("Email already exists!");
                System.out.println("Please choose either to 'login' or 'register' with another email.");
                found=true;
            } else {
            	System.out.println("Email accepted");
            	found=false;            	
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return found;
   }
	
	public boolean VerifyLogin()throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scanner.nextLine();
        System.out.println("Enter your passsword: ");
        String password = scanner.nextLine();
        System.out.println("Checking to see if account exists...");
        BufferedReader bufferedReader;
        boolean found= false;
        try {
            bufferedReader = new BufferedReader(new FileReader("Users.txt"));
            String line1;
            String line2;
            boolean emailExists = false;
            boolean passwordExists = false;
            while((line1 = bufferedReader.readLine()) != null) {
            	
                if (line1.equals(email)){    
                    emailExists = true;
                    line2 = bufferedReader.readLine();
                    if(line2.equals(password))
                    {
                        passwordExists=true;
                        System.out.println("Login successful!");
                        return true;
                    }
                }
            }
    	System.out.println("Email or password maybe incorrect!");
        } catch (FileNotFoundException e) {} 
        catch (IOException e) {}	
        return found;
   }

}
