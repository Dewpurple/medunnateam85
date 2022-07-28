package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US19_API_Staff_Pojo {

/*
[
  {
    "adress": "string",
    "birthDate": "2022-07-27T01:57:03.191Z",
    "bloodGroup": "Apositive",
    "country": {
      "id": 0,
      "name": "string"
    },
    "createdBy": "string",
    "createdDate": "2022-07-27T01:57:03.192Z",
    "cstate": {
      "country": {
        "id": 0,
        "name": "string"
      },
      "id": 0,
      "name": "string"
    },
    "description": "string",
    "firstName": "string",
    "gender": "MALE",
    "id": 0,
    "lastName": "string",
    "phone": "string",
    "ssn": "418-11-7791",
    "user": {
      "activated": true,
      "createdBy": "string",
      "createdDate": "2022-07-27T01:57:03.193Z",
      "email": "string",
      "firstName": "string",
      "id": 0,
      "imageUrl": "string",
      "langKey": "string",
      "lastName": "string",
      "login": "string",
      "resetDate": "2022-07-27T01:57:03.193Z",
      "ssn": "850-67-2246"
    }
  }
]
 */

    private String firstName;
    private String lastName;
    private String email;
    private String ssn;
    private String phone;
    private String bloodGroup;
    private String gender;
    private String langKey;
    private String adress;
    private boolean activated; // If the user is activated by admin it is giving us true, if not it gives us false;

    public US19_API_Staff_Pojo() {
    }

    public US19_API_Staff_Pojo(String firstName, String lastName, String email, String ssn, String phone,  String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ssn = ssn;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "US19_API_Staff_Pojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                ", phone='" + phone + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", gender='" + gender + '\'' +
                ", langKey='" + langKey + '\'' +
                ", adress='" + adress + '\'' +
                ", activated=" + activated +
                '}';
    }
}

















/*
{
        "createdBy": "vusalgasimov",
        "createdDate": "2022-07-26T23:06:54.680475Z",
        "id": 141209,
        "firstName": "John",
        "lastName": "Snow",
        "birthDate": null,
        "phone": "369-56-99-66",
        "gender": null,
        "bloodGroup": null,
        "adress": null,
        "description": null,
        "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2022-07-26T14:48:19.680982Z",
        "id": 139095,
        "login": "jsnow",
        "firstName": "John",
        "lastName": "Snow",
        "email": "jsnow@gmail.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "369-56-9966"
        },
        "country": null,
        "cstate": null
        },


 */

