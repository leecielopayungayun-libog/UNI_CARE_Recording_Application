public abstract class DentalAppointment extends BasedRecord {
   private String id;
   private String studentID;
   private String service;
   private LocalDateTime AppointmentDate;
   private String dentist;
   private String status;
   
   DentalAppointment(String id, String studentID, String service, LocalDateTime AppointmentDate, String dentist, String status) {
       this.id = id;
       this.studentID = studentID;
       this.service = service;
       this.AppointmentDate = AppointmentDate;
       this.dentist = dentist;
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

     LocalDateTime getAppointmentDate() {
        return AppointmentDate;
    }

     String getDentist() {
        return dentist;
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

     void setAppointmentDate(LocalDateTime AppointmentDate) {
        this.AppointmentDate = AppointmentDate;
    }

     void setDentist(String dentist) {
        this.dentist = dentist;
    }

     void setStatus(String status) {
        this.status = status;
    }
    
    abstract String ToFileString();

    abstract String fromFileString();



}
