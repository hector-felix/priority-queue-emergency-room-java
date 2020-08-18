package csc311proj04;

// * @author Hector Felix
public class ER {

    public PriorityQueue pq = new PriorityQueue(15);
    public ArrayList<Patient> pal = new ArrayList<>();
    Patient f = new Patient();
    int patientNumber = 1;
    String formatted;

    public void office() {

        Patient p0 = new Patient("John", "Smith", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p1 = new Patient("Denyah", "Majona", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p2 = new Patient("Dead", "Mau5", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p3 = new Patient("Wave", "Chappelle", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p4 = new Patient("Mark", "Battles", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p5 = new Patient("Mac", "Miller", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p6 = new Patient("Quentin", "Miller", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p7 = new Patient("Nasir", "Khan", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p8 = new Patient("DeAndre", "Jordan", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p9 = new Patient("Marsh", "Mellow", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p10 = new Patient("Tee", "Grizzley", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p11 = new Patient("Marshall", "Mathers", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p12 = new Patient("Kendrick", "Lamar", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p13 = new Patient("Benny", "Benassi", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());
        Patient p14 = new Patient("Andrew", "Bayer", f.setMedicalConditionAndUrgency(), f.randomArrivalTime(), 10, f.getUrgency());

        pal.add(p0);
        pal.add(p1);
        pal.add(p2);
        pal.add(p3);
        pal.add(p4);
        pal.add(p5);
        pal.add(p6);
        pal.add(p7);
        pal.add(p8);
        pal.add(p9);
        pal.add(p10);
        pal.add(p11);
        pal.add(p12);
        pal.add(p13);
        pal.add(p14);

        for (int i = 0; i < pal.getSize(); i++) {
            for (int j = 0; j < pal.getSize() - i - 1; j++) {
                if (pal.get(j).getArrivalTime() > pal.get(j + 1).getArrivalTime()) {
                    Patient temp = pal.get(j);
                    pal.set(j, pal.get(j + 1));
                    pal.set(j + 1, temp);
                }
            }
        }

        for (int clock = 0; clock < 60; clock += 2) {

//            if (j < 1) {
//                clock = pal.get(0).getArrivalTime();
//                pq.insert(pal.remove(0));
//                pq.peek().setTimeAttended(0);
//                formatted = String.format("%02d", patientNumber);
//                System.out.print(formatted + ": "+pq.remove());
//                patientNumber++;
//                j++;
//                clock += 2;
//            }
            while (!pal.isEmpty() && pal.get(0).getArrivalTime() <= clock) {
                pq.insert(pal.remove(0));
            }
            if (patientNumber < 10) {
                formatted = String.format("%02d", patientNumber);
            } else {
                formatted = String.format("%01d", patientNumber);
            }
            if (!pq.isEmpty()) {
                pq.peek().setTimeAttended(clock - pq.peek().getArrivalTime());
                System.out.print(formatted + ": " + pq.remove());
                patientNumber++;
            }
        }
    }
}
