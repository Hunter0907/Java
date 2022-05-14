/**
 * @author Jack Connolly
 *
 */
public class MatchingSystem {
    // variables
    private JobDescription[] jobs;
    private Person[] applicants;
    private int numberOfJobs;
    private int numberOfApplicants;
    private int maximumNumberOfJobs;
    private int maximumNumberOfApplicants;
    private int match_counter;
	private boolean match_found;

    //getters
    public JobDescription[] getjobs(){
        return jobs;
    }

    public Person[] getapplicants(){
        return applicants;
    }

    public int getnumberOfJobs(){
        return numberOfJobs;
    }
    
    public int getnumberOfApplicants(){
        return numberOfApplicants;
    }

    public int getmaximumNumberOfApplicants(){
        return maximumNumberOfApplicants;
    }

    public int maximumNumberOfJobs(){
        return maximumNumberOfJobs;
    }

    public int getmatch_counter(){
        return match_counter;
    }

    public boolean match_found(){
        return match_found;
    }
    // constructor
    public MatchingSystem(){
        
        maximumNumberOfJobs = 3;
        maximumNumberOfApplicants = 6;
        numberOfJobs = 0;
        numberOfApplicants = 0;
        jobs = new JobDescription[maximumNumberOfJobs];
		applicants = new Person[maximumNumberOfApplicants];
    }

    // methods

    /**
     * This method receives an input of a job description and adds it as the next
     * element to the job array. If the job array is not full, and the new job is added, a message is printed.
     * 
     * @param jobDesc - job description
     */
    public void addJob(JobDescription jobDesc){
        if (numberOfJobs >= maximumNumberOfJobs) {
			System.out.println("job " + "[" + jobDesc + "] " + "could not be added to the matching system because the system is full.");
		}
		else {
			jobs[numberOfJobs] = jobDesc;
			numberOfJobs += 1;
			System.out.println("[" + jobDesc + "] " + "has been added number of jobs in the system is now " + numberOfJobs + " years");
		}
	}
    


    /**
     * this method receives an input and adds the person profile as the
     * next element to the array of the applicants. If the person array is not full, the new
     * Person would be successfully added.
     * 
     * @param personProfile - a person profile
     */
    public void addApplicant(Person personProfile){
        if (numberOfApplicants >= maximumNumberOfApplicants) {
			System.out.println("The matching system is at the maximum number of applicants already");
		}
		else {
			applicants[numberOfApplicants] = personProfile;
			numberOfApplicants += 1 ;
			System.out.println(personProfile + " has been added and the number of applicants in the system is now " + numberOfApplicants);

		}
	}


    /**
     * This method lists all (job description to applicant) matches.
     * In order for a match between a person and a job the (job and person must be in the same city) AND (the person's skill must match the skill required by the job) AND 
     * (the person must meet the minimum years of experience needed for the job).
     * 
     * @return - the total number of suitable assignments
     */
    public int listSuitableAssignments() {
		match_counter = 0;
		
		for (int i = 0;  i < numberOfJobs; i++) {
			match_found = false;	
			for (int n = 0; n < numberOfApplicants; n++) {			
				if (jobs[i].getlocation().equals(applicants[n].getlocation()) && jobs[i].getjobskill().equals(applicants[n].getskill()) && jobs[i].getyearsOfExperienceRequired() <= applicants[n].getyearsOfExperience()){
					match_counter += 1;
					match_found = true;
					System.out.println("Match found = [" + jobs[i].getcompany() + ", " + jobs[i].getlocation() + ", " + jobs[i].getjobskill() + "] ---> " + applicants[n].getname() + "[" + applicants[n].getgender() + "]" + ", " + applicants[n].getlocation() );
			}
			}
			if (match_found == false) {
				System.out.println("No match found for [" + jobs[i].getcompany() + ", " + jobs[i].getlocation() + ", " + jobs[i].getjobskill() + "]");
			}
		}
		return match_counter;
	}
}



