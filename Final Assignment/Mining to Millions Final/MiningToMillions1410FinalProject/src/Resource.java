
public class Resource {
	
	String name;
	int id;
	int price;
	
	public Resource(String name, int id,int price) {

		setPrice(price);
		setName(name);
		setId(id);
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
