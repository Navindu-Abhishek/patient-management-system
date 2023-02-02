class Bill extends Patient {

    Bill(int patientId, String patientName) {
        super(patientId, patientName);
    }

    public void getBill(){
        System.out.println();
        System.out.println("-----Bill-----");
        System.out.println("Patient Name: "+patientName);
        System.out.println("Patient Id: "+patientId);
        System.out.println("Date of Service: 02/02/2023");
        System.out.println("");
        System.out.println("Medication: Amoxicillin");
        System.out.println("Quantity: 21 tablets");
        System.out.println("Price per tablet: Rs. 1000.00");
        System.out.println("Subtotal: Rs. 21000.00");
        System.out.println("");
        System.out.println("Hospital fee: Rs. 50000.00");
        System.out.println("Total Cost: Rs. 71000.00");
        System.out.println("");
        System.out.println("Thank you come again...");
        System.out.println();
    }
}

