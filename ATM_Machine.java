import java.util.*;
public class ATM_Machine{
    public static void choose(){
        Scanner sc = new Scanner(System.in);
        boolean Atm=true;
       int total_amount=50000;
      
       while( Atm==true){
       System.out.println("please select your option");
       System.out.println("Withdraw- press 1");
       System.out.println("Deposit- press 2");
       System.out.println("Check Balance- press 3");
       System.out.println("Exit-press 4");
       int number=sc.nextInt();

       switch(number){     
       case 1:
           System.out.print("Please Enter your Amount : ");
           int amount=sc.nextInt();
           System.out.print("Please Enter your PIN number : ");
           char pin=sc.next().charAt(0);
           
           if(amount>50000){
                System.out.println("you dont have sufficient balance");
                System.out.println("your transaction has been declined....");           
            }
            else{
                total_amount=total_amount-amount;
                System.out.println("Please Wait while your transaction is being processed....");
                System.out.println("Please collect your cash");
                System.out.println("your transaction has been succesful....");
            }
                break;
         
         case 2:
            System.out.print("please enter your amount to be deposited : ");
            amount=sc.nextInt();
            System.out.print("Please Enter your PIN number : ");
            pin=sc.next().charAt(0);
            total_amount=total_amount+amount;
            System.out.println("Please Wait while your transaction is being processed....");
            System.out.println("Your amount has been successfully deposited");
            break;

         
          case 3:
            System.out.print("Please Enter your PIN number : ");
            pin=sc.next().charAt(0);
            System.out.println("your Available balance is : "+total_amount);
            break;
          
          case 4:
            System.out.println("Please Remove your Debit Card...");
            Atm=false;
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!! WELCOME TO 'BANK OF INDIA' ATM !!");
        System.out.println();
        System.out.println("Please Insert Your Debit card...");
        System.out.println("Please Wait while we are fetching your Details..... ");
        System.out.println();
        choose();

    }
}