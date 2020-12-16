
public class RockTriple extends Rock
{
	int resourceId2;
	int probability2;
	int resourceId3;
	int probability3;

	public RockTriple(int levelId, int health, int price, int resourceId, int probability, int resourceId2, int probability2, int resourceId3, int probability3) {
		super(levelId, health, price, resourceId, probability);
		setResourceId2(resourceId2);
		setProbability2(probability2);
		setResourceId3(resourceId3);
		setProbability3(probability3);
	}
	
	protected void genResources(Player player){
		 int i = 0;
		 while(player.rolls.rolls > i) {
			 
			 int roll;
		     roll = (int)(Math.random() * 100);
			 
		     if(roll < probability) {
		    	 addResources(player, resourceId);
		     } else if (roll < probability2) {
		    	 addResources(player, resourceId2);
		     } else {
		    	 addResources(player, resourceId3);
		     }
			 i++;
		 }
	}
	
	public int getResourceId2() {
		return resourceId2;
	}
	
	public int getProbability2() {
		return probability2;
	}
	
	public int getResourceId3() {
		return resourceId3;
	}
	
	public int getProbability3() {
		return probability3;
	}
	
	public void setResourceId2(int resourceId) {
		this.resourceId2 = resourceId;
	}
	
	public void setProbability2(int probability) {
		this.probability2 = probability;
	}
	
	public void setResourceId3(int resourceId) {
		this.resourceId3 = resourceId;
	}
	
	public void setProbability3(int probability) {
		this.probability3 = probability;
	}
}
