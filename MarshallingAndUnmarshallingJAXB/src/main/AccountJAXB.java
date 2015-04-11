package main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entity.Account;
import entity.Address;
import entity.Birthday;

public class AccountJAXB {

	public static void Marshalling() {
		try {
			final Account account = new Account("acc1", new Address("123", "Street1", "W1"), new Birthday("yyyy-MM-dd", "1980-10-20"));
			final JAXBContext jc = JAXBContext.newInstance(Account.class);
			final Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(account, System.out);
			ms.marshal(account, new File("src\\data\\account.xml"));
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void UnMarshalling() {
		try {
			final JAXBContext jc = JAXBContext.newInstance(Account.class);
			final Unmarshaller ums = jc.createUnmarshaller();
			final Account account = (Account) ums.unmarshal(new File("src\\data\\account.xml"));
			System.out.println("Account information");
			System.out.println("Username: " + account.getUsername());
			System.out.println("Address: " + account.getAddress().getNumber() + ", " + account.getAddress().getStreet() + ", "
					+ account.getAddress().getWard() + ", ");
			System.out.println("Birthday: " + account.getBirthday().getValue());
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
