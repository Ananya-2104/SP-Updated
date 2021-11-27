
public class Brand {
	private String depName;
	
	public String getDep(){
		return depName;
	}
	
	public void setDep(String name){
		depName = name;
	}

	// Observer Pattern
	// Data of this class is updated by Phone
	public void update(String phonecode, String year, String model)
	{
		display(phonecode, year, model);
	}

	public void display(String phonecode, String year, String model)
	{
		System.out.println("\nCar Code: " + phonecode + "\nYear: " + year + "\nModel: " + model);
	}
}
