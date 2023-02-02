class Patient {
    int patientId;
    String patientName;
  
    Patient(int patientId, String patientName) {
      this.patientId = patientId;
      this.patientName = patientName;
    }
  
    public int getPatientId() {
      return patientId;
    }
  
    public void setPatientId(int patientId) {
      this.patientId = patientId;
    }
  
    public String getPatientName() {
      return patientName;
    }
  
    public void setPatientName(String patientName) {
      this.patientName = patientName;
    }
  }