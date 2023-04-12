import java.util.*;

public class Validation {
    String regrex;
   
    Scanner scanner=new Scanner(System.in);
   
    // validation for the mobile number
    boolean validateMobile(String mobile)
    {
        regrex="^[6-9]{1}[0-9]{9}";
        if(mobile.matches(regrex))
            return false;
        else
        {
            System.out.println("Invalid Mobile number");
            return true;
        }
    }
    // validation for the name 
    boolean validateName(String name)
    {
        regrex="^[a-zA-Z]{6,20}$";
        if(name.matches(regrex))
            return false;
        else
        {
            System.out.println("Invalid Username (6 characters max)");
            return true;
        }
    }
    // validation for the pickuplocation
    boolean validatepickuplocation(String pickuplocation)
    {
        regrex="^[0-9]{3,5}[a-zA-Z]{10,50}$";
        if(pickuplocation.matches(regrex))
        return false;
        else{
            System.out.println("invalid pickuploation");
            System.out.println("your address should start with the numbers like (120 xxx Nagar)");
            return true;
        }
    }
    //validation for the destination location
    boolean validtiondestinationlocation(String destinationlocation)
    {
        regrex="^[0-9]{3,5}[a-zA-Z]{10,50}$";
        if(destinationlocation.matches(regrex))
        return false;
        else{
            System.out.println("invalid destinationloation");
            System.out.println("your address should start with the numbers like (120 xxx Nagar");
            return true;
        }
    } 
    //validation for the googlepayid
    boolean validationgooglepayid(String googlepayid)
    {
        regrex="^[0-9]{4}$";
        if(googlepayid.matches(regrex))
        return false;
        else{
            System.out.println("invalid id");
            return true;
        }
    }
    //validation for the phonepayid

    boolean validationphonepayid(String phonepayid)
    {
        regrex="^[0-9]{4}$";
        if(phonepayid.matches(regrex))
        return false;
        else{
            System.out.println("invalid id");
            return true;
        }
    }
    //validation for the paytmid
    boolean validationpaytmid(String paytmid)
    {
        regrex="^[0-9]{4}$";
        if(paytmid.matches(regrex))
        return false;
        else{
            System.out.println("invalid id");
            return true;
        }
    }
}
