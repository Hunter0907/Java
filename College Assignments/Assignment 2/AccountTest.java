/**@author Jack Connolly */

public class AccountTest {
    public static void main(String[] args){
        System.out.println("Food\n" + "----------------------------------------------------------\n"  );

        //Meat Objects - Meat Profiles
        Meat meat1 = new Meat("Steak", 13, .12, .01, 1.34, .76, .86);

        //Vegetable Objects - Vegetable Profiles
        Vegetable veg1 = new Vegetable("Carrot", 13, .12, .01, 1.34, .76, .86);
        Vegetable veg2 = new Vegetable("Lettuce", 13, .12, 41, 1.34, .76, .86);

        //Vegetables methods & display function
        veg1.healthy();
        veg1.display();
        veg2.healthy();
        veg2.display();

        
        //meats methods & display function
        meat1.healthy();
        meat1.display();

        //Person objects - People profiles & their favourite foods
        Person description1 = new Person("Jack", "Connolly", "Cork", meat1); 
        System.out.println(description1.getforename() + " "  + description1.getlastname() + "'s favourite food is: " + meat1.getName() + "\n" );
        Person description2 = new Person("John", "Doe", "Kerry",veg1); 
        System.out.println(description2.getforename() + " "   + description2.getlastname() + "'s favourite food is: " + veg1.getName() + "\n");


        System.out.println("----------------------------------------------------------\n" + "Bank/Loan\n");
        //Bank Account object - Account Profiles
        BankAccount account1 = new BankAccount(1, description1, 128.12);
        BankAccount account2 = new BankAccount(2, description2, 2000.43);
        

        //USing the display methods to display the person's first name & bank account details in a clear and aesthetically pleasing manner
        account1.display();
        account2.display();

        //To print out account holder’s first name and also the balance of the BankAccount object (Part 1 step 13)
        System.out.println(account1.getcurrent_balance());
        System.out.println(description1.getforename() + "\n");

        

        
        //Loan Account onject - Loan Profiles, account number, person profile & overdraftlimit
        LoanAccount account = new LoanAccount(1,description1,128.12,2000);
        System.out.println(account);

        //Method to add 200 more to the overdraft limit
        account.addditional_overdraftby(200);

        //method to display athsetically
        account.display();
        
        


    
           
    }

    

    
}

