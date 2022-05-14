/**
 * @author Jack Connolly
 */

public class BankAccount {
    //Variables
    private int accNum;
    private double current_balance;
    private Person accOwner;

    //Getters and Setters
    /**
     * 
     * @return
     */
    public int getaccNum(){
        return accNum;
    }
   
    public double getcurrent_balance(){
        return current_balance;
    }

    public Person getaccOwner(){
        return accOwner;
    }


    public void setcurrent_balance(double newcurrent_balance){
        this.current_balance = newcurrent_balance;
    }

    public void setaccOwner(Person newaccOwner){
        this.accOwner = newaccOwner;
    }
        


    //constructor
    /**
     * 
     * @param newaccNum - account number
     * @param newaccOwner - owner of account (uses composition from person class)
     * @param newcurrent_balance - the current balance of the account in question
     */
    public BankAccount(int newaccNum, Person newaccOwner, double newcurrent_balance) {
        this.accOwner = newaccOwner;
        this.accNum = newaccNum;
        this.current_balance = newcurrent_balance;
    }
    
    /**
     * Display method displays the result in a clear and aesthetically pleasing manner
     */
    public void display(){
        System.out.println("Account Owner: " + accOwner + " \nAccount Number: " + accNum + " \nCurrent Balance: " + current_balance + "\n");
    }

    /**
     * {@inheritDoc}
     */
    public String toString(){
        return "Account number is: "+ accNum + "\nCurrent balance is: " + current_balance + "\nOwner of the account: " + accOwner + "\n";
    }


}
