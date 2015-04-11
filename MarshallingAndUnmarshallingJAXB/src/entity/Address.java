package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "address")
public class Address {

	private String number;
	private String street;
	private String ward;

	public Address() {
		super();
	}

	public Address(String number, String street, String ward) {
		super();
		this.number = number;
		this.street = street;
		this.ward = ward;
	}

	@XmlElement(name = "number")
	public String getNumber() {
		return number;
	}

	@XmlElement(name = "street")
	public String getStreet() {
		return street;
	}

	@XmlElement(name = "ward")
	public String getWard() {
		return ward;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

}
