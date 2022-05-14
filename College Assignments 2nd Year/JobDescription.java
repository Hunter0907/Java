/**
 * @author Jack Connolly
 *
 */
//variables
public class JobDescription {
    private String location;
    private String company;
    private String jobskill;
    private String skillRequired;
    private int yearsOfExperienceRequired;


    //getters
    public String getlocation(){
        return location;
    }
    public String getcompany(){
        return company;
    }
    public String getjobskill(){
        return jobskill;
    }
    public String getskillRequired(){
        return skillRequired;
    }
    public int getyearsOfExperienceRequired(){
        return yearsOfExperienceRequired;
    }

    // constructors
    public JobDescription(){}
    /**
     * 
     * @param newLocation
     * @param newCompany
     * @param skill
     * @param years
     */
    public JobDescription(String newLocation, String newCompany, String skill, int years){
        location = newLocation;
        company = newCompany;
        jobskill = skill;
        yearsOfExperienceRequired = years;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return location + ", " + jobskill + ", " + company;
    }
}
