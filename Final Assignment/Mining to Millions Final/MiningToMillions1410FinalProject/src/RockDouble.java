
public class RockDouble extends Rock
{
	int resourceId2;
	int probability2;

	public RockDouble(int levelId, int health, int price, int resourceId, int probability, int resourceId2, int probability2) {
		super(levelId, health, price, resourceId, probability);
		setResourceId2(resourceId2);
		setProbability2(probability2);
	}
	
	protected void genResources(Player player){
		 int i = 0;
		 while(player.rolls.rolls > i) {
			
			 int roll;
		     roll = (int)(Math.random() * 100);
			 
		     if(roll < probability) {
		    	 addResources(player, resourceId);
		     } else {
		    	 addResources(player, resourceId2);
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
	
	public void setResourceId2(int resourceId) {
		this.resourceId2 = resourceId;
	}
	
	public void setProbability2(int probability) {
		this.probability2 = probability;
	}
}
