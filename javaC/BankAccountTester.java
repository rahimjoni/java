class BankAccount {

   private String name;
   private String id;
   private double balance;

   public BankAccount(String name, String id) {
       this.name = name;
       System.out.println(this.name);
       this.id = id;
       System.out.println(this.id);
   }

   public BankAccount() {
   }

    public void updateBalance(double balance) {
       this.balance = balance;
    }

   public double getBalance() {
       return balance;
   }
}

public class BankAccountTester {

   public static void main(String[] args) {

       BankAccount obj = new BankAccount("Abdur Rahim", "2019000010127");
    //    System.out.println(obj.id);
       double objBalance = obj.getBalance();
       System.out.println("Balance : " + objBalance);
   }
}