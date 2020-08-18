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
public class Task {
        int priority;
        Patient patient;
        
        /**
         * Constructor *
     * @param patient
     * @param priority
         */
        public Task(Patient patient, int priority) {
            this.patient = patient;
            this.priority = priority;
        }
      
        /**
         * toString() *
         */
        public String toString() {
            return patient+"";
//            return "PATIENT INFO : " + patient + "\nPriority : " + priority;
        }
    }

