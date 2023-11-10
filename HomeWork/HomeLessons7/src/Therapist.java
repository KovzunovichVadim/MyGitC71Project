public class Therapist extends Doctor {
    @Override
    public void healing() {
        System.out.println("Провести первичный осмотр");
    }

    public void appointDoctor(Patient patient) {
        switch (patient.getHealingPlan()) {
            case 1 -> {
                patient.setDoctor(new Surgeon());
                System.out.println("Назначить хирурга");
                patient.getDoctor().healing();
            }
            case 2 -> {
                patient.setDoctor(new Dantist());
                System.out.println("Назначить дантиста");
                patient.getDoctor().healing();
            }
            default -> {
                System.out.println("Назначить терапевта");
                this.healing();
            }
        }
    }
}
