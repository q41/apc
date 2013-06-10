package textadventure.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
	
	private final String name;

	private final List<Item> inventory = new ArrayList<Item>();
	
	private final static Map<String, Person> name2person = new HashMap<String, Person>();

	public static Person getPerson(String name) {
		return name2person.get(name);
	}
	
	public Person(String name) {
		super();
		this.name = name;
		name2person.put(name, this);
	}

	public List<Item> inspectInventory() {
		return Collections.unmodifiableList(inventory);
	}
	
	public void addToInventory(Item item) {
		inventory.add(item);
	}
	
	public void removeFromInventory(Item item) {
		inventory.remove(item);
	}
	
	public boolean isInInventory(Item item) {
		return inventory.contains(item);
	}
	
	public void talk(String words, Person to) {
		
	}
	
	public String getName() {
		return name;
	}

}
