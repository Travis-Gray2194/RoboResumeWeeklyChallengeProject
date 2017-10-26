import java.util.ArrayList;

/**
 * Created by ${TravisGray} on 10/25/2017.
 */
public class Person {
    private String firstname,lastName,email;
    private ArrayList<Education> educationArrayList;
    private ArrayList<Experience>experienceArrayList;
    private ArrayList<Skills>skillsArrayList;

    public Person() {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.educationArrayList = educationArrayList;
        this.experienceArrayList = experienceArrayList;
        this.skillsArrayList = skillsArrayList;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEducationArrayList() {
        return educationArrayList;
    }

    public void setEducationArrayList(ArrayList<Education> educationArrayList) {
        this.educationArrayList = educationArrayList;
    }

    public ArrayList<Experience> getExperienceArrayList() {
        return experienceArrayList;
    }

    public void setExperienceArrayList(ArrayList<Experience> experienceArrayList) {
        this.experienceArrayList = experienceArrayList;
    }

    public ArrayList<Skills> getSkillsArrayList() {
        return skillsArrayList;
    }

    public void setSkillsArrayList(ArrayList<Skills> skillsArrayList) {
        this.skillsArrayList = skillsArrayList;
    }

    //Used for Validation Testing
    public void addEducation(Education aEducation){
        educationArrayList.add(aEducation);
    }
}
