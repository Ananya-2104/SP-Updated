public class Phone implements Cloneable{
	protected String phoneCode;
	protected String year;
	protected String model;
	
	PartCollection parts;
	BrandCollection brands;

	// Prototype Pattern
	private List<String> phoneList;

	// We maintain the current position of the iterator over the array
	int pos = 0;

	public Phone() {
		carList = new ArrayList<String>();
	}
	
	public Phone(List<String> list) {
		this.phoneList=list;
	}

	Phone(PartCollection parts, BrandCollection brands) {
		this.parts = parts;
		this.brands = brands;
	}

	public void loadData(){
		// add all phones into a list
		//phoneList.add("IPhone 8");
		//phoneList.add("Realme XT");
	}
	
	public List<String> getPhoneList() {
		return phoneList;
	}

	public String getPhoneCode() {
		return phonecode;
	}

	public void setPhoneCode(String code) {
		phonecode = code;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// Decorator Pattern
	public int getCost() {
    return 0;
  }
	
	// Observer Pattern
	// This method is used update displays when there is a change in the data
	public void dataChanged() {
		phonecode = getPhoneCode();
		year = getYear();
		model = getModel();
		// Iterator Pattern
		Iterator iterator1 = parts.createIterator();
		while (iterator1.hasNext()) {
			Part n1 = (Part)iterator1.next();
			// Observer Pattern
			n1.update(phonecode,year,model);
		}
		// Iterator Pattern
		Iterator iterator2 = brands.createIterator();
		while (iterator2.hasNext()) {
			Brand n2 = (Brand)iterator2.next();
			// Observer Pattern
			n2.update(phonecode,year,model);
		}
	}

	// Prototype Pattern
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for(String s : this.getPhoneList()) {
			temp.add(s);
		}
		return new Phone(temp);
	}
}

// Decorator Pattern
class Phone1 extends Phone {
	public Phone1() { 
    phonecode = "1"; 
  }
	
	@Override
	public int getCost() { 
    return 15000; 
  }
}

class Phone2 extends Phone {
	public Phone2() {
    phonecode = "2"; 
  }
	
	@Override
	public int getCost() {
    return 40000; 
  }
}

class Phone3 extends Phone
{
	public Phone3() {
    phonecode = "3"; 
  }
	
	@Override
	public int getCost() {
    return 80000; 
  }
}
