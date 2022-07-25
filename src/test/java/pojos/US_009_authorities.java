package pojos;


import java.util.List;

public class US_009_authorities {
    private String authorities;

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public US_009_authorities(String authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "US_009_authorities{" +
                "authorities='" + authorities + '\'' +
                '}';
    }
}
