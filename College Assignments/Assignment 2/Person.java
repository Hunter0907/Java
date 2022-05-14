/**
 * @author Jack Connolly
 */

public class Person {

    //Variables
    private String forename;
    private String lastname;
    private String address;
    private Food favFood;


    //Constructor
    /**
     * 
     * @param newforename - first name of person
     * @param newlastname - last name of person
     * @param newaddress - address of person
     */
    public Person(String newforename, String newlastname,String newaddress,Food newfavFood){
        forename = newforename;
        lastname = newlastname;
        address = newaddress;
        favFood = newfavFood;
    }

    //Getters and Setters
    /**
     * 
     * @return
     */
    public String getforename(){
        return forename;
    }

    public void setforename(String newforename){
        this.forename = newforename;
    }
    
    public String getlastname(){
        return lastname;
    }

    public void setlastname(String newlastname){
        this.lastname = newlastname;
    }

    public String getaddress(){
        return address;
    }

    public void setaddress(String newaddress){
        this.address = newaddress;
    }

    public Food getfavFood(){
        return favFood;
    }

    public void setfavFood(Food newfavFood){
        this.favFood = newfavFood;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString(){
        return forename + " " + lastname;
    }

}
