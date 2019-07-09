package snackbar;


public class Main {
    
    public static void main (String [] args){

        processing();
    }
    public static void processing(){
        Customer jane = new Customer("Jane");
		jane.addCash(45.25);
        Customer bob = new Customer("Bob");
		bob.addCash(33.14);
		Vending food = new Vending("Food");
		Vending drink = new Vending("Drink");
		Vending office = new Vending("Office");
		//unclear about the relationship to vending machine.
		//Does vending machine interface with client or does vending machine keep a list of snacks?
		
    }
}