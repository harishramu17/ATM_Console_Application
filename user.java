import java.util.*;
public class user extends atm{
    String username;
    long accno;
    long mobileno;
    int accpin;
    double balance;
    String bank;
    public user(){

    }
    public user(String username,long accno,long mobileno,int accpin,double balance,String bank){
        this.username=username;
        this.accno=accno;
        this.mobileno=mobileno;
        this.accpin=accpin;
        this.balance=balance;
        this.bank=bank;
    }
    public void deposit(int amount){
        balance=amount+balance;
        atm_amount-=amount;
        System.out.println("Amount of Rupees:"+amount+"has been credited");
    }
    public void withdraw(int amount){
        if(amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    
    }
    public void checkbalance(){
        System.out.println("Your Balance amount is:"+balance);
    }
    public void pinchange(int pin){
        accpin=pin;
    }
    public void generatepin(){
        Random random=new Random();
        accpin=random.nextInt(9000)+1000;//it generates value from 0 to 90000 since it can be 0 add 1000
        System.out.println("Your Account Pin has been generated successfully and your pin is"+accpin);
    }


}
