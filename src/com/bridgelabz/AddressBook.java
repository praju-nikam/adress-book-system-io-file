package com.bridgelabz;

import java.util.Scanner;

public class AddressBook
{
    public void add(){

        Scanner scanner = new Scanner(System.in);
        ContactDetail person = new ContactDetail();

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

        System.out.println(person);
    }
}
