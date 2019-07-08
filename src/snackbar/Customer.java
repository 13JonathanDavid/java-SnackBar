package snackbar;

class Customer {
	private static idCounter = 0;
	private int id;
	private String name;
	private float money;
	public Customer (String name) {
		this.name = name;
		id = idCounter++;
		money = 0;
	}
	//getters
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	

	//setters
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}

	//methods
	public float cashOnHand(){
		return money;
	}
	public boolean addCash(int amount){
		boolean success = false;
		if(amount > 0){
			money += amount;
			success = true;
		}
		return success;
	}
	public boolean payExpense(expenseAmount){
		boolean success = false;
		if(expenseAmount <= money){
			money -= expenseAmount;
			success = true;
		}
		return success;
	}
}