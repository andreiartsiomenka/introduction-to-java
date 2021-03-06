package by.basic.programming_with_classes.task8;

import java.math.BigInteger;

public class Customer {
	private static int startID = 1;
	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String address;
	private BigInteger cardNumber;
	private long bankAccountNumber;

	public Customer(String lastName, String firstName, String patronymic, String address, BigInteger cardNumber,
			long bankAccountNumber) {
		this.id = startID++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.address = address;
		this.cardNumber = cardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return String.format(
				"id: %d, Last name: %s, First name: %s, Patronymic: %s, Address: %s, "
						+ "Credit card number: %s, Bank account number: %d",
				id, lastName, firstName, patronymic, address, cardNumber.toString(), bankAccountNumber);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	BigInteger getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(BigInteger cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

}
