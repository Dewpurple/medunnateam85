package pojos;

public class PojoPatientEditInformation {


    private String id;

    public PojoPatientEditInformation(String id, String ssn, String patientFirstName, String patientLastname, String patientBirthDate, String patientEmail, String patientPhoneNumber, String patientGender, String patientBloodGroup, String patientAddress, String patientDescription, String patientUser, String patientCountry, String patientState) {
        this.id = id;
        this.ssn = ssn;
        this.patientFirstName = patientFirstName;
        this.patientLastname = patientLastname;
        this.patientBirthDate = patientBirthDate;
        this.patientEmail = patientEmail;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientGender = patientGender;
        this.patientBloodGroup = patientBloodGroup;
        this.patientAddress = patientAddress;
        this.patientDescription = patientDescription;
        this.patientUser = patientUser;
        this.patientCountry = patientCountry;
        this.patientState = patientState;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastname() {
        return patientLastname;
    }

    public void setPatientLastname(String patientLastname) {
        this.patientLastname = patientLastname;
    }

    public String getPatientBirthDate() {
        return patientBirthDate;
    }

    public void setPatientBirthDate(String patientBirthDate) {
        this.patientBirthDate = patientBirthDate;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientDescription() {
        return patientDescription;
    }

    public void setPatientDescription(String patientDescription) {
        this.patientDescription = patientDescription;
    }

    public String getPatientUser() {
        return patientUser;
    }

    public void setPatientUser(String patientUser) {
        this.patientUser = patientUser;
    }

    public String getPatientCountry() {
        return patientCountry;
    }

    public void setPatientCountry(String patientCountry) {
        this.patientCountry = patientCountry;
    }

    public String getPatientState() {
        return patientState;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }
    private String ssn;
    private String patientFirstName;

    @Override
    public String toString() {
        return "PojoPatientEditInformation{" +
                "id='" + id + '\'' +
                ", ssn='" + ssn + '\'' +
                ", patientFirstName='" + patientFirstName + '\'' +
                ", patientLastname='" + patientLastname + '\'' +
                ", patientBirthDate='" + patientBirthDate + '\'' +
                ", patientEmail='" + patientEmail + '\'' +
                ", patientPhoneNumber='" + patientPhoneNumber + '\'' +
                ", patientGender='" + patientGender + '\'' +
                ", patientBloodGroup='" + patientBloodGroup + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientDescription='" + patientDescription + '\'' +
                ", patientUser='" + patientUser + '\'' +
                ", patientCountry='" + patientCountry + '\'' +
                ", patientState='" + patientState + '\'' +
                '}';
    }

    private String patientLastname;
    private String patientBirthDate;
    private String patientEmail;
    private String patientPhoneNumber;
    private String patientGender;
    private String patientBloodGroup;
    private String patientAddress;
    private String patientDescription;
    private String patientUser;
    private String patientCountry;
    private String patientState;

}
