package medicalapp;

public class Patient {

	private String id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String homePhone;
	private String cellPhone;
	private String dob;

	public Patient(String firstName, String lastName, String address, String city, String state, String zipCode, String homePhone, String cellPhone, String dob) {

		this.id = Utility.generateID();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.dob = dob;
	}

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public String getCity() {

		return city;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public String getState() {

		return state;
	}

	public void setState(String state) {

		this.state = state;
	}

	public String getZipCode() {

		return zipCode;
	}

	public void setZipCode(String zipCode) {

		this.zipCode = zipCode;
	}

	public String getHomePhone() {

		return homePhone;
	}

	public void setHomePhone(String homePhone) {

		this.homePhone = homePhone;
	}

	public String getCellPhone() {

		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {

		this.cellPhone = cellPhone;
	}

	public String getDob() {

		return dob;
	}

	public void setDob(String dob) {

		this.dob = dob;
	}

	public String getId() {

		return id;
	}

}
