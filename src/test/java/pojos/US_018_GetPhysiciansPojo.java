package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_018_GetPhysiciansPojo {

    /*
    {
        "createdBy": "vusalgasimov",
        "createdDate": "2022-06-27T11:26:29.621480Z",
        "id": 94211,
        "firstName": "fatma seher",
        "lastName": "sudan",
        "birthDate": "1980-01-01T00:00:00Z",
        "phone": "555-555-5555",
        "gender": "FEMALE",
        "bloodGroup": "Apositive",
        "adress": "qwwq",
        "description": "",
     */

    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;

    public US_018_GetPhysiciansPojo() {
    }

    public US_018_GetPhysiciansPojo(String firstName, String lastName, String birthDate, String phone, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
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
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "US_018_GetPhysicians{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
