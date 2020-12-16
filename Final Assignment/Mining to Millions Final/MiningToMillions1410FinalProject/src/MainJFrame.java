import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;
	private static JPanel menuPane;
	public static Player player;
	public static Rock rock;
	public static ArrayList<Rock> rockList;
	public static MainJFrame frame;
	public static JSplitPane splitPane;
	public static ArrayList<Resource> resourceList;
	
	public static void main(String[] args) {
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
	        public void run() {
	            savePlayer();
	        }
	    }));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					player = loadPlayer();
					rockList = loadRocks();
					resourceList = MainJFrame.loadResources();
					selectRock(0);
					frame = new MainJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	//==============================  Action Methods ==============================
	
	public static void swingPickaxe() {
		rock.didBreak(player);
	}
	public static void selectRock(int id){
		
		rock = rockList.get(id);
	}
	
	//==============================  GUI Transition Methods ==============================
	
	public MainJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,  100,  698,  722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,  5,  5,  5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0,  0));

		contentPane = new MinePanel();
		setContentPane(contentPane);
		invalidate();
		validate();
		
	}	
	public static void switchToMine() {
		contentPane = new MinePanel();
		frame.setContentPane(contentPane);
		frame.invalidate();
		frame.validate();
	}
	public static void switchToShop() {
		shopSplit(0);
	}
	public static void switchToSell() {
		shopSplit(1);
	}
	public static void switchToBuy() {
		shopSplit(0);
	}
	public static void levelSelect() {
		contentPane = new LevelSelectPanel();
		frame.setContentPane(contentPane);
		frame.invalidate();
		frame.validate();
	}
	public static void shopSplit(int paneNeeded) {
		
		frame.setLayout(new BorderLayout());
		frame.setContentPane(contentPane);
		JPanel pane = new JPanel();
	    contentPane.removeAll();;
	    switch(paneNeeded){
	    	case 0: 
	    		pane = new BuyPanel();
	    		break;
	    	
	    	case 1: 
	    		pane = new SellPanel();
	    		break;
	    	
	    	default: 
	    		pane = new SellPanel();
	    		break;
	    }
		
		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane,  BorderLayout.CENTER);
		
		menuPane = new ShopPanel();
		splitPane.setTopComponent(menuPane);
		splitPane.setBottomComponent(pane);
		splitPane.setDividerSize(0);
		splitPane.setDividerLocation(175);
		frame.invalidate();
		frame.validate();
		
	}
	
	
	//==============================  Data Handling ==============================
	
	private static Player loadPlayer()
    {
        String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
        String dbLogin = "javauser";
        String dbPassword = "orange";
        Connection conn = null;
        
		String sql = "SELECT playerinfo.playerId, playerinfo.name, playerinfo.currency, playerinfo.stone, playerinfo.dirt, playerinfo.copper, "
				+ "playerinfo.iron, playerinfo.silver, playerinfo.gold, playerinfo.sapphire, playerinfo.diamond, playerinfo.rocksUnlockedId AS rockId, "
				+ " rocks.price AS rockPrice, playerinfo.damageModId, damageupgrade.price AS damageModPrice, "
				+ "damageupgrade.damage AS damageModDamage, playerinfo.pickaxeId, pickaxeupgrade.price  AS pickaxePrice, pickaxeupgrade.damage  "
				+ "AS pickaxeDamage, playerinfo.rollsId AS rollId, rollupgrade.price AS rollPrice, rollupgrade.rolls FROM playerinfo, damageupgrade, "
				+ "rollupgrade, pickaxeupgrade, rocks WHERE playerId = 1 "
				+ "&& playerinfo.rollsId = rollupgrade.priceId "
				+ "&& playerinfo.rocksUnlockedId = rocks.rockid "
				+ "&& playerinfo.damageModId = damageupgrade.priceId "
				+ "&& playerinfo.pickaxeId = pickaxeupgrade.priceId;";
		
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
			    		Player player = new Player(rs.getString("name"),
			    				rs.getInt("playerId"),
			    				rs.getInt("currency"),
			    				rs.getInt("dirt"),
			    				rs.getInt("stone"),
			    				rs.getInt("copper"),
			    				rs.getInt("iron"),
			    				rs.getInt("silver"),
			    				rs.getInt("gold"),
			    				rs.getInt("sapphire"),
			    				rs.getInt("diamond"),
			    				new ObjRockLevel(rs.getInt("rockId"), rs.getInt("rockPrice")),
			    				new ObjDamageMod(rs.getInt("damageModId"), rs.getInt("damageModPrice"), rs.getInt("damageModDamage")),
			    				new ObjPickaxe(rs.getInt("pickaxeId"), rs.getInt("pickaxePrice"), rs.getInt("pickaxeDamage")),
			    				new ObjRolls(rs.getInt("rollId"), rs.getInt("rollPrice"), rs.getInt("rolls")));
			    		System.out.println("Loaded Player");
			    	return player;
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
			System.out.println("Failed to load player");
			e.printStackTrace();
		}
		Player player = new Player("Default",0, 0,0,0,0,0,0,0,0,0, new ObjRockLevel(0,0), new ObjDamageMod(0,0,1), new ObjPickaxe(0,0,1), new ObjRolls(0,0,1));
		return player;
    }	
	private static boolean savePlayer() {
		String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
        String dbLogin = "javauser";
        String dbPassword = "orange";
        Connection conn = null;
        
		String sql = "UPDATE playerinfo SET "
				+ "currency = " + player.currency + ", "
				+ "stone = " + player.stone + ", "
				+ "copper = " + player.copper + ", "
				+ "iron = " + player.iron + ", "
				+ "silver = " + player.silver + ", "
				+ "gold = " + player.gold + ", "
				+ "sapphire = " + player.sapphire + ", "
				+ "diamond = " + player.diamond + ", "
				+ "rocksUnlockedId = " + player.maxRock.rockId + ", "
				+ "damageModId = " + player.damageMod.id + ", "
				+ "pickaxeId = " + player.pickaxe.id + ", "
				+ "rollsId = " + player.rolls.id + ", "
				+ "dirt = " + player.dirt + " "
				+ "WHERE playerId = 1;";
		
		
		try {
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
			if (conn != null) 
			{
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.executeUpdate();

				System.out.println("Saved player");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Failed to save player data");
		return false;
	}
	public static ArrayList<Resource> loadResources()
    {
        String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
        String dbLogin = "javauser";
        String dbPassword = "orange";
        Connection conn = null;
        
		String sql = "SELECT  * FROM resources;";
		
		try 
		{
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
			if (conn != null) 
			{
			    try (Statement stmt = conn.createStatement();
	        		    ResultSet rs = stmt.executeQuery(sql)) 
         		    {
			    	ArrayList<Resource> list = new ArrayList<Resource>();
			    	while (rs.next()) 
			    	{
			    		Resource resource = new Resource(rs.getString("name"),rs.getInt("resourceId"),rs.getInt("price"));
			    		list.add(resource);
			    	}
			    	System.out.println("Loaded resources");
			    	return list;
         		    } 
			    catch (SQLException ex) 
         		    {
			    	System.out.println("Failed to load resources");
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
	private static ArrayList<Rock> loadRocks()
    {
        String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
        String dbLogin = "javauser";
        String dbPassword = "orange";
        Connection conn = null;
        
		String sql = "SELECT * FROM rocks;";
		
		try 
		{
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
			if (conn != null) 
			{
			    try (Statement stmt = conn.createStatement();
	        		    ResultSet rs = stmt.executeQuery(sql)) 
         		    {
			    	ArrayList<Rock> list = new ArrayList<Rock>();
			    	while (rs.next()) 
			    	{
			    		int id = rs.getInt("rockId");
			    		int health = rs.getInt("health");
			    		int price = rs.getInt("price");
			        	if((id + 3) % 3 == 0) {
			        		int r1 = ((id + 3)/3)-1;
			        		int p1 = 100;
			        		rock = new Rock(id,health, price,r1,p1);
			        	} else if((id + 2) % 3 == 0) {
			        		int r1 = ((id + 2)/3)-1;
			        		int p1 = 85;
			        		int r2 = ((id + 2)/3);
			        		int p2 = 100;
			        		if(r2 > 7) {r2 = 7;}
			        		rock = new RockDouble(id,health, price,r1,p1,r2,p2);
			        	} else if((id + 1) % 3 == 0) {
			        		int r1 = ((id + 1)/3)-1;
			        		int p1 = 50;
			        		int r2 = ((id + 1)/3);
			        		int p2 = 85;
			        		int r3 = ((id + 1)/3)+1;
			        		int p3 = 100;
			        		if(r2 > 7) {r2 = 7;}
			        		if(r3 > 7) {r3 = 7;}
			        		rock = new RockTriple(id,health, price,r1,p1,r2,p2,r3,p3);
			        	}
			    		list.add(rock);
			    	}
			    	System.out.println("Loaded rocks");
			    	return list;
         		    } 
			    catch (SQLException ex) 
     		    {
			    	System.out.println(ex.getMessage());
     		    }
			}
		} 
		catch (Exception e) 
		{
			System.out.println("failed to load rocks");
			e.printStackTrace();
		}
		return null;
    }
	
	
	//==============================  Sell Pane ==============================
	
	public static ObjPickaxe getPickaxe(){
		   String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
	    String dbLogin = "javauser";
	    String dbPassword = "orange";
	    Connection conn = null;
	    int pic = player.pickaxe.id + 1;
	    ObjPickaxe pickaxe;
	    String sql = "SELECT * FROM pickaxeupgrade WHERE priceId =  "+ pic +";";
			
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
	public static ObjRolls getRolls(){
		   String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
	    String dbLogin = "javauser";
	    String dbPassword = "orange";
	    Connection conn = null;
	    int roll = player.rolls.id + 1;
	    ObjRolls rolls;
	    String sql = "SELECT * FROM rollupgrade WHERE priceId = "+ roll +";";
			
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
	public static ObjDamageMod getDamageMod(){
		   String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
	    String dbLogin = "javauser";
	    String dbPassword = "orange";
	    Connection conn = null;
	    int damageModId = player.damageMod.id + 1;
	    ObjDamageMod damageMod;
	    String sql = "SELECT * FROM damageupgrade WHERE priceId = "+ damageModId +";";
			
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
				    		damageMod = new ObjDamageMod(rs.getInt("priceId"), rs.getInt("price"), rs.getInt("damage"));
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
	public static ObjRockLevel getRocks(){
		   String connectionString = "jdbc:mysql://127.0.0.1:3306/miningtomillions";
	    String dbLogin = "javauser";
	    String dbPassword = "orange";
	    Connection conn = null;
	    ObjRockLevel rockLevel;
	    int rockId = player.maxRock.rockId + 1;
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

	public static void buyPickaxe() {
			
			ObjPickaxe nextPickaxe =  getPickaxe();
			
			if(player.currency >= nextPickaxe.price) {
				
				player.setPickaxe(nextPickaxe);
				player.currency = player.currency - nextPickaxe.price;
				
			}
			
		}
	public static void buyDamage() {
		
		ObjDamageMod nextDamageMod = getDamageMod();
		
		if(player.currency >= nextDamageMod.price) {
			
			player.setDamage(nextDamageMod);
			player.currency = player.currency - nextDamageMod.price;
			
		}
		
	}	
	public static void buyRock() {
		
		ObjRockLevel nextRock =  getRocks();
		
		if(player.currency >= nextRock.price) {
			
			player.setMaxRock(nextRock);
			player.currency = player.currency - nextRock.price;
			
		}
		
	}
	public static void buyRoll() {
			
		ObjRolls nextRoll =  getRolls();
			
			if(player.currency >= nextRoll.price) {
				
				player.setRolls(nextRoll);
				player.currency = player.currency - nextRoll.price;
				
			}
			
		}
		
	public static void sellDirt() {
		int amount = resourceList.get(0).price * player.dirt;
		player.currency = player.currency + amount;
		player.dirt = 0;
	}
	public static void sellStone() {
		int amount = resourceList.get(1).price * player.stone;
		player.currency = player.currency + amount;
		player.stone = 0;
	}
	public static void sellCopper() {
		int amount = resourceList.get(2).price * player.copper;
		player.currency = player.currency + amount;
		player.copper = 0;
	}
	public static void sellIron() {
		int amount = resourceList.get(3).price * player.iron;
		player.currency = player.currency + amount;
		player.iron = 0;
	}
	public static void sellSapphire() {
		int amount = resourceList.get(4).price * player.sapphire;
		player.currency = player.currency + amount;
		player.sapphire = 0;
	}
	public static void sellSilver() {
		int amount = resourceList.get(5).price * player.silver;
		player.currency = player.currency + amount;
		player.silver = 0;
	}
	public static void sellGold() {
		int amount = resourceList.get(6).price * player.gold;
		player.currency = player.currency + amount;
		player.gold = 0;
	}
	public static void sellDiamond() {
		int amount = resourceList.get(7).price * player.diamond;
		player.currency = player.currency + amount;
		player.diamond = 0;
	}
		
	

}
