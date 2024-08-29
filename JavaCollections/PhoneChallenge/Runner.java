package JavaCollections.PhoneChallenge;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("phone", phones);
        printData("email", emails);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);

        printData("emailContacts", emailContacts);
        printData("phoneContacts", phoneContacts);




//        Contact contact = new Contact("jeevan", "jeevan@gmail.com", 123456789);

    }

    public static  void printData(String header, Collection<Contact> contacts) {
        System.out.println("-".repeat(50));
        System.out.println(header);
        System.out.println("-".repeat(50));
        contacts.forEach(System.out::println);
    }
}
