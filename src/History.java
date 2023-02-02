class History extends Bed {

    History(int patientId, String patientName,String doctorName,int doctorId,int bedId) {
        super(patientId, patientName,doctorName,doctorId,bedId);
    }
 
    public void getHistory(){
        System.out.println("-----History of the Patient-----");
        System.out.println();
        System.out.println("Patient name is "+patientName);
        System.out.println("Patient Id is "+patientId);
        System.out.println("Doctor name is Dr."+ doctorName);
        System.out.println("Doctor Id is "+ doctorId);
        System.out.println("Bed Id is "+bedId);
    }
}
