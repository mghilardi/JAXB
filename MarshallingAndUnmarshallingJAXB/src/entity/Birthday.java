package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "birthday")
public class Birthday {

	private String formatDate;
	private String value;

	public Birthday() {
		super();
	}

	public Birthday(String formatDate, String value) {
		super();
		this.formatDate = formatDate;
		this.value = value;
	}

	@XmlAttribute(name = "formatDate")
	public String getFormatDate() {
		return formatDate;
	}

	@XmlValue
	public String getValue() {
		return value;
	}

	public void setFormatDate(String formatDate) {
		this.formatDate = formatDate;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
