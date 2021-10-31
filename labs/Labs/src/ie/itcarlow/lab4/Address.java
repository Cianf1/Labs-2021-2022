package ie.itcarlow.lab4;

public class Address {

	private String street;
	private String citytown;
	private String county;
	
	
	public Address(String street, String citytown, String county) {
		setStreet(street);
		setCitytown(citytown);
		setStreet(county);
	
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCitytown() {
		return citytown;
	}


	public void setCitytown(String citytown) {
		this.citytown = citytown;
	}


	public String getCounty() {
		return county;
	}


	public void setCounty(String county) {
		this.county = county;
	}
	
	public String toString() {
		return "Full Adress[Street : " + street + ", City/Town : " + citytown + ", County : " + county + " ] ";
	}
}
