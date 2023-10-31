package school.management.system;
// This class has info related to id, name, salary of teacher
public class Teacher {
    private int id;
    private String name;
    private char gender;
    private double salary;
    private double receivedSalary;
    // Constructor to initialize the Teacher class at object instantiation
    public Teacher(int id, String name, char gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        receivedSalary = 0;
    }
    // Setter to increase the salary of the teacher in case of promotion
    public void changeSalary(double salary) {
        this.salary = salary;
    }
    // Updates the salary received by the teacher and the money spent by the school
    public void setReceivedSalary(double salary) {
        receivedSalary += salary;
        School.updateTotalMoneySpent(salary);
    }
    // Returns the ID of the teacher
    public int getId() {
        return id;
    }
    // Returns the name of the teacher
    public String getName() {
        return name;
    }
    // Returns the gender of the teacher
    public char getGender() {
        return gender;
    }
    // Returns the salary of the teacher
    public double getSalary() {
        return salary;
    }
    // Returns the salary received by the teacher
    public double getReceivedSalary() {
        return receivedSalary;
    }
    //
    public double getRemainingSalary() {
        return salary-receivedSalary;
    }
}