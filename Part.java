
public class Part extends User {
	private PartData partData;
	
	public Part() {
		this.partData = new PartData();
	}

	public Part(String partNo, String regNo) {
		this.partData = new PartData(partNo,regNo);
	}

	public void followPhones() {
	}
	
	// Observer Pattern
	// Data of this class is updated by Phone
	public void update(String phonecode, String year, String model) {
		display(phonecode, year, model);
	}

	public void display(String phonecode, String year, String model) {
		System.out.println("\nPhone Code: " + phonecode + "\nYear: " + year + "\nModel: " + model);
	}
}
