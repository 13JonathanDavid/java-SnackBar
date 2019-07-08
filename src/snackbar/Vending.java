package snackbar;

class Vending {
	public Vending(){

	}
	private static int idCounter = 0;
	private int id;
	private String name;
	public Vending(String name){
		this.id = idCounter++;
		this.name = name;
	}
	//getters 
	public int getInt() {
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
		this.id = id;
	}
}