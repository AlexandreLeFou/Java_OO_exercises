package udacity;
/**
 * This programs develops a basic Contact Manager application responsible for storing and managing all
 * our friends' contact information.
 *
 */
public class Main {

    public static void main(String[] args) {

    // Create the ContactsManager object
    ContactsManager myContactsManager = new ContactsManager();
    // Create new Contact objects
    Contact friend1 = new Contact();
    Contact friend2 = new Contact();
    Contact friend3 = new Contact();


     //set fields
    friend1.name = "Alex";
    friend1.phoneNumber="3666554412";
    friend2.name = "James";
    friend2.phoneNumber="6944556611";
    friend3.name = "Jorge";
    friend3.phoneNumber="00365477894";


     // add contacts to the ContactsManager
     myContactsManager.addContact(friend1);
     myContactsManager.addContact(friend2);
     myContactsManager.addContact(friend3);

     //search for a contact and display phone number
     Contact a = myContactsManager.searchContact("Alex");
     System.out.println("Alex's phone number is:"+a.phoneNumber);
    }
}
