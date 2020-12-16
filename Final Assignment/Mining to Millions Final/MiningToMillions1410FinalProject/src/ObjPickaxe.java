
public class ObjPickaxe {

	int id;
	int damage;
	int price;
	
	public ObjPickaxe(int id, int price, int damage) {
		setId(id);
		setDamage(damage);
		setPrice(price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
