/**
 * @author Jack Connolly
 *
 */
enum Gender{
        MALE,
        FEMALE,
        PREFER_NOT_TO_SAY;
        public String toString(){
            String result = "";
            switch(this){
                case MALE: {
                    result = "Male";
                    break;
                }
                case FEMALE: {
                    result = "Female";
                    break;
                }
                case PREFER_NOT_TO_SAY: {
                    result = "Prefer Not to Say";
                    break;
                }
                default: {
                    result = "Unknown";
                    throw new IllegalArgumentException("Unexpected value: " + this);
                }
                  
            }
            return result; 
        }
    }

public class Person {
    // variables
    private String location;
    private String skill;
    private String name;
    private Gender gender;
    private int yearsOfExperience;
    
    /**
     * 
     * @return
     */

    //getters
    public String getname(){
        return name;
    }

    public Gender getgender(){
        return gender;
    }
  
    public String getlocation(){
        return location;
    }

    public String getskill(){
        return skill;
    }

    public int getyearsOfExperience(){
        return yearsOfExperience;
    }
    /**
     * Constructor for Person Class
     * Assigns inputs to the variable name (gender, name and location)
     * 
     * @param newName - 
     * @param newGender - 
     * @param newLocation - 
     */

    public Person(String newName, Gender newGender, String newLocation){
        name = newName;
        gender = newGender;
        location = newLocation;

    }

    // methods
    /**
     * This method adds a skill to a person. 
     * @param newSkill - a new skill
     * @param years - number of years of experience of the applicant for the skill. Negative values are not accepted.
     * @param isOutputON - if this is set to true, the skill will print to the screen. If not, the new added skill is not printed.
     */

    public void addSkill(String newSkill, int years, boolean isOutputON){
        skill = newSkill;
        yearsOfExperience = years;
        if (isOutputON == true){
            System.out.println(name + " has new skill = " + skill + " " + "(" + yearsOfExperience + " years" + ")");
        }
        
    }
     
    /**
      * {@inheritDoc}
      */
    @Override
    public String toString() {
        return name + "[" + gender + "] -" + " location: " + location + ", skill: " + skill + ", years of Experience: " + yearsOfExperience;
    }

     /**
      * {@inheritDoc}
      */
    @Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}else if (obj == null || getClass() !=obj.getClass()) {
			return false;
		}
		Person x = (Person) obj;
		return (name.equals(x.name) && gender.equals(x.gender) && location.equals(x.location));
	}
}