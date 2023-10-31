package school.management.system;
// Importing List library for creating a list
import java.util.List;
// This class has info related to list of teachers and students, money earned and spent by the school and the
// net profit of the school
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private static double totalMoneySpent;
    // Constructor to instantiate the properties of class School
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
    // Returns the list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }
    // For adding a teacher to school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    // Returns the list of students in the school
    public List<Student> getStudents() {
        return students;
    }
    // For adding student to school
    public void addStudent(Student student) {
        students.add(student);
    }
    // Returns the total money earned by the school
    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    //
    public static void updateTotalMoneyEarned(double moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }
    // Returns the total money spent
    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }
    // Updates the money spent by school which is the salary of the teachers
    public static void updateTotalMoneySpent(double moneySpent) {
        totalMoneySpent += moneySpent;
    }
    // Profit
    public double profitOfSchool() {
        return totalMoneyEarned-totalMoneySpent;
    }
}
