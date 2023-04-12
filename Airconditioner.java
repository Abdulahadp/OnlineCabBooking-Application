import java.util.Scanner;
public class Airconditioner {

    Scanner scanner= new Scanner(System.in);
    int choose,Ac;
    
    //choosing a airconditioner vehicles

    void luxury(){
      
        System.out.println("-----------------do you want AC facilities--------------------\t\t\n");
        System.out.println("**************************************************************");
        System.out.println("press 1 for Ac");
        System.out.println("press 2 for  non Ac/normal cab");
        System.out.println("***************************************************************\t\t\n");
        choose=scanner.nextInt();
        
        
        switch(choose)
        {
            case 1:
            System.out.println("**********************************************");
            System.out.println("thank you for choosing  AC vehicles");
            System.out.println("**********************************************\t\t\n");
            break;

            case 2:
            System.out.println("normal cab");
            break;

            default:
            System.out.println("invalid selection please press either 1 or 2");
            luxury();
            break;
        }
        System.out.println("lets start your booking\t\t\n");

         
        
    }

    

    
}
