
public class BrandIterator implements Iterator {
	Brand[] brands;

	// maintains curr pos of iterator over the array
	int pos = 0;

	// Constructor takes the array of parts are going to iterate over.
	public BrandIterator (Brand[] brands){
		this.brands = brands;
	}
	
	@Override
	public Object next()
	{
		// return next element in the array and increment pos
		Brand brand = brands[pos];
		pos += 1;
		return brand;
	}

	@Override
	public boolean hasNext()
	{
		if (pos >= brands.length || brands[pos] == null)
			return false;
		else
			return true;
	}
}

