 package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Appointment {
        private String firstName;
        private String lastName;
        private String ssn;
        private String email;
        private String phoneNumber;
        private String startDate;
        private String createdDate;

        public Appointment(){

        }

        public Appointment(String firstName, String lastName,String ssn,String email,String phoneNumber,String startDate, String createdDate){
            this.firstName = firstName;
            this.lastName = lastName;
            this.ssn = ssn;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.startDate = startDate;
            this.createdDate = createdDate;
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

        public String getSsn() {
            return ssn;
        }

        public void setSsn(String ssn) {
            this.ssn = ssn;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String createdDate) {
            this.startDate = createdDate;
        }

        public String getCreatedDate() {
            return createdDate;
        }
        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        @Override
        public String toString() {
            return "Appointment{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", ssn='" + ssn + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", startDate='" + startDate + '\'' +
                    ", createdDate='" + createdDate + '\'' +
                    '}';
        }
    }

