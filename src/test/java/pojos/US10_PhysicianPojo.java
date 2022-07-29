package pojos;

public class US10_PhysicianPojo {
    private String id;
    private String firstName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "US_10_PhysicianPojo{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}