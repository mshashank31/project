
/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message
{
   String name,email,phone;
   public Message(String theName,String theEmail,String thePhone){
       name=theName;
       email=theEmail;
       phone=thePhone;
    }
    void displayEmail(){
        System.out.println("Email:"+email);
    }
    void displayPhone(){
        System.out.println("Phone"+phone);
    }
    public static void main(String[]args){
        Message JACK = new Message("Jack","JACK@xxx.xxx","678-9999");
        System.out.println(JACK.name);
        JACK.displayEmail();
        Message ANDY = new Message("ANDY","ANDY@xxx.xxx","561-9999");
        System.out.println(ANDY.name);
        ANDY.displayPhone();
    }
}
