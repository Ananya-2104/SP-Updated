public class PartCollection {
	static final int MAX_NUMBER_OF_ITEMS = 6;
	int numberOfItems = 0;
	Part[] parts;
	public PartCollection() {
		parts = new Part[MAX_NUMBER_OF_ITEMS];
		// The parts can be added here
	}

	public void addItem() {
		Part s = new Part();
		if (numberOfItems >= MAX_NUMBER_OF_ITEMS)
			System.err.println("List is Full");
		else {
			parts[numberOfItems] = s;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public Iterator createIterator() {
		return new PartIterator(parts);
	}
}
