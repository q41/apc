package textadventure.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item {
	
	private final String name;
	
	private final Map<String, Object> properties = new HashMap<String, Object>();
	
	private final static Map<String, Item> name2item = new HashMap<String, Item>();

	public static Item getItem(String name) {
		return name2item.get(name);
	}
	
	public Item(String name) {
		this.name = name;
		name2item.put(name, this);
	}
	
	public void setProperty(String propertyName, Object value) {
		properties.put(propertyName, value);
	}
	
	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}
	
	public void use(List<Item> with) {
		
	}
	
	public void use(Person on) {
		
	}

	public String getName() {
		return name;
	}
}
