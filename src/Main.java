import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ${TravisGray} on 10/25/2017.
 */


//Write a program that will allow a user to enter in:
//        - a name,
//        - an email address,
//        - anywhere from 1 to 10 educational achievements,
//        - anywhere from 0 to 10 work experiences,
//        - anywhere from 1 to 20 skills with rating
//
//        What's New?
//
//        The program must validate the user's data as it is inputted.
//        The program must use classes and composition.
//        The program must make use of methods.
//        You must follow the naming conventions discussed in class.
//        Secondary objectives:
//        most the program logic should be in the classes and the presentation logic belongs in Main
//        When the user is done entering the information, the program should output the information

public class Main {

    public static void main(String[] args){
        //Create User Input
        Scanner keyboard = new Scanner(System.in);
        Person person = new Person();
        Education education = new Education();
        Skills skills = new Skills();
        Experience experience = new Experience();
        int educount = 0;
        int workcount = 0;
        int skillcount = 0;
        String ans;
        ArrayList<Person>personArrayList = new ArrayList<Person>();
        ArrayList<Skills>skillsArrayList = new ArrayList<Skills>();
        ArrayList<Experience>experienceArrayList = new ArrayList<Experience>();
        ArrayList<Education>educationArrayList = new ArrayList<Education>();


        //Prompt User for Person Details
        System.out.println("<-------------ResumeMaker---------------->");
        System.out.println("Please enter your first name?");
        person.setFirstname(keyboard.nextLine());
        System.out.println("Please enter your last name?");
        person.setLastName(keyboard.nextLine());
        System.out.println("Please enter your email?");
        person.setEmail(keyboard.nextLine());
        //Add Persons detials info to Person Arraylist
        personArrayList.add(person);


        //Test for Validation Count for Educational Achievements
        do{ //Do Loop for Validation Count
            //Validation Check for Education Details Do Loop

            do {//Do loop for entering in Educational Details
//            Prompt user for Education Details
                System.out.println("<---Education--->");
                System.out.println("Enter Education");
                education.setDegree(keyboard.nextLine());
                System.out.println("Enter University");
                education.setUniversity(keyboard.nextLine());
                System.out.println("Enter gradYear");
                education.setGradyear(keyboard.nextLine());
                //Add user Education to Arraylist
                educationArrayList.add(education);
                educount++;
                System.out.println("Would you like to add more education? (Y)es or (N)o");
                ans = keyboard.nextLine();
                if (!ans.equalsIgnoreCase("n")&& educount < 3) {
                    System.out.println ("You have entered" +(educount)+"Educational Achievements");
                }
            } while (ans.equalsIgnoreCase("y"));
        }while (educount>=3);//Print Out Count

        //Prompt user for Experince Details
        System.out.println("<------Experience------->");
        System.out.println("Enter Job Title");
        experience.setJobTitle(keyboard.nextLine());
        System.out.println("Enter Company Name");
        experience.setCompanyTitle(keyboard.nextLine());
        System.out.println("Enter Start Date");
        experience.setStartDate(keyboard.nextLine());
        System.out.println("Enter End Date");
        experience.setEndDate(keyboard.nextLine());

        //Test for Validation Count for Work Experinces
        do{
            if (workcount<10){
                workcount++;
                System.out.println("Please enter Work Experinces  (Max of 10)");
                String workexp = keyboard.nextLine();
            }
        }while (workcount<10);
        System.out.println ("You have entered" +(workcount)+"Work Exerinces");


        //Prompt user for Skills Details
        System.out.println("Enter Skills");
        skills.setSkill(keyboard.nextLine());
        System.out.println("Enter Skill Level Rating (Basic,Intermediate,Advanced)");
        skills.setSkillRating(keyboard.nextLine());

        //Test for Validation Count for Skills and Ratings Working can try For Loop with Counter
        do{
            if (skillcount<20){
                skillcount++;
                System.out.println("Please enter Skills and Ratings (Max of 10)");
                String skill = keyboard.nextLine();
            }
        }while (skillcount<20);
        System.out.println ("You have entered" +(skillcount)+"Work Experinces");
    }
}
