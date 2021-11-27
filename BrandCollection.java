
public class BrandCollection {
	static final int MAX_NUMBER_OF_ITEMS = 6;
	int numberOfItems = 0;
	Brand[] brands;

	public BrandCollection() {
		brands = new Brand[MAX_NUMBER_OF_ITEMS];
		// add parts here
	}

	public void addItem() {
		Brand d = new Brand();
		if (numberOfItems >= MAX_NUMBER_OF_ITEMS)
		System.err.println("Full");
		else {
		brands[numberOfItems] = d;
		numberOfItems = numberOfItems + 1;
		}
	}

	public Iterator createIterator() {
		return new BrandIterator(brands);
	}
}
