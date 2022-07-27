package pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class AppointmentGet {
    private String createdBy;
    private String createdDate;
    private Integer id;
    private String startDate;
    private String endDate;
    private String status;
    private Object anamnesis;
    private Object treatment;
    private Object diagnosis;
    private Object prescription;
    private Object description;
    private Object physician;
    private AppointmentPatient patient;
    private List<Object> ctests = null;

    public AppointmentGet(AppointmentPatient patient) {
        this.patient = patient;
    }

    public AppointmentGet() {
    }

    public AppointmentPatient getPatient() {
        return patient;
    }

    public void setPatient(AppointmentPatient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "AppointmentGet{" +
                "patient=" + patient +
                '}';
    }
}
