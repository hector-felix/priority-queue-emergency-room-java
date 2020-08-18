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
//Code Taken from https://www.sanfoundry.com/java-program-priority-queue/
public class PriorityQueue {

    private Task[] heap;
    private int heapSize, capacity;

    /**
     * Constructor *
     */
    public PriorityQueue(int capacity) {
        this.capacity = capacity + 1;
        heap = new Task[this.capacity];
        heapSize = 0;
    }

    /**
     * function to clear *
     */
    public void clear() {
        heap = new Task[capacity];
        heapSize = 0;
    }

    /**
     * function to check if empty *
     */
    public boolean isEmpty() {
        return heapSize == 0;
    }

    /**
     * function to check if full *
     */
    public boolean isFull() {
        return heapSize == capacity - 1;
    }

    /**
     * function to get Size *
     */
    public int size() {
        return heapSize;
    }

    /**
     * function to insert task *
     * @param patient
     */
    public void insert(Patient patient) {
        //public void insert(Patient patient, int priority) {
        Task newJob = new Task(patient, patient.getUrgency());

        heap[++heapSize] = newJob;
        int pos = heapSize;
        while (pos != 1 && newJob.priority < heap[pos / 2].priority) {
            heap[pos] = heap[pos / 2];
            pos /= 2;
        }
        heap[pos] = newJob;
    }

    /**
     * function to remove task
     *
     *
     * @return
     */
    public Task remove() {
        int parent, child;
        Task item, temp;
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return null;
        }

        item = heap[1];
        temp = heap[heapSize--];

        parent = 1;
        child = 2;
        while (child <= heapSize) {
            if (child < heapSize && heap[child].priority > heap[child + 1].priority) {
                child++;
            }
            if (temp.priority <= heap[child].priority) {
                break;
            }
            heap[parent] = heap[child];
            parent = child;
            child *= 2;
        }
        heap[parent] = temp;
        return item;
    }

    public Patient peek() {
        return heap[1].patient;
    }

    public String toString() {
        String s = "";
        for (int k = 1; k <= heapSize; k++) {
            s += heap[k] + " ";
        }
        return s;
    }

}
