package pojos;

import java.lang.reflect.Array;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public class US_009_Pojo {

    private int id;
    private String login;
    private String firstname;
    private String lastname;
    private String ssn;
    private String email;
    private String imageURL;
    private boolean activated;
    private String langKey;
    private String craetedBy;
    private String lastModifiedBy;
    private String lastModifiedDate;
    private List authorities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getCraetedBy() {
        return craetedBy;
    }

    public void setCraetedBy(String craetedBy) {
        this.craetedBy = craetedBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public List getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "US_009_Pojo{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", craetedBy='" + craetedBy + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", authorities=" + authorities +
                '}';
    }

    public US_009_Pojo(int id, String login, String firstname, String lastname, String ssn, String email, String imageURL, boolean activated, String langKey, String craetedBy, String lastModifiedBy, String lastModifiedDate, List authorities) {
        this.id = id;
        this.login = login;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.email = email;
        this.imageURL = imageURL;
        this.activated = activated;
        this.langKey = langKey;
        this.craetedBy = craetedBy;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.authorities = authorities;
    }
}
