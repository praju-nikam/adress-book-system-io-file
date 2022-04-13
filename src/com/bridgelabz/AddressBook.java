package com.bridgelabz;

public class AddressBook
{
    private class Contact {
        String firstName, lastName, address, city, state, emailId;
        int zipCode;
        long mobileNumber;
    }

    /**
     * created method printContact for creating contacts in AddressBook
     */
    public void printContact() {
        Contact contact = new Contact();
        contact.firstName = "Prajakta";
        contact.lastName = "Nikam";
        contact.address = "Charoli";
        contact.city = "Pune";
        contact.state = "Maharashtra";
        contact.zipCode = 412105;
        contact.mobileNumber = 996022467;
        contact.emailId = "sawantprajakta84@gmail.com";
        System.out.println("Contact Details : ");
        System.out.println("Name          : " + contact.firstName + " " + contact.lastName + "\n" + "Address       : "
                + contact.address + "\n" + "City          : " + contact.city + "\n" + "State         : " + contact.state
                + "\n" + "ZipCode       : " + contact.zipCode + "\n" + "MobileNumber  : " + contact.mobileNumber + "\n"
                + "EmailId       : " + contact.emailId + "\n");
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
    }
}
