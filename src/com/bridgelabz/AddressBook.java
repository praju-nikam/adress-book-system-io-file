package com.bridgelabz;

import java.util.Scanner;

public class AddressBook extends Contact
{
    ContactDetail person;
    Scanner scanner = new Scanner(System.in);

    public void addDetails(){
        person = new ContactDetail();

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Enter your city: ");
        String city = scanner.nextLine();
        System.out.println("Enter your state: ");
        String state = scanner.nextLine();
        System.out.println("Enter zip code of your area: ");
        int zipCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNum = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter your EMail ID: ");
        String email = scanner.nextLine();

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setZip(zipCode);
        person.setPhoneNumber(phoneNum);
        person.setEmail(email);

    }

    public void editContact() {
        System.out.println("Enter the firstName of person");
        String editName = scanner.nextLine();
        if (editName.equalsIgnoreCase(person.getFirstName())) {
            addDetails();
        } else {
            System.out.println("The name does not match the AddressBook");
            System.out.println("Please enter valid First Name");
            editContact();
        }
    }
    //method To Delete The contact
    public void delete() {
        System.out.println("Enter firstName of the person");
        String editName = scanner.nextLine();
        if (editName.equals(person.getFirstName())) {
            System.out.println("Deleted " + person.getFirstName() + " details");
            person = null;
        }
    }

}
