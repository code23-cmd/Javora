class BankAccount {
int Accountnumber;
String AccountHolderName;
String AccountType;
double balance;

//Default Constructor
BankAccount() {
this.Accountnumber = 0;
this.AccountHolderName = "Unknown";
this.AccountType = "Saving";
this.balance = 0;
System.out.println("\nDefault constructor :-" );
System.out.println("Account Number :"+Accountnumber );
System.out.println("Account Holder Name :" +AccountHolderName);
System.out.println("Account Type:" +AccountType);
System.out.println("Balance :" +balance);
}

//Constructor overloading: Constructor with name
BankAccount(String AccountHolderName){
this.AccountHolderName = AccountHolderName;
System.out.println("\nConstructor with only name :-" );
System.out.println("Name :" +AccountHolderName);
}

//Constructor overloading : Constructor with name and balance
BankAccount(String AccountHolderName,double balance){
this.AccountHolderName = AccountHolderName;
this.balance = balance;
System.out.println("\nConstructor with name and balance:-" );
System.out.println("Name :" +AccountHolderName);
System.out.println("Balance :" +balance);
}

//Parameterized Constructor
BankAccount(int Accountnumber,String AccountHolderName,String AccountType,double balance){
this.Accountnumber = Accountnumber;
this.AccountHolderName = AccountHolderName;
this.AccountType = AccountType;
this.balance = balance;
System.out.println("\nParametrized constructor :-" );
System.out.println("Account Number :"+Accountnumber );
System.out.println("Account Holder Name :" +AccountHolderName);
System.out.println("Account Type:" +AccountType);
System.out.println("Balance :" +balance);
}

// Copy constructor with constructor chaining using this()
BankAccount(BankAccount b)
{
	this(b.Accountnumber,b.AccountHolderName,b.AccountType,b.balance);
}

// Deposit money into the account
void deposit(double amount)
{
 balance+=amount;
 System.out.println("Deposited Amount : "+amount);
}

// Withdraw money if sufficient balance is available
void withdraw(double amount)
{
 if(amount<=balance){
    balance= balance - amount;
    System.out.println("Withdrawal Amount : " + amount);
    System.out.println("Remaining Balance : " + balance);
    }
  else
    System.out.println("Insufficient Balance");
}

// Display method to test the method call
void display(){
System.out.println("Done !!");
}

 //Program execution starts here
public static void main(String args[]){
BankAccount b1 = new BankAccount();
BankAccount b2 = new BankAccount("Sapna");
BankAccount b3 = new BankAccount("Amit",5000);
BankAccount b4 = new BankAccount(101,"Neha","Current",10000);

// Create a duplicate account using the copy constructor
BankAccount b5 = new BankAccount(b4);

// Perform banking operations on b4
b4.deposit(2000);
b4.withdraw(1500);
b4.display();
}
}