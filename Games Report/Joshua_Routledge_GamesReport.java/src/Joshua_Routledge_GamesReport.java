//Joshua Routledge

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileWriter;

/**
 * This program reads a csv file of gamer scores and generates a list of the name of the gamer, their scores and their total
 * This program also adds a new entry to the csv file
 * 
 * @author Joshua Routledge
 * @version 1.0
 *
 */

public class Joshua_Routledge_GamesReport{
	
	
	public static void main(String[] args) throws IOException{
		
		File fileName = new File("C:\\\\Data\\\\GameScores.csv");
    	printGameReport(fileName);
    	addGamer(fileName,"Jimmy", 189, 190, 197, 199, 198, 193, 199, 199, 188, 196);
    	printGameReport(fileName);
	}
	
	
	private static void printGameReport(File fileName) throws IOException{
		
		
		if (fileName.exists()) {
			
			BufferedReader br = null;
			String line = "";
			int recordCount = 0;
			String csvSplitBy = ",";
			br = new BufferedReader(new FileReader(fileName));
			
			dashLine();
			System.out.println("Games Report");
			dashLine();
			System.out.println("Gamer	1	2	3	4	5	6	7	8	9	10	Total");
			ArrayList<Integer> totals = new ArrayList<Integer>();
			int highestScore = -1;
			String highestPlayer = "";
			
			while((line = br.readLine()) != null) {
				
				String[] gamer = line.split(csvSplitBy);
				
				/**
				 * I use the Integer.parseInt(gamer[n].replaceAll("[^\\d]", "") in order to remove any characters or formatting that isnt 0-9
				 * as without this the program will generate an error due to a tab being on the end of the last csv line
				 */
				int totalScore = 	Integer.parseInt(gamer[1].replaceAll("[^\\d]", "")) + Integer.parseInt(gamer[2].replaceAll("[^\\d]", ""))
								+ 	Integer.parseInt(gamer[3].replaceAll("[^\\d]", "")) + Integer.parseInt(gamer[4].replaceAll("[^\\d]", ""))
								+ 	Integer.parseInt(gamer[5].replaceAll("[^\\d]", "")) + Integer.parseInt(gamer[6].replaceAll("[^\\d]", ""))
								+ 	Integer.parseInt(gamer[7].replaceAll("[^\\d]", "")) + Integer.parseInt(gamer[8].replaceAll("[^\\d]", ""))
								+ 	Integer.parseInt(gamer[9].replaceAll("[^\\d]", "")) + Integer.parseInt(gamer[10].replaceAll("[^\\d]", ""));
				if(totalScore > highestScore) {
					highestScore = totalScore;
					highestPlayer = gamer[0];
				}
				totals.add(totalScore);
				System.out.println(gamer[0] + ("\t")
						+ gamer[1].replaceAll("[^\\d]", "") + "\t" + gamer[2].replaceAll("[^\\d]", "") + "\t" + gamer[3].replaceAll("[^\\d]", "") + "\t"
						+ gamer[4].replaceAll("[^\\d]", "") + "\t" + gamer[5].replaceAll("[^\\d]", "") + "\t" + gamer[6].replaceAll("[^\\d]", "") + "\t"
						+ gamer[7].replaceAll("[^\\d]", "") + "\t" + gamer[8].replaceAll("[^\\d]", "") + "\t" + gamer[9].replaceAll("[^\\d]", "") + "\t"
						+ gamer[10].replaceAll("[^\\d]", "") + "\t" + totals.get(recordCount));
				
				recordCount++;
				
			}
			dashLine();
			System.out.println("# of Gamers:\t " + recordCount);
			System.out.println("Top Gamer:\t " + highestPlayer);
			dashLine();
			br.close();
		} else {
			System.out.printf("File %s does not exist.%n",fileName);
		}
		
	}
	
	
	private static void addGamer(File fileName, String playerName, int score1, int score2, int score3, int score4, int score5, int score6, int score7, int score8, int score9, int score10) throws IOException {
		FileWriter csvWriter = new FileWriter("C:\\\\Data\\\\GameScores.csv", true);
		csvWriter.write("\r" +playerName + "," + score1 + "," + score2 + "," + score3 + "," + score4 + "," + score5 + "," + score6 + "," + score7 + "," + score8 + "," + score9 + "," + score10);
		System.out.printf("Gamer %s record added.\n",playerName);
		csvWriter.close();
	}
	
	
	
	
	private static void dashLine()
	{
		System.out.println("-----------------------------------------------------------------------------------------------");
	}
	
	
	
	
	
	
	
}

