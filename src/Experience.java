import java.util.ArrayList;

/**
 * Created by ${TravisGray} on 10/25/2017.
 */
public class Experience {

    private String jobTitle,companyTitle,startDate,endDate;
    ArrayList<String>dutyList = new ArrayList<String>();
    public Experience() {
        this.jobTitle= jobTitle;
        this.companyTitle = companyTitle;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getDutyList() {
        return dutyList;
    }

    public void setDutyList(ArrayList<String> dutyList) {
        this.dutyList = dutyList;
    }
}
