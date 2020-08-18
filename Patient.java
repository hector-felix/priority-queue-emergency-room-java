/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc311proj04;

/**
 *
 * @author Hector Felix
 */
public class Patient<E> {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
 /*
 * @author: Hector Felix
 * 
     */
    private String firstName, lastName;
    private String medicalCondition;
    private int arrivalTime; // random arrival time
    private int timeAttended; //time from arrival to seeing doctor elapsed
    private int urgency; // random urgency

    public Patient() {
        this.firstName = "";
        this.lastName = "";
        this.medicalCondition = "";
        this.arrivalTime = 0;
        this.timeAttended = 0;
        this.urgency = 0;
    }

    public Patient(String firstName, String lastName, String medicalCondition, int arrivalTime, int timeAttended, int urgency) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.medicalCondition = medicalCondition;
        this.arrivalTime = arrivalTime;
        this.timeAttended = timeAttended;
        this.urgency = urgency;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setMedicalConditionAndUrgency() {
        int a = randomUrgency();

        switch (a) {
            case 1:
                this.urgency = a;
                return "Heart Attack";
            case 2:
                this.urgency = a;
                return "Trauma";
            case 3:
                this.urgency = a;
                return "Stroke";
            case 4:
                this.urgency = a;
                return "Choking";
            case 5:
                this.urgency = a;
                return "Kidney Stone";
            case 6:
                this.urgency = a;
                return "Seizure";
            case 7:
                this.urgency = a;
                return "Head Injury";
            case 8:
                this.urgency = a;
                return "Severe Chest Pain";
            case 9:
                this.urgency = a;
                return "Electrical Shock";
            case 10:
                this.urgency = a;
                return "Severe Burn";
            case 11:
                this.urgency = a;
                return "Dizziness";
            case 12:
                this.urgency = a;
                return "Heavy Bleeding";
            case 13:
                this.urgency = a;
                return "Deep Wound";
            case 14:
                this.urgency = a;
                return "Suddenly Weak";
            case 15:
                this.urgency = a;
                return "Back Pain";
            case 16:
                this.urgency = a;
                return "Broken Bone";
            case 17:
                this.urgency = a;
                return "Panic Attack";
            case 18:
                this.urgency = a;
                return "Sore Throat";
            case 19:
                this.urgency = a;
                return "Coughing";
            case 20:
                this.urgency = a;
                return "Minor Cut";

        }
        return null;
    }

    public String getMedicalCondition() {
        return this.medicalCondition;
    }

    public int randomArrivalTime() {
        return (int) (Math.random() * ((30 - 0) + 0)) + 0;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setTimeAttended(int timeAttended) {
        this.timeAttended = timeAttended;
    }

    public int getTimeAttended() {
        return timeAttended;
    }

    public int randomUrgency() {
        return (int) (Math.random() * ((20 - 0) + 0)) + 1;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    //We will override toString
//    @Override
    public String toString() {
        String formatted;
        String formatted1;

        if (this.arrivalTime < 10) {
            formatted = String.format("%02d", this.arrivalTime);
        } else {
            formatted = String.format("%01d", this.arrivalTime);
        }
        if (this.arrivalTime + this.timeAttended < 10) {
            formatted1 = String.format("%02d", this.arrivalTime + this.timeAttended);
        } else {
            formatted1 = String.format("%01d", this.arrivalTime + this.timeAttended);
        }

        String s = "";

        s = ("First Name: " + this.firstName + " | Last Name: " + this.lastName
                + " | Medical Condition: " + this.medicalCondition + " | Arrival Time: 2:" + formatted
                + "PM | Time Attended: 2:" + formatted1 + "PM (Wait Time: "
                + (this.timeAttended) + " minutes) | Urgency: " + this.urgency + '\n');

        return s;
    }
}
