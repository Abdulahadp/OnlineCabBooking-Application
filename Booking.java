import java.util.Scanner;
import java.sql.*;
public class Booking {
     
        
    String pickuplocation;
    String destinationlocation; 
    Validation valid=new Validation();
    Userdetails userdetails=new Userdetails();
    String name;
    Connection connection;
    Statement statement;
    String sql;
  String url="jdbc:mysql://127.0.0.1:3306/abdulahad";  
  String user="root"; 
  String pass="Abdulmysql@123";
  int result;

        Scanner scanner= new Scanner(System.in);
    public void book()
    {
        //pickuplocation
        System.out.println("**********************************************");
        System.out.println("ENTER YOUR PICKUP LOCATION");
        System.out.println("**********************************************\n");
        do{
            pickuplocation=scanner.nextLine();
        }while(valid.validatepickuplocation(pickuplocation));
        name=userdetails.getUserName();
        
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            Userdetails user = new Userdetails();
            name = user.getUserName();
            sql = "update OnlineCabBooking set pickuplocation='"+ pickuplocation +"' where name='" + name + "' ";
            result = statement.executeUpdate(sql);
        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            try {
                connection.close();
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }

        System.out.println("your selected pickup location is :"+pickuplocation);
   
        //destination location
        System.out.println("**********************************************");
        System.out.println("ENTER YOUR DESTINATION LOCATION");
        System.out.println("**********************************************\t\t\n");
        do{
            destinationlocation=scanner.nextLine();
        }while(valid.validatepickuplocation(destinationlocation));
        name=userdetails.getUserName();
        
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            Userdetails user = new Userdetails();
            name = user.getUserName();
            sql = "update OnlineCabBooking set destinationlocation='"+  destinationlocation +"' where name='" + name + "' ";
            result = statement.executeUpdate(sql);
        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            try {
                connection.close();
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }
        

        
        System.out.println("your selected destination location :"+destinationlocation);

        System.out.println("**********************************************");
        System.out.println(" to confirm your  booking select the payment type");
        System.out.println("**********************************************\t\t\n");

      
        
        
    

    }




}
    

    

