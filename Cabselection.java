import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.sql.*;


public class Cabselection {
    Scanner scanner = new Scanner(System.in);
    int choose;
    int rechoose;
    Connection connection;
    Statement statement;
    String sql;
    Airconditioner airconditioner = new Airconditioner();
    String url = "jdbc:mysql://127.0.0.1:3306/abdulahad";
    String user = "root";
    String pass = "Abdulmysql@123";
    String name, cab;

    void selection() {

        // list of cabs
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("1:innova");
        cars.add("2:qualis");
        cars.add("3:Ertiga");
        cars.add("4:santro");
        cars.add("5:Etios");

        Iterator<String> list = cars.iterator();
        while (list.hasNext())
            System.out.println(list.next());

        // choosing a cab
        System.out.println("-------select a car using a number----------------\t\t");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                try {
                    // Class.forName("com.mysql.cj.jdbc.Driver");

                    connection = DriverManager.getConnection(url, user, pass);
                    statement = connection.createStatement();
                    Userdetails user = new Userdetails();
                    name = user.getUserName();
                    cab = "Innova";
                    sql = "update OnlineCabBooking set car='"+ cab +"' where name='" + name + "' ";
                    int result = statement.executeUpdate(sql);
                    if (result == 1) {
                        System.out.println("***************************************************************");
                        System.out.println(" \t thank you for choosing  a innova");
                        System.out.println(" \t the total no of seats: >>>10<<<");
                        System.out.println("**************************************************************\t\t\n");

                    } else {
                        System.out.println("***************************************************************");
                        System.out.println(" \t Not Registered ");
                        System.out.println("**************************************************************\t\t\n");

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
                break;

            case 2:
            try {
                // Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, user, pass);
                statement = connection.createStatement();
                Userdetails user = new Userdetails();
                name = user.getUserName();
                cab = "qualis";
                sql = "update OnlineCabBooking set car='"+ cab +"' where name='" + name + "' ";
                int result = statement.executeUpdate(sql);
                if (result == 1) {
                    System.out.println("***************************************************************");
                    System.out.println(" \t thank you for choosing  a qualis");
                    System.out.println(" \t the total no of seats: >>>10<<<");
                    System.out.println("**************************************************************\t\t\n");

                } else {
                    System.out.println("***************************************************************");
                    System.out.println(" \t Not Registered ");
                    System.out.println("**************************************************************\t\t\n");

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
                System.out.println("**************************************************************");
                System.out.println(" \t thank you for choosing qualis");
                System.out.println(" \t the total no of seats >>>10<<<");
                System.out.println("**************************************************************\t\t");
                break;

            case 3:
            try {
                // Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, user, pass);
                statement = connection.createStatement();
                Userdetails user = new Userdetails();
                name = user.getUserName();
                cab = "ertiga";
                sql = "update OnlineCabBooking set car='"+ cab +"' where name='" + name + "' ";
                int result = statement.executeUpdate(sql);
                if (result == 1) {
                    System.out.println("***************************************************************");
                    System.out.println(" \t thank you for choosing  a ertiga");
                    System.out.println(" \t the total no of seats: >>>07<<<");
                    System.out.println("**************************************************************\t\t\n");

                } else {
                    System.out.println("***************************************************************");
                    System.out.println(" \t Not Registered ");
                    System.out.println("**************************************************************\t\t\n");

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
                System.out.println("**************************************************************");
                System.out.println("\t thank you for choosing ertiga");
                System.out.println("\t the total number of seats >>>07<<<");
                System.out.println("****************************************************************\t\t\n");
                break;

            case 4:
            try {
                // Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, user, pass);
                statement = connection.createStatement();
                Userdetails user = new Userdetails();
                name = user.getUserName();
                cab = "santro";
                sql = "update OnlineCabBooking set car='"+ cab +"' where name='" + name + "' ";
                int result = statement.executeUpdate(sql);
                if (result == 1) {
                    System.out.println("***************************************************************");
                    System.out.println(" \t thank you for choosing  a santro");
                    System.out.println(" \t the total no of seats: >>>05<<<");
                    System.out.println("**************************************************************\t\t\n");

                } else {
                    System.out.println("***************************************************************");
                    System.out.println(" \t Not Registered ");
                    System.out.println("**************************************************************\t\t\n");

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
                System.out.println("***************************************************************");
                System.out.println("\t thank you for choosing santro");
                System.out.println("\t the total no of seats >>>05<<<");
                System.out.println("**************************************************************\t\t\n");
                break;

            case 5:
            try {
                // Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, user, pass);
                statement = connection.createStatement();
                Userdetails user = new Userdetails();
                name = user.getUserName();
                cab = "etios";
                sql = "update OnlineCabBooking set car='"+ cab +"' where name='" + name + "' ";
                int result = statement.executeUpdate(sql);
                if (result == 1) {
                    System.out.println("***************************************************************");
                    System.out.println(" \t thank you for choosing  a etios");
                    System.out.println(" \t the total no of seats: >>>05<<<");
                    System.out.println("**************************************************************\t\t\n");

                } else {
                    System.out.println("***************************************************************");
                    System.out.println(" \t Not Registered ");
                    System.out.println("**************************************************************\t\t\n");

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
                System.out.println("*************************************************************");
                System.out.println("\t thank you for choosing Etios");
                System.out.println("\t the total no of seats >>>05<<<");
                System.out.println("*************************************************************\t\t\n");
                break;

            default:
                System.out.println("***************************************************************");
                System.out.println("invalid selection please select from 1 to 5 ");
                selection();
                System.out.println("***************************************************************\t\t\n");
                break;
        }
        System.out.println("press 1 for move on with this car");
        System.out.println("press 2  for  select the other car ");

        rechoose = scanner.nextInt();
        switch (rechoose) {
            case 1:
                System.out.println("***************************************************************");
                System.out.println("thank you for choosing this car");
                airconditioner.luxury();
                break;

            case 2:
                System.out.println("i am looking for some other car");
                selection();
                break;

            default:
                System.out.println("press either 1 or 2");
                selection();
                break;

        }

    }

}
