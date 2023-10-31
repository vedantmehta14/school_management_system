package school.management.system;
// This class has info related to id, name, standard, gender, total fees and fees paid of student
public class Student {
    // Properties of Student class
    private int id;
    private String name;
    private int std;
    private char gender;
    private double feesPaid;
    private double feesTotal;
    // Constructor to initialize the Student class at object instantiation
    // Initially fees paid will be zero and the total fees will be Rs. 30,000
    public Student(int id, String name, int std, char gender) {
        this.id = id;
        this.name = name;
        this.std = std;
        this.gender = gender;
        feesPaid = 0;
        feesTotal = 30000;
    }
    // To update the fees paid by a student and to add the fees paid in the money earned by the school
    public void payFees(double fees) {
            feesPaid += fees;
            School.updateTotalMoneyEarned(fees);
    }
    // Returns the fees remaining to be paid
    public double remainingFees() {
        return feesTotal-feesPaid;
    }
    // Returns the ID of the student
    public int getId() {
        return id;
    }
    // Returns the name of the student
    public String getName() {
        return name;
    }
    // Returns the standard of the student
    public int getStd() {
        return std;
    }
    // Returns the gender of the student
    public char getGender() {
        return gender;
    }
    // Returns the fees paid by the student
    public double getFeesPaid() {
        return feesPaid;
    }
    // Returns the total fees of the school
    public double getFeesTotal() {
        return feesTotal;
    }
}