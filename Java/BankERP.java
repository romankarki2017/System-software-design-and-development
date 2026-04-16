public class BankERP{
   public static void main(String[] args){
        Customer c1=new Customer("SBI001", "Sabin Roka", 23000);
        Customer c2=new Customer("SBI002", "Srijana Rana", 24000);

        //method call
        c1.deposit(5000);
        c1.deposit(6000);
        c1.withdraw(20000);
        System.out.println("Dear " + c1.name + " your current balance is: "+c1.balance);
        c1.withdraw(200);
        c1.withdraw(25000);
        c1.customerInfo();
        boolean result=c1.transactionsFee(20);
        if(result==true){
           System.out.println("\nDeducted!");
        }else{
           System.out.println("\nZero Trasactions or less balance");
        }

   }
}