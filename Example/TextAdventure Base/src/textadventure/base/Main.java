package textadventure.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static final String BECOME_COMMAND = "become";
	private static final String USE_COMMAND = "use";
	private static final String DROP_COMMAND = "drop";
	private static final String PICK_COMMAND = "pick up";
	private static final String LOOK_COMMAND = "look";
	private static final String GO_COMMAND = "go";
	private static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) throws IOException {
		World world = World.getInstance();
		Person ego = Person.getPerson(args[0]);
		Tile currentTile = world.getTile(0, 0);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			String line = br.readLine();
			if (line.equals(EXIT_COMMAND)) {
				break;
			}
			else if (line.startsWith(GO_COMMAND)) {
				String detail = line.substring(GO_COMMAND.length()).trim();
				int dx, dy;
				if (detail.equals("north")) {
					dx = 0; dy = 1;
				}
				else if (detail.equals("south")) {
					dx = 0; dy = -1;
				}
				else if (detail.equals("west")) {
					dx = -1; dy = 0;
				}
				else if (detail.equals("east")) {
					dx = 1; dy = 0;
				}
				else {
					System.err.println("Don'd understand 'go' diretion: " + detail);
					continue;
				}
				Coordinate currentCoordinate = world.getCoordinate(currentTile);
				int newX = currentCoordinate.x + dx;
				int newY = currentCoordinate.y + dy;
				currentTile.removePerson(ego);
				currentTile = world.getTile(newX, newY);
				currentTile.addPerson(ego);
			}
			else if (line.equals(LOOK_COMMAND)) {
				System.out.println("You see " + currentTile.getDescription());
				System.out.print("On the floor you see ");
				for (Item item : currentTile.getItems()) {
					System.out.print(item.getName() + ", ");
				}
				System.out.println();
				System.out.print("Together with you are ");
				for (Person person : currentTile.getPersons()) {
					System.out.print(person.getName() + ", ");
				}
			}
			else if (line.startsWith(PICK_COMMAND)) {
				String detail = line.substring(PICK_COMMAND.length()).trim();
				Item item = Item.getItem(detail);
				currentTile.removeItem(item);
				ego.addToInventory(item);
			}
			else if (line.startsWith(DROP_COMMAND)) {
				String detail = line.substring(DROP_COMMAND.length()).trim();
				Item item = Item.getItem(detail);
				ego.removeFromInventory(item);
				currentTile.addItem(item);
			}
			else if (line.startsWith(USE_COMMAND)) {
				String detail[] = line.substring(USE_COMMAND.length()).trim().split(" ");
				Item mainItem = Item.getItem(detail[0]);
				if (detail.length >= 2 && detail[1].equals("on")) {
					Person person = Person.getPerson(detail[2]);
					mainItem.use(person);
				}
				else {
					List<Item> otherItems = new ArrayList<Item>();
					if (detail.length > 1) {
						for (int i = 2; i < detail.length; i++)
							otherItems.add(Item.getItem(detail[i]));
					}
					mainItem.use(otherItems);
				}
			}
			else if (line.startsWith(BECOME_COMMAND)) {
				String detail = line.substring(BECOME_COMMAND.length()).trim();
				ego = Person.getPerson(detail);
				System.out.println("became '" + detail + "' (" + ego + ")");
			}
		}

	}

}
