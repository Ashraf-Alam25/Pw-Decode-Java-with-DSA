package OOPS;
class Account {
    private double balance;
    public double getBalance(double balance){
        boolean result = validate("ahsraf", "ashraf123");
        if(result == true){
            this.balance = this.balance - balance;
        }
        else{
            System.out.println("Invalid username/password please try again..");
        }
        return balance;
    }
    public void setBalance(double balance){
        boolean result = validate("Ahsraf", "ashraf123");
        if(result == true){
            //deposite money
            this.balance = this.balance + balance;
            System.out.println("Credited to the account");
        }
        else{
            //throw a message
            System.out.println("Invalid username/password please try again..");
        }
    }
    private boolean validate(String usename, String password){
        return usename.equalsIgnoreCase("ahsraf")
            && password.equals("ashraf123");
    }
}
class BankApp {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.0);
        double balance = acc.getBalance(500.0);
        System.out.println("Witdrawing "+ balance + " Amount");
        
    }
}
