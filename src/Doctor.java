import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class Doctor extends Patient {
  Map<Integer, String> doctorsData = new LinkedHashMap<>();

  String doctorName;
  int doctorId;

  Doctor(int patientId, String patientName,String doctorName,Integer doctorId) {
    super(patientId, patientName);
    this.doctorName =doctorName;
    this.doctorId = doctorId;

    // Add doctors to the LinkedHashMap
    doctorsData.put(10, "Sunil");
    doctorsData.put(55, "John");
    doctorsData.put(25, "Jane");
    doctorsData.put(50, "Michael");
    doctorsData.put(30, "Emily");
  }

  Random random = new Random();
  int randomIndex = random.nextInt(5);

  public void allocateDoctor() {
    List<String> valuesList = new ArrayList<>(doctorsData.values());
    doctorName = valuesList.get(randomIndex);
    System.out.println("Dr."+doctorName + " allocated to " + getPatientName());
  }

  
  public String getDoctorName(){
    return doctorName;
  }

  public Integer getDoctorId(){
    List<Integer> keysList = new ArrayList<>(doctorsData.keySet());
    doctorId = keysList.get(randomIndex);
    return doctorId;
  }
}