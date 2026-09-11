abstract class HospitalManagement {

    private String hospitalName;
    private String hospitallocation;

    public HospitalManagement(String hospitalName, String hospitallocation) {
        this.hospitalName = hospitalName;
        this.hospitallocation = hospitallocation;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitallocation() {
        return hospitallocation;
    }

    public abstract void displayInfo();
}

