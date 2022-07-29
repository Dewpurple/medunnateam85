package pojos;

public class US10_AppointmentPojo {
    private String createdBy;
    private String id;
    private US10_PhysicianPojo physician;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public US10_PhysicianPojo getPhysician() {
        return physician;
    }

    public void setPhysician(US10_PhysicianPojo physician) {
        this.physician = physician;
    }

    @Override
    public String toString() {
        return "US_10_AppointmentPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", id='" + id + '\'' +
                ", physician=" + physician +
                '}';
    }
}