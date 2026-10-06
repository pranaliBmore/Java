/*Develop a BankAccount class which should contain all methods of Bank i.e. balanceEnquery(), 
withdraw(), transfer() and deposit(). You should create at least two objects of BankAccount 
using array and do all operations mentioned above. Also generate user defined exception 
LowBalanceException, NegativeNumberException and PasswordMismatchException whenever 
required. To transfer amount from one account to another use two BankAccount objects */

import java.util.Scanner;

class LowBalanceException extends Exception{
    LowBalanceException(String messsage){
        super(messsage);
    }
}
class NegativeNumberException extends  Exception{
    NegativeNumberException(String message){
        super(message);
    }
}
class PasswordMismatchException extends  Exception{
    PasswordMismatchException(String message){
        super(message);
    }
}
public class BankAccount{
    int account_no;
    String name;
    double balance;
    String password;

    BankAccount(int account_no,String name,double balance,String password){
        this.account_no=account_no;
        this.name=name;
        this.balance=balance;
        this.password=password;
    }
        void balanceEnquery(){
            System.out.println("Account_No: "+account_no);
            System.out.println("Name: "+name);
            System.out.println("Balance: "+balance);
    }
    void deposit(double amount)
            throws NegetiveNumberException {

        if (amount < 0) {
            throw new NegetiveNumberException(
                    "Amount cannot be negative!");
        }
        balance+=amount;
        System.out.println("Amount deposited successfully");
    }
    void withdraw(double amount,String passwd)
    throws LowBalanceException,NegetiveNumberException,PasswordMismatchException{
        if(!password.equals(passwd)){
                throw new PasswordMismatchException("Password not matched");
            }
            if(amount<0){
                throw new NegetiveNumberException("Amount can be negative");
            }
            if(amount>balance){
                throw new LowBalanceException("Balance is Insufficient");
            }
            balance-=amount;
            System.out.println("Amount withdraw successfully");
    }
    void transfer(BankAccount receiver,double amount,String passwd)throws LowBalanceException,NegetiveNumberException,PasswordMismatchException{
        if(!password.equals(passwd)){
            throw new PasswordMismatchException("Password does not match");
        }
        if(amount<0){
                throw new NegetiveNumberException("Amount cannot be negative");
            }
            if(amount>balance){
                throw new LowBalanceException("Insufficient Balance");
            }
            this.balance=this.balance-amount;
            receiver.balance=receiver.balance+amount;
            System.out.println("amount transfer successfully");
        }
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            BankAccount [] accounts=new BankAccount[2];
            accounts[0]=new BankAccount(101, "Pranali", 30000, "1211");
            accounts[1]=new BankAccount(102, "Dnyaneshwari", 40000, "1212");

            try{
                System.out.println("\n*********Balance Enquiry**********");
                accounts[0].balanceEnquery();
                System.out.println("\n******Deposite******");
                accounts[0].deposit(2000);
                System.out.println("\n*****Withdraw****");
                accounts[0].withdraw(1000, "1211");
                System.out.println("\n*****Withdraw****");
                accounts[0].transfer(accounts[1],1000, "1211");
                System.out.println("\n final result");
                accounts[0].balanceEnquery();
                System.out.println();
                accounts[1].balanceEnquery();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }