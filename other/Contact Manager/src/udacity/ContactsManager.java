package udacity;

/**
 * This class is made for adding and searching for contacts.
 */
public class ContactsManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;

    //Constructor
    ContactsManager() {
        this.myFriends = new Contact[400];
        this.friendsCount = 0;
    }

    //Methods
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}

