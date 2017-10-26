import java.util.ArrayList;

/**
 * Created by ${TravisGray} on 10/25/2017.
 */
public class Person {
    private String firstname,lastName,email;
    private ArrayList<Education> educationArrayList;
    private ArrayList<Experience>experienceArrayList;
    private ArrayList<Skill>skillsArrayList;

    public Person() {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.educationArrayList = new ArrayList<Education>();
        this.experienceArrayList = new ArrayList<Experience>();
        this.skillsArrayList = new ArrayList<Skill>();


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

    public ArrayList<Skill> getSkillsArrayList() {
        return skillsArrayList;
    }

    public void setSkillsArrayList(ArrayList<Skill> skillsArrayList) {
        this.skillsArrayList = skillsArrayList;
    }

    //Methods to add to ArrayList
    public void addEducation(Education aEducation){
        educationArrayList.add(aEducation);
    }

    public void addExperience(Experience aExperience){experienceArrayList.add(aExperience);}

    public void addSkill(Skill aSkill){skillsArrayList.add(aSkill);}
}
