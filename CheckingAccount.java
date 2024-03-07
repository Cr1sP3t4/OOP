package bank;
    public class CheckingAccount {
        private String name;
        private int balance;
        private String id;
        private double interestRate;
        public CheckingAccount(String inputName, int inputBalance, String inputId){
            name = inputName;
            balance = inputBalance;
            id = inputId;
            interestRate = 0.02;
        }
        public int getBalance(){
            System.out.println("Your current balance is " + balance + " USD.");
            return balance;
        }
        public void setBalance(int newBalance){
            balance = newBalance;
        }
        public double getMonthlyInterest(){
            return interestRate * balance;
        }
        public void consign(int consignedValue){
            balance = balance + consignedValue; 
            System.out.println("The deposited value was " + consignedValue + "USD.");
        }
        public void withdraw(int withdrawnValue){
            balance = balance - withdrawnValue;
            System.out.println("The value withdrawn was " + withdrawnValue + "USD.");
        }
}
