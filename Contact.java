/*
 * The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
 */
public class Contact {

	  private String contactID;
	  private String firstName;
	  private String lastName;
	  private String phone;
	  private String address;
	  
	  public Contact(String contactID,String firstName,String lastName,String phone,String address){
	       if(isValidInput(contactID)){
	           this.contactID=contactID;
	       }else{
	           System.out.println("Error");
	       }
	       if(isValidInput(firstName)){
	           this.firstName=firstName;
	       }else{
	           System.out.println("Error");
	       }
	       if(isValidInput(lastName)){
	           this.lastName=lastName;
	       }else{
	           System.out.println("Error");
	       }
	      
	       if(phone!=null&&phone.length()==10){
	           this.phone=phone;
	       }else{
	           System.out.println("Error");
	       }
	       if(address!=null&&address.length()<=30){
	           this.address=address;
	       }else{
	           System.out.println("Error");
	       }
	  }
	       
	       private boolean isValidInput(String input) {
	    	      
	           return input!=null&&input.length()<=10;
	          
	       }
	       public String getFirstName() {
	           return firstName;
	       }
	       public void setFirstName(String firstName) {
	           this.firstName = firstName;
	       }
	       public String getLastName() {
	           return firstName;
	       }
	       public void setLastName(String lastName) {
	           this.lastName = firstName;
	       }
	       public String getPhone() {
	           return phone;
	       }
	       public void setPhone(String phone) {
	           this.phone = phone;
	       }
	       public String getAddress() {
	           return address;
	       }
	       public void setAddress(String address) {
	           this.address = address;
	       }
	       public String getContactID() {
	           return contactID;
	       }
	       @Override
	       public String toString(){
	           return "["+contactID+","+firstName+","+lastName+","+phone+","+address+"]";
	       }


	      
}
