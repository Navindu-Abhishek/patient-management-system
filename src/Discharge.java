class Discharge extends Patient{

    Discharge(int patientId, String patientName) {
        super(patientId, patientName);
    }
    
    public void Discharged(){
        System.out.println("Patient "+patientName+"(Id: "+patientId+")"+" is Discharged from Lora Hospital...");
    }
}
