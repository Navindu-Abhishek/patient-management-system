class Prescription extends Patient {

    Prescription(int patientId, String patientName) {
        super(patientId, patientName);
    }

    public void getPrescription() {
        System.out.println();
        System.out.println("-----Your medication prescription-----");
        System.out.println();
        System.out.println("Patient: " + patientName);
        System.out.println("Prescription: Amoxicillin");
        System.out.println("Dosage: 500 mg");
        System.out.println("Route: Oral");
        System.out.println("Frequency: Three times a day");
        System.out.println("Duration: 7 days");
        System.out.println();
        System.out.println("Instructions: Take one tablet by mouth three times a day after meals for seven days.");
        System.out.println();
        System.out.println("This prescription is for Amoxicillin, a type of antibiotic." + '\n' + "The patient "
                + patientName + ", is instructed to take 500 mg" + '\n'
                + "of the medication orally, three times a day, for a total of seven days.");
        System.out.println();
    }

}

