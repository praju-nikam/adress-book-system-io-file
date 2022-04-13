package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("*-*-*-*-*-*-*-*-*-*- Welcome To Address Book System -*-*-*-*-*-*-*-*-*");
        ContactDetail person = new ContactDetail();

        person.setFirstName("Prajakta");
        person.setLastName("Nikam");
        person.setAddress("Charoli");
        person.setCity("Pune");
        person.setState("Maharashtra");
        person.setZip(412105);
        person.setPhoneNumber("9960224670");
        person.setEmail("sawantprajakta84@gmail.com");
        System.out.println(person);
    }
}
