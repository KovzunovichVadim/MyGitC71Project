public class Patient {
    private int healingPlan;
    Doctor doctor;

    public Patient(int healingPlan) {
        this.healingPlan = healingPlan;
    }

    public int getHealingPlan() {
        return healingPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }
}
