public class PartIterator implements Iterator {
	Part[] parts;
	// maintains the current position of the iterator over the array
	int pos = 0;
	// Constructor takes the array of parts that are going to iterate over.
	
	public PartIterator (Part[] parts){
		this.parts = parts;
	}

	@Override
	public Object next()
	{
		// return next element in the array and increment position
		Part part = parts[pos];
		pos += 1;
		return part;
	}

	@Override
	public boolean hasNext()
	{
		if (pos >= parts.length || parts[pos] == null)
			return false;
		else
			return true;
	}
}
