//Joshua Routledge
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;

/**
 * This program creates a string of your Itinerary from destinations the user has input
 * 
 * @author Josh
 * @version 1.0
 *
 */


public class Joshua_Routledge_Itinerary {
	
	/**
	 * This is the main method
	 * @param args an array of string values
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> destinations = new ArrayList<String>();
		StringBuilder sbItineraryOutput = new StringBuilder("Itinerary: ");
		
		System.out.print("This program will prompt you for a series of destinations.\r\n" + 
				"Then it will display your travel route based on your entries.\r\n\n" + 
				"Please enter your destinations [Enter done to finish]:\n\n"
				);

		int i = 0;
		
		while (i==0) {
			System.out.print("    Destination: ");
			String userInput = input.nextLine();
			userInput = userInput.toUpperCase();
			
			if("done".equalsIgnoreCase(userInput)) {
				i=1;
			} else {
				destinations.add(userInput);
			}
		}
		
		
		for(int j = 0; j < destinations.size(); j++) {
			
			sbItineraryOutput.append(destinations.get(j));
			
			if (j < destinations.size() - 1) {sbItineraryOutput.append(" to ");}
			
		}
		
		System.out.print("\n" + sbItineraryOutput);
		input.close();
	}
	
	
	
	
	
	
	
}