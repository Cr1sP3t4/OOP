package bank;
public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;
public Bank(){
    accountOne = new CheckingAccount("Zack", 100, "1");
    accountTwo = new CheckingAccount("Hutch", 200, "2");
}
public static void main(String[] args) {
    Bank bankOfPals = new Bank();
    
    //Cuenta bancaria número 1:
    
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.setBalance(5000);
    
    //Consignaciones de la cuenta bancaria número 1.
    
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.consign(3000);
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.consign(999);
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.consign(500);
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.consign(510);
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.consign(800);
    
    //Retiros de la cuenta bancaria número 1.
    
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.withdraw(3660);
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.withdraw(999);
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.withdraw(450);
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.withdraw(5000);
    System.out.println(bankOfPals.accountOne.getBalance());
    bankOfPals.accountOne.withdraw(200);
    System.out.println(bankOfPals.accountOne.getBalance());
    
    //Cuenta bancaria número 2:
    
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.setBalance(5000);
    
    //Consignaciones de la cuenta bancaria número 2.
    
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.consign(2000);
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.consign(180);
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.consign(50);
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.consign(450);
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.consign(80);
    
    //Retiros de la cuenta bancaria número 2.
    
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.withdraw(3660);
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.withdraw(999);
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.withdraw(450);
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.withdraw(500);
    System.out.println(bankOfPals.accountTwo.getBalance());
    bankOfPals.accountTwo.withdraw(200);
    System.out.println(bankOfPals.accountTwo.getBalance());
}    
}
