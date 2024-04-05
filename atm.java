import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class atm {
    static List<user>details=new ArrayList<>();
    public static void main(String[] args) {
        user us1=new user("kumar",11111,98765432,1000,50,"KVB");
        user us2=new user("sam",22222,98765432,2000,500,"SBI");
        user us3=new user("som",33333,98765430,3000,5000,"IDFC");
        user us4=new user("ravi",44444,98765401,4000,50000,"ICICI");
        user us5=new user("sasi",55555,98765012,5000,5003214,"BOI");
        details.add(us1);  
        details.add(us2); 
        details.add(us3); 
        details.add(us4); 
        details.add(us5);   
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ATM operations");
        boolean flag=true;
        do{
           System.out.println("Press 1 for new user");
           System.out.println("Press 2 for existing user");
           int choice=sc.nextInt();
           switch(choice){
            case 1:
                System.out.println("Enter your name:");
                String username1=sc.next();
                Random random=new Random();
                long accno1=random.nextInt(90000)+10000;
                System.out.println("Enter your mobile number:");
                int mobileno1=sc.nextInt();
                long accpin1=random.nextInt(9999-1000+1)+1000;
                System.out.println("enter initial amount to be deposited");
                double balance1=sc.nextDouble();
                System.out.println("Enter which bank you need:");
                String bank1=sc.next();
                user us=new user(username1,accno1,mobileno1,accpin1,balance1,bank1);
                details.add(us);
                break;
            case 2:
                System.out.println("Enter your account number:");
                long acntnum=sc.nextLong();
                boolean validacnt=false;
                for(user val:details){
                    if(acntnum==val.accno){
                        validacnt=true;
                        System.out.println("Enter your account pin:");
                        long acntpin=sc.nextLong();
                        while(acntpin!=val.accpin){
                            System.out.println("Enter wrong account pin so re-enter your pin:");
                            acntpin=sc.nextLong();
                        }
                        System.out.println("Enter the operations you need to perform");  
                        System.out.println("1.Deposit");
                        System.out.println("2.Withdrawal");
                        System.out.println("3.Balance Enquiry");
                        System.out.println("4.Pin Change");
                        System.out.println("5.Generate a new pin");
                        int choice2=sc.nextInt();
                        switch(choice2){
                            case 1:
                                System.out.println("Enter the amount to be deposited:");
                                int deposit_amount=sc.nextInt();
                                val.deposit(deposit_amount);
                                break;
                            
                            case 2:
                                System.out.println("Enter the amount to be withdraw:");
                                int withdraw_amount=sc.nextInt();
                                val.withdraw(withdraw_amount);
                                break;
                            
                            case 3:
                                val.checkbalance();
                                break;
                            
                            case 4:
                                System.out.println("Enter your old pin:");
                                int pin_change=sc.nextInt();
                                val.pinchange(pin_change);
                                break;
                            
                            case 5:
                                val.generatepin();
                                break;
                        }                
                    }
                }

           }
        }while(flag);              
    }
}
