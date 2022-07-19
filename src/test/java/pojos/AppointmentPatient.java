package pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class AppointmentPatient {


        private String createdBy;
        private String createdDate;
        private Integer id;
        private String firstName;
        private String lastName;
        private String birthDate;
        private String phone;
        private Object gender;
        private Object bloodGroup;
        private Object adress;
        private String email;
        private Object description;
        private AppointmentUser user;
        private List<Object> inPatients = null;
        private Object country;
        private Object cstate;

    public AppointmentPatient(String firstName, String lastName, String email, AppointmentUser user) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.user = user;
    }

    public AppointmentPatient() {
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

    public AppointmentUser getUser() {
        return user;
    }

    public void setUser(AppointmentUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "AppointmentPatient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", user=" + user +
                '}';
    }
}
