/* Application Title: Online cab booking application
   
    Author: Abdulahad p
    Created on:17/12/2022
    Last modified date:19/12/2022
    Reviewed by:silpa madusoodhnan,Naveen subramaniyam
    Reviewed at:19/12/2022,28/12/2022
    Suggestion:change the object refrence variable to the single letter to scanner 
*/
public class OnlineCabBooking {
    public static void main(String[] args) {
       
        //objects of an class
        Userdetails userdetails = new Userdetails();
        Cabselection cabselection=new Cabselection();
        Booking booking=new Booking();
        Paymentdetails paymentdetails =new Paymentdetails();
          
        //methods to call 
        userdetails.showLogin();  
        userdetails.userpage();
        cabselection.selection();
        booking.book();
        paymentdetails.paymentselection();
       
       

    }
    
}
