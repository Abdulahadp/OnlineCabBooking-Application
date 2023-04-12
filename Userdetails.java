import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.sql.*;

public class Userdetails {
    
  static String name;
  String mobileno;
  int select;
  Scanner scanner=new Scanner(System.in);
  Validation validation= new Validation();

  Connection connection;
  Statement statement;
  String sql;
  String url="jdbc:mysql://127.0.0.1:3306/abdulahad";  
  String user="root"; 
  String pass="Abdulmysql@123";

  String getUserName()
  {
    return name;
  }
 public void showLogin()  
{   
   System.out.println("*************************************************************************************************************************\t\t");
    //username
    do{
    System.out.println("Enter your name ");
    name=scanner.nextLine();
    }while(validation.validateName(name));
     
    //mobileno
    do{
    System.out.println("Enter your mobileno");
    mobileno=scanner.nextLine();
    }while(validation.validateMobile(mobileno));
    
    System.out.println("--------------------------------------welcome user--------------------------------------------------------------------\t\t");
   
    try{
      //Class.forName("com.mysql.cj.jdbc.Driver");
      connection=DriverManager.getConnection(url, user, pass);
      statement = connection.createStatement();
      sql="insert into OnlineCabBooking(  name,number) values('"+ name +"','"+ mobileno +"')";
      int result=statement.executeUpdate(sql);
      if(result==1)
      {
        System.out.println("Registered Successfully \n");
      }
      else
      {
        System.out.println("Registered unsuccessfull \n");
      }
    }catch(Exception exception){
      System.out.println(exception);
    }finally{
      // try{
      //   connection.close();
      // }catch(Exception exception){
      //   System.out.println(exception);
      // }
    }
}
   void userpage()
   {
       System.out.println("------------------------------------------------------------------------------------------------------------------");
       System.out.println("-----------------------------welcome to online cab booking--------------------------------------------------------");
       System.out.println("------------------------------------------------------------------------------------------------------------------");
       System.out.println("----------------------------------choose our service--------------------------------------------------------------\t\t\n");
       
       System.out.println("1: select a cab to start your booking");
        
       try{
         select=scanner.nextInt();
         switch(select){

            //cab selecting 
            case 1:
            System.out.println("--------------------------");
            System.out.println("******select a cab********");
            System.out.println("---------------------------\t\t");
            break;
            
 
            default:
            System.out.println("invalid choice plase enter the number 1 to start your selection");
            userpage();
            break;
        }  

       }
       catch(Exception exception)
       {
         System.out.println("enter 1 for selection");
         userpage();
       }
       finally{
         System.out.println("---------------------------");
       }
          
    }
      

}


