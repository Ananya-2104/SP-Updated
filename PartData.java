public class PartData extends User {
	private String partNo;
	private String regNo;
	
	public PartData(String partNo, String regNo) {
		this.partNo = partNo;
		this.regNo = regNo;
	}
	
	PartData() {
		partNo = null;
		regNo = null;
	}

	public String getIndexNo() {
		return partNo;
	}
	
	public void setIndexNo(String num) {
		partNo = num;
	}
	
	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String num) {
		regNo = num;
	}
}
