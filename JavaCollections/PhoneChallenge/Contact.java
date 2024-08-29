package JavaCollections.PhoneChallenge;

import java.util.HashSet;
import java.util.Set;

public class Contact {

    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phoneNumbers = new HashSet<>();

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, long phoneNumber) {
        this(name, null, phoneNumber);
    }

    public Contact(String name, String email, long phoneNumber) {
        this.name = name;
        if (email != null) {
            this.emails.add(email);
        }
        if (phoneNumber > 0) {
            String phoneNumberToString = String.valueOf(phoneNumber);
            phoneNumberToString = "(%s) %s-%s".formatted(phoneNumberToString.substring(0, 3), phoneNumberToString.substring(3, 6), phoneNumberToString.substring(6));


            this.phoneNumbers.add(phoneNumberToString);
        }

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phoneNumbers);
    }

    public Contact mergeContactData(Contact contact) {

        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phoneNumbers = new HashSet<>(this.phoneNumbers);
        newContact.emails.addAll(contact.emails);
        newContact.phoneNumbers.addAll(contact.phoneNumbers);
        return newContact;
    }
}
