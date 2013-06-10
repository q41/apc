package textadventure.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tile {

	private final String description;
	
	private final List<Item> items = new ArrayList<Item>();
	
	private final List<Person> persons = new ArrayList<Person>();

	private String id;

	private final static Map<String, Tile> name2tile = new HashMap<String, Tile>();

	public static Tile getTile(String id) {
		return name2tile.get(id);
	}
	
	public Tile(String id, String description) {
		super();
		this.id = id;
		name2tile.put(id, this);
		this.description = description;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public void removePerson(Person person) {
		persons.remove(person);
	}
	
	public List<Person> getPersons() {
		return Collections.unmodifiableList(persons);
	}
	
	public String getDescription() {
		return description;
	}
}
