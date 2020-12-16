
public class ObjRolls {

	
	int id;
	int rolls;
	int price;
	
	public ObjRolls(int id, int price, int rolls) {
		setId(id);
		setRolls(rolls);
		setPrice(price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRolls() {
		return rolls;
	}

	public void setRolls(int rolls) {
		this.rolls = rolls;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
