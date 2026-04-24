public class Customer{
     //class level variable: instance, static 
     String custId;
     String name;
     double balance;
     int transactions;

     //constructor
     public Customer(String custId, String name, double balance){
         this.custId=custId;
         this.name=name;
         this.balance=balance;
         transactions=0;
     }

     //method to deposit
     public void deposit(double depositAmount){
       if(depositAmount > 0){
         balance=balance+depositAmount;
         transactions++;
         System.out.println(depositAmount+ " has deposited Successfully!");
       }else{
           System.out.println("Sorry! Invalid amount!");
       }
     }

     //method to withdraw
     public void withdraw(double withdrawAmount){
          if(balance>0 && withdrawAmount <= balance){
              balance=balance-withdrawAmount;
              transactions++;
              System.out.println(withdrawAmount+" has been withdrawan!");
              System.out.println("Your current balance is "+balance);
          }else{
              System.out.println("Sorry! inssuficient balance");
          }
     }

     //method to display customer detials
     public void customerInfo(){
          System.out.println("\n ---------- Customer Details----------");
          System.out.println("Customer ID: "+custId);
          System.out.println("Customer Name: "+name);
          System.out.println("Bank Balance: "+balance);
          System.out.println("No. of transactions: "+transactions);
          
     }   

      //transactions fee deductions
      public boolean transactionsFee(double feePerTransactions){
           if(transactions > 0){
               double totalFee=transactions*feePerTransactions;
               if(totalFee<=balance){
                    balance=balance-totalFee;
                    System.out.println("Transaction fee "+totalFee+" has been deducted");
                    return true;
               }else{
                    System.out.println("less balance.....");
                    return false;
               }
           }else{
               System.out.println("no transactions.....");
               return false;
           }
       }  

}