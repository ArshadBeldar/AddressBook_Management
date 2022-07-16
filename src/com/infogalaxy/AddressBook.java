package com.infogalaxy;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);

    ArrayList<Contact> addressBookList = new ArrayList<>();
    Contact contact = new Contact();

    public void inputContactData() {
        Contact contact = new Contact();

        System.out.println("Enter The First Name :");
        contact.setFirstname(scanner.next());

        System.out.println("Enter the Last Name :");
        contact.setLastname(scanner.next());

        System.out.println("Enter the Address :");
        contact.setAddress(scanner.next());

        System.out.println("Enter The City :");
        contact.setCity(scanner.next());

        System.out.println("Enter the State :");
        contact.setState(scanner.next());

        System.out.println("Enter the PhoneNumber :");
        contact.setPhonenumber(scanner.next());

        System.out.println("Enter the Email :");
        contact.setEmail(scanner.next());

        addressBookList.add(contact);
    }

    public void displayContactData() {
        try {

            for (int i = 0; i < addressBookList.size(); i++) {
                Contact contact = addressBookList.get(i);
                    System.out.println(contact.toString());
            }
        } catch (NullPointerException na) {
            System.out.println("Contact Not Exist !!!");
        }
    }

    public void editContact() {
        boolean yes=false;
        System.out.println("------Please Enter the FirstName for Edit Contact------");
        String name;

        name = scanner.next();
        for (int i = 0; i < addressBookList.size(); i++) {
            Contact contact = addressBookList.get(i);
            if (name.equalsIgnoreCase(contact.getFirstname())) {
                inputContactData();
                yes = true;
                break;
            }
            if (yes==false){
                System.out.println("Contact Not Found!!!!!");
                break;
            }

        }

    }
    public void deleteContact() {
        System.out.println("------Enter the First Name for Delete Contact------");
        String name = scanner.next();
        if (contact.getFirstname().equalsIgnoreCase(name)) {
            System.out.println("Contact Found....");
            contact = null;
            System.out.println("Contact Deleted...");
        } else {
            System.out.println("Contact Not Found!!!");
        }
    }

    public void addressBookMenu (AddressBook addressBook) {
        int choice;
        do {
            System.out.println("******ADDRESS-BOOK MANAGEMENT******");
            System.out.println(" 1:Add Contact /2: Show Contact /3: Edit Contact /4: Delete Contact /5: Exit Contact");
            System.out.println("Enter the Operation Number :");
            choice = scanner.nextInt();
            if (choice > 6) {
                System.out.println("Invalid Operation Number!!!");
                break;
            }
            switch (choice) {
                case 1:
                    addressBook.inputContactData();
                    break;
                case 2:
                    addressBook.displayContactData();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
            }
        } while (choice < 5);
    }
}
