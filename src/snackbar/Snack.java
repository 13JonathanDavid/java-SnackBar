package snackApp; 
	class Snack {
	private static int idCounter =0;;
	private int id;
	private String name;
	private int quantity;
	private float cost;

	public Snack(String name, int quantity, float cost){
		this.id = idCounter++;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}
	//getters

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getQuantity(){
			return quantity;
	}
	public float getCost(){
		return cost;
	}
		//setters
	public void setId(int id){
		this.id= id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCost(float cost){
		this.cost = cost;
	}
	//methods
	public void addQuantity (int amount){
		quantity += amount;
	}
	public boolean buySnack (int amount){
		boolean success =false;
		if(amount <= quantity) {
			quantity -= amount;
			success = true;
		}
		return success;
	}
	public float totalCost(int amount) {
		return cost * amount;
	}
}