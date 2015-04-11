package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "account")
public class Account {

	private String username;
	private Address address;
	private Birthday Birthday;

	public Account() {
		super();
	}

	public Account(String username, Address address, entity.Birthday birthday) {
		super();
		this.username = username;
		this.address = address;
		Birthday = birthday;
	}

	@XmlElement(name = "address")
	public Address getAddress() {
		return address;
	}

	@XmlElement(name = "birthday")
	public Birthday getBirthday() {
		return Birthday;
	}

	@XmlElement(name = "username")
	public String getUsername() {
		return username;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setBirthday(Birthday birthday) {
		Birthday = birthday;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
