import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
firstName
lastName
Number
Address
 */
public class ContactService {

   /*
   * uniqueId is static int variable initialized to 0000. This can be changed later by the user
   * */
   private static int uniqueId=0000;
   private static Map<Integer, Contact> contacts = new HashMap<>();

   /*
   * addContact() method will insert new contact
   * */
   public Map<Integer, Contact> addContact(Contact contact) {
       uniqueId++;
       contacts.put(uniqueId, contact);
       return contacts;
   }
  

   public Map<Integer, Contact> deleteContact(String contactID) {

       Iterator itr = contacts.entrySet().iterator();

       while (itr.hasNext()) {
           Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) itr.next();
           if (entry.getValue().getContactID() == contactID) {
               itr.remove();
           }
       }

       return contacts;

   }
  
   /*
   * updateContact() method for required inputs
   * and update the Contact Object
   * */

   public Map<Integer, Contact> updateContact(String contactID, String firstName, String lastName, String number,
           String address) {

       Iterator itr = contacts.entrySet().iterator();

       while (itr.hasNext()) {
           Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) itr.next();

           if (entry.getValue().getContactID() == contactID) {
               entry.getValue().setFirstName(firstName);
               entry.getValue().setLastName(lastName);
               entry.getValue().setPhone(number);
               entry.getValue().setAddress(address);
           }

       }

       return contacts;

   }
}