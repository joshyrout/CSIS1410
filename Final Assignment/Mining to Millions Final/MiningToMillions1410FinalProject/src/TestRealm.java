import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 

public class TestRealm
{
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
   
   public static void main(String[] args){

	   
	   
	   
   }
   
   
   private ObjPickaxe getPickaxe(int pickaxeId){
	   String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
       String dbLogin = "javauser";
       String dbPassword = "orange";
       Connection conn = null;
       ObjPickaxe pickaxe;
       String sql = "SELECT * FROM pickaxeupgrade WHERE priceId =  "+ pickaxeId +";";
		
		try 
		{
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
			if (conn != null) 
			{
			    try (Statement stmt = conn.createStatement();
	        		    ResultSet rs = stmt.executeQuery(sql)) 
        		    {
			    	while (rs.next()) 
			    	{
			    		pickaxe = new ObjPickaxe(rs.getInt("priceId"), rs.getInt("price"), rs.getInt("damage"));
			    		return pickaxe;
			    		
			    	}
        		    } 
			    catch (SQLException ex) 
    		    {
			    	System.out.println(ex.getMessage());
    		    }
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Database connection failed.");
			e.printStackTrace();
		}
		return null;  
   }
   
   private ObjRolls getRolls(int rollId){
	   String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
       String dbLogin = "javauser";
       String dbPassword = "orange";
       Connection conn = null;
       ObjRolls rolls;
       String sql = "SELECT * FROM rollupgrade WHERE priceId = "+ rollId +";";
		
		try 
		{
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
			if (conn != null) 
			{
			    try (Statement stmt = conn.createStatement();
	        		    ResultSet rs = stmt.executeQuery(sql)) 
        		    {
			    	while (rs.next()) 
			    	{
			    		rolls = new ObjRolls(rs.getInt("priceId"), rs.getInt("price"), rs.getInt("rolls"));
			    		return rolls;
			    		
			    	}
        		    } 
			    catch (SQLException ex) 
    		    {
			    	System.out.println(ex.getMessage());
    		    }
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Database connection failed.");
			e.printStackTrace();
		}
		return null;  
   }
   
   private ObjDamageMod getDamageMod(int damageModId){
	   String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
       String dbLogin = "javauser";
       String dbPassword = "orange";
       Connection conn = null;
       ObjDamageMod damageMod;
       String sql = "SELECT * FROM rollupgrade WHERE priceId = "+ damageModId +";";
		
		try 
		{
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
			if (conn != null) 
			{
			    try (Statement stmt = conn.createStatement();
	        		    ResultSet rs = stmt.executeQuery(sql)) 
        		    {
			    	while (rs.next()) 
			    	{
			    		damageMod = new ObjDamageMod(rs.getInt("priceId"), rs.getInt("price"), rs.getInt("rolls"));
			    		return damageMod;
			    		
			    	}
        		    } 
			    catch (SQLException ex) 
    		    {
			    	System.out.println(ex.getMessage());
    		    }
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Database connection failed.");
			e.printStackTrace();
		}
		return null;  
   }

   
   private ObjRockLevel getRocks(int rockId){
	   String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
       String dbLogin = "javauser";
       String dbPassword = "orange";
       Connection conn = null;
       ObjRockLevel rockLevel;
       String sql = "SELECT * FROM rocks WHERE rockId = "+ rockId +";";
		
		try 
		{
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
			if (conn != null) 
			{
			    try (Statement stmt = conn.createStatement();
	        		    ResultSet rs = stmt.executeQuery(sql)) 
        		    {
			    	while (rs.next()) 
			    	{
			    		rockLevel = new ObjRockLevel(rs.getInt("rockId"), rs.getInt("price"));
			    		return rockLevel;
			    		
			    	}
        		    } 
			    catch (SQLException ex) 
    		    {
			    	System.out.println(ex.getMessage());
    		    }
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Database connection failed.");
			e.printStackTrace();
		}
		return null;  
   }
}

/*									Test Scripts
  
  
		System.out.print(player.name + "\n" +
				player.currency + "\n" +
				player.stone + "\n" +
				player.iron + "\n" +
				player.silver + "\n" +
				player.gold + "\n" +
				player.sapphire + "\n" +
				player.diamond + "\n" +
				player.rocksUnlocked + "\n" +
				player.damageMod + "\n" +
				player.pickaxeDamage + "\n" );
		}
 
  		
  		int i = 0;
 		while(list.size() > i){
    		
    		System.out.println(list.get(i).name);
    		System.out.println(list.get(i).id);
    		System.out.println(list.get(i).price);
    		i++;
    	}
  
  
  
 
  
 */





























