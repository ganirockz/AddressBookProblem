package com.capgemini;

import java.util.*;

public class AddressBookMain {
	public String FIRST_NAME, LAST_NAME, EMAIL;
	public String ADDRESS, CITY, STATE;
	public int ZIP;
	public String PHONE_NUMBER;

	public AddressBookMain(String FirstName, String LastName, String Email, String Address, String city, String state,
			int zip, String phoneNo) {
		FIRST_NAME = FirstName;
		LAST_NAME = LastName;
		EMAIL = Email;
		ADDRESS = Address;
		CITY = city;
		STATE = state;
		ZIP = zip;
		PHONE_NUMBER = phoneNo;
	}

	public String toString() {
		return FIRST_NAME + " " + LAST_NAME + " " + EMAIL + " " + ADDRESS + " " + CITY + " " + STATE + " " + ZIP + " "
				+ PHONE_NUMBER;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of address books you want to add: ");
		HashMap<String, ArrayList<AddressBookMain>> bookSystem = new HashMap<String, ArrayList<AddressBookMain>>();
		int numberOfAddressBooks = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < numberOfAddressBooks; j++) {
			String bookName;
			while (true) {
				System.out.println("Enter the name of the address book:");
				bookName = sc.nextLine();
				int flag = 0;
				for (Map.Entry<String, ArrayList<AddressBookMain>> entry : bookSystem.entrySet()) {
					if (entry.getKey().equals(bookName)) {
						flag++;
					}
				}
				if (flag == 0) {
					break;
				} else {
					System.out.println("already registerd with the name, try adding new book name");
				}
			}
			ArrayList<AddressBookMain> book = new ArrayList<AddressBookMain>();
			System.out.println("Enter the Number of persons you want to add in Address book: ");
			int number = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < number; i++) {
				while (true) {
					int flag = 0;
					System.out.println("Enter the contact details of person " + (i + 1) + ": ");
					System.out.println("Enter the first name:");
					String firstName = sc.nextLine();
					for(AddressBookMain c:book) {
						if(c.FIRST_NAME.equals(firstName)) {
							flag = 1;
							break;
						}
					}
					System.out.println("Enter the last name:");
					String lastName = sc.nextLine();
					System.out.println("Enter the EMail:");
					String Email = sc.nextLine();
					System.out.println("Enter the Address:");
					String Address = sc.nextLine();
					System.out.println("Enter the City:");
					String city = sc.nextLine();
					System.out.println("Enter the State:");
					String state = sc.nextLine();
					System.out.println("Enter the zip:");
					int zip = Integer.parseInt(sc.nextLine());
					System.out.println("Enter the phone number:");
					String phoneNumber = sc.nextLine();
					AddressBookMain contact = new AddressBookMain(firstName, lastName, Email, Address, city, state, zip,
							phoneNumber);
					if(flag == 0) {
					book.add(contact);
					break;}
					else {
						System.out.println("person with same name already exists. try another name");
					}
				}
			}
			bookSystem.put(bookName, book);
		}
		sc.close();
		for (Map.Entry<String, ArrayList<AddressBookMain>> entry : bookSystem.entrySet()) {
			System.out.println("The details of Address Book " + entry.getKey() + " is: ");
			System.out.println(entry.getValue());
		}
	}
}