
public class Player {

	String name;
	int id;
	int currency;
	int dirt;
	int stone;
	int copper;
	int iron;
	int silver;
	int gold;
	int sapphire;
	int diamond;
	ObjRockLevel maxRock;
	ObjPickaxe pickaxe;
	ObjDamageMod damageMod;
	ObjRolls rolls;

	
	public Player(String name,int id, int currency, int dirt, int stone, int copper, int iron, int silver, int gold, int sapphire, int diamond, ObjRockLevel maxRock, ObjDamageMod damageMod, ObjPickaxe pickaxe, ObjRolls rolls) {
		setName(name);
		setId(id);
		setCurrency(currency);
		setDirt(dirt);
		setStone(stone);
		setCopper(copper);
		setIron(iron);
		setSilver(silver);
		setGold(gold);
		setSapphire(sapphire);
		setDiamond(diamond);
		setMaxRock(maxRock);
		setDamage(damageMod);
		setRolls(rolls);
		setPickaxe(pickaxe);
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public ObjPickaxe getPickaxe() {
		return pickaxe;
	}

	public void setPickaxe(ObjPickaxe pickaxe) {
		this.pickaxe = pickaxe;
	}
	
	public ObjDamageMod getDamage() {
		return damageMod;
	}

	public void setDamage(ObjDamageMod damage) {
		this.damageMod = damage;
	}

	public ObjRolls getRolls() {
		return rolls;
	}

	public void setRolls(ObjRolls rolls) {
		this.rolls = rolls;
	}
	
	public ObjRockLevel getMaxRock() {
		return maxRock;
	}

	public void setMaxRock(ObjRockLevel maxRock) {
		this.maxRock = maxRock;
	}

	public int getCurrency() {
		return currency;
	}
	
	public String getName() {
		return name;
	}

	public int getStone() {
		return stone;
	}


	public int getCopper() {
		return copper;
	}


	public int getIron() {
		return iron;
	}


	public int getSilver() {
		return silver;
	}


	public int getGold() {
		return gold;
	}


	public int getSapphire() {
		return sapphire;
	}


	public int getDiamond() {
		return diamond;
	}


	public int getDirt() {
		return dirt;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setCurrency(int currency) {
		this.currency = currency;
	}


	public void setStone(int stone) {
		this.stone = stone;
	}


	public void setCopper(int copper) {
		this.copper = copper;
	}


	public void setIron(int iron) {
		this.iron = iron;
	}


	public void setSilver(int silver) {
		this.silver = silver;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public void setSapphire(int sapphire) {
		this.sapphire = sapphire;
	}


	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}


	public void setDirt(int dirt) {
		this.dirt = dirt;
	}
}
