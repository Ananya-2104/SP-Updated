
abstract class SecondaryPhone extends Phone {
	@Override
	public String getCarCode() {
		return phonecode;
	}

	@Override
	public void setPhoneCode(String code) {
		phonecode = code;
	}

	@Override
	public String getYear() {
		return year;
	}

	@Override
	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public void setModel(String model) {
		this.model = sem;
	}
}

class PhoneA extends SecondaryPhone {
	// we need a reference to obj we are decorating
	Phone phone;
	public PhoneA(Phone phone) { 
    this.phone = phone; 
  }
	
	@Override
	public String getPhoneCode() {
		return phone.getPhoneCode() + "PhoneA ";
	}
	
	@Override
	public int getCost() { 
    return 5000 + phone.getCost(); 
  }
}

class PhoneB extends SecondaryPhone {
	// we need a reference to obj we are decorating
	Phone phone;
	public PhoneB(Phone phone) { 
    this.phone = phone; 
  }
	
	@Override
	public String getPhoneCode() {
		return phone.getPhoneCode() + "PhoneB ";
	}
	
	@Override
	public int getCost() { 
    return 10000 + phone.getCost(); 
  }
}
	
class PhoneC extends SecondaryPhone {
	// we need a reference to obj we are decorating
	Phone phone;
	public PhoneC(Phone phone) { 
    this.phone = phone; 
  }
	
	@Override
	public String getPhoneCode() {
		return phone.getPhoneCode() + "PhoneC ";
	}
	
	@Override
	public int getCost() { 
    return 1000 + phone.getCost(); 
  }
}

