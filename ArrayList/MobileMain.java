package ArrayList;

public class MobileMain {
    public static void main(String[] args) {
        Contact jeevan = Contact.createContact("jeevan", "12345");
        Contact sandesh = Contact.createContact("sandesh", "87654");
        MobilePhone mp = new MobilePhone();
//        mp.addNewContact(jeevan);
//        mp.printContacts();
//        mp.addNewContact(sandesh);
//        mp.printContacts();
//        mp.removeContact(jeevan);
//        mp.printContacts();
//        mp.updateContact(sandesh, jeevan);
//        mp.printContacts();
        mp.queryContact("jeevan");




    }



}
