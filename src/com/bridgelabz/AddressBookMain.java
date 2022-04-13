package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("*-*-*-*-*-*-*-*-*-*- Welcome To Address Book System -*-*-*-*-*-*-*-*-*");
        ContactDetail contatDetail = new ContactDetail();

        contatDetail.setFirstName("Prajakta");
        contatDetail.setLastName("Nikam");
        contatDetail.setAddress("Charoli");
        contatDetail.setCity("Pune");
        contatDetail.setState("Maharashtra");
        contatDetail.setZip(412105);
        contatDetail.setPhoneNumber("9960224670");
        contatDetail.setEmail("sawantprajakta84@gmail.com");
        System.out.println(contatDetail);

        AddressBook person = new AddressBook();
        person.add();
        AddressBook addressBook = new AddressBook();
        addressBook.getMenu();
    }
}
