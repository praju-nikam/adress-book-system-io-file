package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{

    static ContactDetail contact = new ContactDetail();
    /**
     * Creating a List of ContactDetails of type String using ArrayList here Adding
     * new elements in the List
     */
    static List<ContactDetail> contactDetailsList =  new ArrayList<ContactDetail>();

    /**
     * created method addNewContact() to create a new contacts to the AddressBook
     */
    public static void addNewContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Your Address : ");
        String address = scanner.next();
        System.out.println("Enter Your City : ");
        String city = scanner.next();
        System.out.println("Enter Your State");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter MobileNumber : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter your EmailId  : ");
        String emailId = scanner.next();
        scanner.close();

        contact = new ContactDetail(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        contactDetailsList.add(contact);
        printContact();

    }


    /**
     * created method printContact() to display the data
     */
    public static void printContact() {
        for (int i = 0; i < contactDetailsList.size(); i++) {
            contact = contactDetailsList.get(i);
            System.out.println("Contact Details");
            System.out.println("Name          : " + contact.getFirstName() + " " + contact.getLastName() + "\n"
                    + "Address       : " + contact.getAddress() + "\n" + "City          : " + contact.getCity() + "\n"
                    + "State         : " + contact.getState() + "\n" + "ZipCode       : " + contact.getZipCode() + "\n"
                    + "MobileNumber  : " + contact.getMobileNumber() + "\n" + "EmailId       : " + contact.getEmailId()
                    + "\n");
        }
    }


    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-* Welcome Address Book System *-*-*-*-*-*-*-*-*-*-*-*-*-*");

        /**
         * created object of AddressBook class
         */
        AddressBook addressBook = new AddressBook();
        /**
         * Calling method printContact for displaying contacts
         */
        addressBook.printContact();

        /**
         * calling method addNewContact()
         */
        addNewContact();
    }

}
