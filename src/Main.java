import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient(0, "");
        Doctor doctor = new Doctor(0, "", "", 0);
        Bed bed = new Bed(0, "", "", 0, 0);
        History history = new History(0, "", "", 0, 0);
        Prescription prescription = new Prescription(0, "");
        Discharge discharge = new Discharge(0, "");
        Bill bill = new Bill(0, "");

        System.out.println("----------Dashboard----------");
        System.out.println();
        System.out.println("Welcome to the Lora Hospital");
        System.out.println("--------------------------------");
        System.out.println();
        Dashboard dashboard = new Dashboard();
        dashboard.getDashboard();

        int choice = 1;
        while (choice != 0) {
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter patient id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter patient name: ");
                    String name = sc.next();
                    patient = new Patient(id, name);
                }
                case 2 -> {
                    doctor = new Doctor(patient.getPatientId(), patient.getPatientName(), doctor.getDoctorName(), doctor.getDoctorId());
                    doctor.allocateDoctor();
                }
                case 3 -> {
                    bed = new Bed(patient.getPatientId(), patient.getPatientName(), doctor.getDoctorName(),
                            doctor.getDoctorId(),
                            bed.getBedId());
                    bed.allocateBed();
                }
                case 4 -> {
                    history = new History(patient.getPatientId(), patient.getPatientName(), doctor.getDoctorName(),
                            doctor.getDoctorId(), bed.getBedId());
                    history.getHistory();
                }
                case 5 -> {
                    prescription = new Prescription(patient.getPatientId(), patient.getPatientName());
                    prescription.getPrescription();
                }
                case 6 -> {
                    discharge = new Discharge(patient.getPatientId(), patient.getPatientName());
                    discharge.Discharged();
                }
                case 7 -> {
                    bill = new Bill(patient.getPatientId(), patient.getPatientName());
                    bill.getBill();
                }
                case 0 -> {
                    System.out.println("Exiting the program...");
                    System.out.println();
                }
                default -> System.out.println("Invalid input. Try again.");
            }
        }
    }
}