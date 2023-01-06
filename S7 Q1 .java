class Bank 
{ 
private double balance; 
public Bank() 
{ 
balance = 0; 
} 
public Bank(double initialBalance) 
{ 
balance = initialBalance; 
} 
public void deposit(double amount) 
{ 
balance = balance + amount; 
} 
public void withdraw(double amount) 
{ 
balance = balance - amount; 
} 
public double getBalance() 
{ 
return balance; 
} 
public static void main(String[] args) 
{ 
Bank b = new Bank(1000); 
b.withdraw(250); 
System.out.println("the withdraw is:"+ b.balance); 
b.deposit(400); 
System.out.println("the deposit is:"+ b.balance); 
System.out.println("the balance is:"+ b.getBalance()); 
}
}