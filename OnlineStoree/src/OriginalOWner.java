import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OriginalOWner {
	public void HistoryOfActions() throws IOException {
		
		 String line;
		 BufferedReader bufferedReader;
			bufferedReader = new BufferedReader(new FileReader("StoreActivities.txt"));
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
               	
               }
    	 }
	
	public void AcceptActions(String ActionName) throws IOException {
		
		HistoryOfActions();
		System.out.println("is there any actions you want to undo?" );
		Scanner s = new Scanner(System.in);
		String action = s.nextLine();
		if(action == "yes") {
			System.out.println("Action is canceled");
		System.out.println("which action: " );
		Scanner scan = new Scanner(System.in);
		String act = scan.nextLine();
		System.out.println("Action is canceled");}
		else
			System.out.println("Action accepted");
		
	}

	
		
	}
  }
