
public class ObjRockLevel {

	int rockId;
	int price;
	
	public ObjRockLevel(int rockId, int price) {
		setRockId(rockId);
		setPrice(price);
	}

	public int getRockId() {
		return rockId;
	}

	public void setRockId(int rockId) {
		this.rockId = rockId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
