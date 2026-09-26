import java.io.File;
import java.time.LocalDateTime;
public abstract class ClinicVisit extends BasedRecord {

    private String id;
    private String studentID;
    private String service;
    private final LocalDateTime visitDate;
    private String status;

    public ClinicVisit(String id, String studentID, String service, LocalDateTime visitDate, String status) {
        this.id = id;
        this.studentID = studentID;
        this.service = service;
        this.visitDate = LocalDateTime.now();
        this.status = status;
    }

     String getId() {
        return id;
    }

     String getStudentID() {
        return studentID;
    }

     String getService() {
        return service;
    }

     LocalDateTime getVisitDate() {
        return visitDate;
    }

     String getStatus() {
        return status;
    }

     void setId(String id) {
        this.id = id;
    }

     void setStudentID(String studentID) {
        this.studentID = studentID;
    }

     void setService(String service) {
        this.service = service;
    }

     void setStatus(String status) {
        this.status = status;
    }
    
    abstract String ToFileString();

    abstract String fromFileString();
    
}