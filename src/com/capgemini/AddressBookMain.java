package com.capgemini;

import java.util.*;

public class AddressBookMain {
	public String FIRST_NAME, LAST_NAME, EMAIL;
	public String ADDRESS, CITY, STATE;
	public int ZIP;
	public String PHONE_NUMBER;

	public AddressBookMain() {

	}

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
		return FIRST_NAME+" "+LAST_NAME+" "+EMAIL+" "+ADDRESS+" "+CITY+" "+STATE+" "+ZIP+" "+PHONE_NUMBER;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		AddressBookMain contact1 = new AddressBookMain("Ganesh", "Rapeti", "ganeshrapeti8@gmail.com",
				"vizag,Andhra Pradesh", "Anakapalle", "Andhra Pradesh", 531001, "9886784617");
		AddressBookMain contact2 = new AddressBookMain();
		System.out.println("Enter the contact details of 2nd person");
		System.out.println("Enter the first name:");
		contact2.FIRST_NAME = sc.nextLine();
		System.out.println("Enter the last name:");
		contact2.LAST_NAME = sc.nextLine();
		System.out.println("Enter the Email:");
		contact2.EMAIL = sc.nextLine();
		System.out.println("Enter the address:");
		contact2.ADDRESS = sc.nextLine();
		System.out.println("Enter the city:");
		contact2.CITY = sc.nextLine();
		System.out.println("Enter the state:");
		contact2.STATE = sc.nextLine();
		System.out.println("Enter the zip:");
		contact2.ZIP = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Phone Number:");
		contact2.PHONE_NUMBER = sc.nextLine();
		sc.close();
		System.out.println("The contact details of 1st person is: "+contact1);
		System.out.println("The contact details of 2nd person is: "+contact2);
	}
}
