package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US_018_PostPhysicianPojo {

    private int examFee;
    private String firstName;
    private String lastName;
    private String phone;
    private String ssn;
    private US_018_PostPhysicianUserPojo user;

    public US_018_PostPhysicianPojo() {
    }

    public US_018_PostPhysicianPojo(int examFee, String firstName, String lastName, String phone, String ssn, US_018_PostPhysicianUserPojo user) {
        this.examFee = examFee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.ssn = ssn;
        this.user = user;
    }

    public int getExamFee() {
        return examFee;
    }

    public void setExamFee(int examFee) {
        this.examFee = examFee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public US_018_PostPhysicianUserPojo getUser() {
        return user;
    }

    public void setUser(US_018_PostPhysicianUserPojo user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "US_018_PostPhysicianPojo{" +
                "examFee=" + examFee +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", user=" + user +
                '}';
    }
}
