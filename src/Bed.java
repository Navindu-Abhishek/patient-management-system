import java.util.Random;
class Bed extends Doctor{

    int bedId;

    Bed(int patientId, String patientName,String doctorName,int doctorId,int bedId) {
        super(patientId, patientName,doctorName,doctorId);
        this.bedId = bedId;
    }

    public void allocateBed(){
        Random random = new Random();
        bedId = random.nextInt(101);
        System.out.println("Bed Number "+bedId+" Allocated to "+getPatientName());
    }

    public Integer getBedId(){
        return bedId;
      }
}
