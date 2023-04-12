import java.util.Scanner;

import javax.swing.JList.DropLocation;

import java.sql.*;
public class Paymentdetails {
    int confirm; 
    int select;
    String id;
    String upi;
    Validation validation=new Validation();
    Userdetails userdetails=new Userdetails();
    String name;
    Connection connection;
    Statement statement;
    String sql;
  String url="jdbc:mysql://127.0.0.1:3306/abdulahad";  
  String user="root"; 
  String pass="Abdulmysql@123";
  int result;

    Scanner scanner=new Scanner(System.in);
     //options for the payment

     public void paymentselection(){
     System.out.println("---------Select your payment type-----\t\t\n");

        System.out.println("1:CASH ON DELIEVERY");
        System.out.println("2:UPI PAYMENT");
        

        System.out.println("press the number to select the payment\t\t\n");

        select=scanner.nextInt();

        //options available for the payment 
        switch(select){

            case 1:
                System.out.println("cash on deleivery");
                break;
            case 2:
                System.out.println("UPI payment");

                System.out.println("select your upi on clicking the number\t\t\n");

                System.out.println("1: google pay");
                System.out.println("2: phone pay");
                System.out.println("3: paytm ");
                int choosing=scanner.nextInt();

                Scanner scanner=new Scanner(System.in);
                if(choosing==1)
                {do{
                    System.out.println("enter your google pay id");
                    id=scanner.nextLine();
                }while(validation.validationgooglepayid(id));

                    
                }
                else if(choosing==2)
                {do{
                    System.out.println("enter your phone pay id\t\t");
                    id=scanner.nextLine();
                }while(validation.validationphonepayid(id));
                }
                
                else if(choosing==3)
                {do{
                    System.out.println("enter your paytm id\t\t\n");
                    id=scanner.nextLine();
                }while(validation.validationpaytmid(id));
            }
                break;

                default:
                    System.out.println("please choose the mode of payment either 1 or 2");
                    paymentselection();

            

        }
        // confirmation for the booking
        System.out.println("*************************");
        System.out.println("--Press 1 for confirm--");
        System.out.println("*************************\t\t\n");


        
        confirm=scanner.nextInt();
        switch(confirm)
        {
            
            case 1:
                System.out.println("**********************************************");            
                System.out.println("thank you for booking enjoy your journey\t\t\n");
                break;
              
             
            default:
                System.out.println("**********************************************");
                System.out.println("invalid selection please Press 1 for booking\t\t\n");
                break;
        }
                System.out.println("------------booking details-------------------");
        

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            Userdetails user = new Userdetails();
            name = user.getUserName();
            Userdetails userdetails=new Userdetails();
            String names=userdetails.getUserName();
            sql = "select * from OnlineCabBooking where name='"+names+"'";
            ResultSet resultset = statement.executeQuery(sql);
            if(resultset.next()){
                String name=resultset.getString("name");
                String number=resultset.getString("number");
                String pickuplocation=resultset.getString("pickuplocation");
                String destinationlocation=resultset.getString("destinationlocation");
                String car=resultset.getString("car");
                System.out.println("Name: "+ name);
                System.out.println("Number: "+number);
                System.out.println("Pickup Location: " +pickuplocation);
                System.out.println("Destination Location: "+ destinationlocation);
                System.out.println("Car: "+car);
            }
            
        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            try {
                connection.close();
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }

        
    
        System.out.println("\n#######################################################################################################");
        System.out.println("------------------------booked successfully thank you for choosing our service--------------------------");
        System.out.println("########################################################################################################");
        

    }

}
