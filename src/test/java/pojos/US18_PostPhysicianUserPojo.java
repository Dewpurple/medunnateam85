package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US18_PostPhysicianUserPojo {

    private boolean activated;
    private String login;
    private String ssn;

    public US18_PostPhysicianUserPojo() {
    }

    public US18_PostPhysicianUserPojo(boolean activated, String login, String ssn) {
        this.activated = activated;
        this.login = login;
        this.ssn = ssn;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US_018_PostPhysicianUserPojo{" +
                "activated=" + activated +
                ", login='" + login + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
