package com.infogalaxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMaster {

    static Scanner scanner = new Scanner(System.in);
    Map<String,AddressBook> addressBookMap = new HashMap<>();

    public void addAddressBook(){                                                       //--------->> Add AddressBook Function
        System.out.println("Enter the AddressBookName :");
        String addressbookname;
        addressbookname = scanner.next();
        AddressBook addressBook = new AddressBook();
        addressBookMap.put(addressbookname,addressBook);
    }

    public void displayAddressBook(){
        System.out.println(addressBookMap.keySet());                                    //--------->> Display AddressBook Function
    }

    public void selectAddressBook(){
        displayAddressBook();
        System.out.println("ENTER THE ADDRESS BOOK NAME");
        String addressbookname;
        addressbookname = scanner.next();
        AddressBook addressBook = addressBookMap.get(addressbookname);
        addressBook.addressBookMenu(addressBook);
        addressBookMap.put(addressbookname,addressBook);
    }
    public static void main(String args[]) {

        AddressBookMaster addressBookMaster = new AddressBookMaster();
        System.out.println("**** ADDRESS BOOK Manager****");
        System.out.println("1: ADD ADDRESSBOOK /2: SHOWADDRESSBOOK /3: SELECTADDRESSBOOK /4: DELETEADDRESSBOOK /5:EXITADDRESSBOOK");

        int choice;
        do {
            System.out.println("ENTER THE OPERATION NUMBER :");
            choice = scanner.nextInt();
            if (choice > 5) {
                System.out.println("Invalid Operation Number!!!");
                break;
            }
            switch (choice) {
                case 1:
                        addressBookMaster.addAddressBook();
                    break;
                case 2:
                        addressBookMaster.displayAddressBook();
                    break;
                case 3:
                        addressBookMaster.selectAddressBook();
                    break;
                case 4:
                        //System.out.println("DLELETE ADDRESSBOOK ");
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
            }
        } while (choice < 4);
    }
}
