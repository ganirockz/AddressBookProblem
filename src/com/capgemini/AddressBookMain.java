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
		ArrayList<AddressBookMain> contact = new ArrayList<AddressBookMain>();
		AddressBookMain contact1 = new AddressBookMain("Ganesh", "Rapeti", "ganeshrapeti@gmail.com",
				"vizag,Andhra Pradesh", "Anakapalle", "Andhra Pradesh", 531001, "9886784617");
		AddressBookMain contact2 = new AddressBookMain("Sai", "Rapeti", "sairapeti8@gmail.com", "vizag,Andhra Pradesh",
				"Anakapalle", "Andhra Pradesh", 531001, "9886784617");
		contact.add(contact1);
		contact.add(contact2);
		System.out.println("The contact details of 1st person is: " + contact1);
		System.out.println("The contact details of 2nd person is: " + contact2);
		System.out.println("Enter the first name of the candidate to edit the details: ");
		String name = sc.nextLine();
		int flag = 0;
		for (AddressBookMain book : contact) {
			if (book.FIRST_NAME.equals(name)) {
				flag++;
				System.out.println("Select the field you want to change");
				System.out.println(
						"1.First Name\n2.Last Name\n3.EMail\n4.Address\n5.City\n6.State\n7.zip\n8.Phone Number");
				int option = Integer.parseInt(sc.nextLine());
				switch (option) {
				case 1: {
					System.out.println("Enter the new first name:");
					String firstName = sc.nextLine();
					book.FIRST_NAME = firstName;
					break;
				}
				case 2: {
					System.out.println("Enter the new last name:");
					String lastName = sc.nextLine();
					book.LAST_NAME = lastName;
					break;
				}
				case 3: {
					System.out.println("Enter the new EMail:");
					String Email = sc.nextLine();
					book.EMAIL = Email;
					break;
				}
				case 4: {
					System.out.println("Enter the new Address:");
					String Address = sc.nextLine();
					book.ADDRESS = Address;
					break;
				}
				case 5: {
					System.out.println("Enter the new City:");
					String city = sc.nextLine();
					book.CITY = city;
					break;
				}
				case 6: {
					System.out.println("Enter the new State:");
					String state = sc.nextLine();
					book.STATE = state;
					break;
				}
				case 7: {
					System.out.println("Enter the new zip:");
					int zip = Integer.parseInt(sc.nextLine());
					book.ZIP = zip;
					break;
				}
				case 8: {
					System.out.println("Enter the new phone number:");
					String phoneNumber = sc.nextLine();
					book.PHONE_NUMBER = phoneNumber;
					break;
				}
				}
			}
		}
		sc.close();
		if (flag == 0) {
			System.out.println("Cannot found the user");
		} else {
			System.out.println("The contact details of 1st person is: " + contact1);
			System.out.println("The contact details of 2nd person is: " + contact2);
		}
	}
}
