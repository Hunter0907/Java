/**
 * @author Jack Connolly
 */

public class LoanAccount extends BankAccount {

    //Variable
    private double overdraftlimit;

    /**
     * 
     * @param newaccNum - account number
     * @param newaccOwner - owner of the account
     * @param newcurrent_balance - current alance
     * @param newoverdraftlimit - the overdraft limit associated with the account
     */
    public LoanAccount(int newaccNum, Person newaccOwner,double newcurrent_balance,double newoverdraftlimit){
        super(newaccNum,newaccOwner,newcurrent_balance);
        this.overdraftlimit = newoverdraftlimit;

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString(){
        return super.toString() + "with an overdraft limit of: " + overdraftlimit + "\n";
    }


    //Getters & Setters
    public double getoverdradtlimit(){
        return overdraftlimit;
    }

    public void setoverdraftlimit(double newoverdraftlimit){
        this.overdraftlimit = newoverdraftlimit;
    }

    //Methods


    /**
     * 
     * @param additional_overdraft - ability to add additional value to the overdraft limit
     */
    public void addditional_overdraftby(double additional_overdraft){

        //public void addditional_overdraftby(double additional_overdraft, Person newaccOwner){
        this.overdraftlimit = overdraftlimit + additional_overdraft;
        //System.out.println("Last Name: " + newaccOwner.getlastname() + "Account Number: " + this.getaccNum());
        System.out.println("(LOAN) Additional Overdraft amount is: " + additional_overdraft + "\n");
    }

    //displays final overdraft limit
    public void display(){
        System.out.println("(LOAN) Final Overdraft Limit: " + overdraftlimit + "\n");
        super.display();
    }
}
