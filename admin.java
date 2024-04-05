import java.util.ArrayList;
import java.util.List;

public class admin extends user{
   public void atm_bal_check(){
        if(atm_amount==0){
            System.out.println("Insufficient balance in ATM so we will resolve this soon");
        }
        else{
            System.out.println("ATM BALANCE IS:"+atm_amount);
        }
    }
    public void filling_cash(double amount){
        atm_amount+=amount;
        System.out.println("Amount of Rupees:"+amount+" has been added successfully");
    }

}
