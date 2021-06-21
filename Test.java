
public class Test {

   public static void main(String[] args){
      
       /*
       * */
       Contact contacttest1 =new Contact("10101","AAAbb","zz1zz","1234567891","Hello");
       Contact contacttest2 = new Contact("000002222", "ZZEEEEZZ", "BEEEEP","0123456789101112", "GoodGood");
      
       ContactService contactService = new ContactService();
      
//       System.out.println(contactService.addContact(contacttest1));
//       System.out.println(contactService.updateContact("10000","Test","Test1","1234567891","Hyd"));
//       System.out.println(contactService.deleteContact("00002"));
       System.out.println(contactService.addContact(contacttest2));
      
      

   }

}