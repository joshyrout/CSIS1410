import java.util.ArrayList;

public class Rock {

	int levelId;
	int price;
	int maxHealth;
	int currentHealth;
	int resourceId;
	int probability;
	
	public Rock(int levelId, int health, int price, int resourceId, int probability) {
		setLevelId(levelId);
		setPrice(price);
		setMaxHealth(health);
		setCurrentHealth(health);
		setResourceId(resourceId);
		setProbability(probability);
	}
	
	public void didBreak(Player player){
		
		int damageDone = player.pickaxe.damage * player.damageMod.damage;
		currentHealth = currentHealth - damageDone;
		
		if (currentHealth <= 0) {
			System.out.println("RIP, the rock is dead");
			genResources(player);
			MinePanel.updateText();
			resetRock();
		} else {
			System.out.println("It's Alive! Player Damage: " + damageDone + "  Rock Health: " + currentHealth);
		}
	}
	
	protected void genResources(Player player){
		 int i = 0;
		 while(player.rolls.rolls > i) {
			 
			 int roll;
		     roll = (int)(Math.random() * 100);
			 
		     if(roll < probability) {
		    	 addResources(player, resourceId);
		     }
			 i++;
		 }
	}
	
	protected void addResources(Player player, int resourceId){
		switch(resourceId) {
		
		case 0:
			player.dirt = player.dirt + 1;
			System.out.println("Dirt: " + player.dirt);
			break;
			
		case 1:
			player.stone = player.stone + 1;
			System.out.println("Stone: " + player.stone);
			break;
			
		case 2:
			player.copper = player.copper + 1;
			System.out.println("Copper: " + player.copper);
			break;
			
		case 3:
			player.iron = player.iron + 1;
			System.out.println("Iron: " + player.iron);
			break;
			
		case 4:
			player.sapphire = player.sapphire + 1;
			System.out.println("Sapphire: " + player.sapphire);
			break;
			
		case 5:
			player.silver = player.silver + 1;
			System.out.println("Silver: " + player.silver);
			break;
			
		case 6:
			player.gold = player.gold + 1;
			System.out.println("Gold: " + player.gold);
			break;
			
		case 7:
			player.diamond = player.diamond + 1;
			System.out.println("Diamond: " + player.diamond);
			break;
			
		default:
			player.dirt = player.dirt + 1;
			System.out.println("Dirt: " + player.dirt + " Hit default in switch");
			break;
		}
	}
	
	public int getResourceId() {
		return resourceId;
	}
	
	public int getProbability() {
		return probability;
	}
	
	private void resetRock(){
		setCurrentHealth(maxHealth);
	}
	
	public int getLevelId() {
		return levelId;
	}
	
	public int getCurrentHealth() {
		return currentHealth;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	
	public void setProbability(int probability) {
		this.probability = probability;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
