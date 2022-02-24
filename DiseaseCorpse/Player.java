import java.util.*;
public class Player {
	private ArrayList<Item> inventory;
	
	public Player(ArrayList<Item> i) {
		inventory = i;
	}
	
	public void addItem(Item i) {
		inventory.add(i);
	}
	
	public void useItem(int inventorySpace) {
		inventory.remove(inventorySpace);
	}
	
	public Item getItem(int inventorySpace) {
		return inventory.get(inventorySpace);
	}
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}
}
