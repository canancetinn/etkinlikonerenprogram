package etkinlik;
import java.util.Scanner;
public class etkinlikbulanprogram {

	public static void main(String[] args) {
		int sicaklik;
		String etkinlik;
		Scanner input = new Scanner(System.in);
		System.out.print("Sicaklik deðeri girin:");
		sicaklik = input.nextInt();
	    if(sicaklik <=5) {
	    	System.out.print("Kayak Yapabilirsin.");
	    }else if(sicaklik<=15 && sicaklik >=5) {
	    	System.out.print("Sinemaya gidebilirsin.");
	    }else if(sicaklik>=15 && sicaklik<=25) {
	    	System.out.print("Piknik yapabilirsin.");
	    }else if(sicaklik>=25) {
	    	System.out.print("Yüzmeye gidebilirsin.");
	    }else {
	    	System.out.print("Otur evinde.");
	    }
	    
	   
		
		
	}

}
