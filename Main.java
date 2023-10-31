package school.management.system;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int size = 10, choice1, std, id, flag;
        double salary;
        String name;
        char c, gender;
        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();
        School school = new School(teacherList, studentList);
        Student student;
        Teacher teacher;
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************************************************");
        System.out.println("\t\t\t\t\t\t\tSCHOOL MANAGEMENT SYSTEM");
        System.out.println("******************************************************************************");
        while(true) {
            System.out.println("Enter 1 for Student");
            System.out.println("Enter 2 for Teacher");
            System.out.println("Enter 3 for School");
            System.out.println("Enter 4 for School Report");
            System.out.println("Enter 0 to exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println("------------------------------------------------------------------------------");
            switch(choice) {
                case 0:
                    System.out.println("Thanks for using the School Management System");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("\t\t\t\t\t\t\t\tSTUDENT MENU");
                    do {
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.println("Enter 1 to enter details");
                        System.out.println("Enter 2 to pay fees");
                        System.out.println("Enter 3 to check remaining fees");
                        System.out.println("Enter 0 to exit from Student Menu");
                        System.out.print("Enter your choice: ");
                        choice1 = sc.nextInt();
                        System.out.println("------------------------------------------------------------------------------");
                        switch(choice1) {
                            case 0:
                                System.out.println("Exiting from Student Menu");
                                System.out.println("------------------------------------------------------------------------------");
                                break;

                            case 1:
                                // Name
                                System.out.print("Enter the name: ");
                                name = sc.nextLine();
                                name = sc.nextLine();
                                System.out.print("Are you sure you want to enter name as "+name+"? (Y/N): ");
                                c = sc.next().charAt(0);
                                if(c == 'Y' || c == 'y') {
                                    // Proceeds ahead
                                }
                                else if(c == 'N' || c == 'n') {
                                    System.out.print("Enter correct name: ");
                                    name = sc.nextLine();
                                    name = sc.nextLine();
                                }
                                else {
                                    System.out.println("Invalid Input!");
                                }
                                // ID
                                System.out.print("Enter the ID: ");
                                id = sc.nextInt();
                                System.out.print("Are you sure you want to enter ID as "+id+"? (Y/N): ");
                                c = sc.next().charAt(0);
                                if(c == 'Y' || c == 'y') {
                                    // Proceeds ahead
                                }
                                else if(c == 'N' || c == 'n') {
                                    System.out.print("Enter correct ID: ");
                                    id = sc.nextInt();
                                }
                                else {
                                    System.out.println("Invalid Input!");
                                }
                                // Gender
                                System.out.print("Enter the gender (M/F): ");
                                gender = sc.next().charAt(0);
                                // Standard
                                System.out.print("Enter the standard: ");
                                std = sc.nextInt();
                                if (std <= 0 || std > 12) {
                                    System.out.println("You have entered invalid standard");
                                    System.out.print("Enter the standard correctly: ");
                                    std = sc.nextInt();
                                }
                                // Object instantiation
                                student = new Student(id, name, std, gender);
                                // Adding to List
                                studentList.add(student);
                                break;

                            case 2:
                                System.out.print("Enter Name: ");
                                name=sc.nextLine();
                                name=sc.nextLine();
                                double fee;
                                flag = 0;
                                // Traversing the Student List to find the name
                                for(int j=0;j<studentList.size();j++) {
                                    // Collecting fees if name is found
                                    if(studentList.get(j).getName().equalsIgnoreCase(name)) {
                                        if(studentList.get(j).getFeesPaid()==30000) {
                                            System.out.println("You have already paid the fees");
                                            flag = 1;
                                            break;
                                        }
                                        else {
                                            System.out.print("Enter the amount: ");
                                            fee = sc.nextDouble();
                                            studentList.get(j).payFees(fee);
                                            System.out.println("Rs. " + fee + " paid successfully");
                                            flag = 1;
                                            break;
                                        }
                                    }
                                }
                                // Else showing error
                                if(flag==0) {
                                    System.out.println(name+" not found!");
                                }
                                break;

                            case 3:
                                System.out.print("Enter Name: ");
                                name=sc.nextLine();
                                name=sc.nextLine();
                                flag = 0;
                                // Traversing the Student List to find the name
                                for(int j=0;j<studentList.size();j++) {
                                    // Showing fees if name is found
                                    if(studentList.get(j).getName().equalsIgnoreCase(name)) {
                                        // Appropriate message if fees are paid
                                        if(studentList.get(j).remainingFees()==0) {
                                            System.out.println("You have paid the fees!");
                                            flag = 1;
                                            break;
                                        }
                                        else {
                                            System.out.println("Fees remaining: Rs. "+studentList.get(j).remainingFees());
                                            flag = 1;
                                            break;
                                        }
                                    }
                                }
                                // Else showing error
                                if(flag==0) {
                                    System.out.println(name+" not found!");
                                }
                                break;

                            default:
                                System.out.println("Invalid Input");
                                break;
                        }
                    } while(choice1!=0);
                    break;

                case 2:
                    System.out.println("\t\t\t\t\t\t\t\tTEACHER MENU");
                    do {
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.println("Enter 1 to enter details");
                        System.out.println("Enter 2 to see details about salary");
                        System.out.println("Enter 0 to exit from Teacher Menu");
                        System.out.print("Enter your choice: ");
                        choice1 = sc.nextInt();
                        System.out.println("------------------------------------------------------------------------------");
                        switch(choice1) {
                            case 0:
                                System.out.println("Exiting from Teacher Menu");
                                System.out.println("------------------------------------------------------------------------------");
                                break;

                            case 1:
                                // Name
                                System.out.print("Enter the name: ");
                                name = sc.nextLine();
                                name = sc.nextLine();
                                System.out.print("Are you sure you want to enter name as "+name+"? (Y/N): ");
                                c = sc.next().charAt(0);
                                if(c == 'Y' || c == 'y') {
                                    // Proceeds ahead
                                }
                                else if(c == 'N' || c == 'n') {
                                    System.out.print("Enter correct name: ");
                                    name = sc.nextLine();
                                    name = sc.nextLine();
                                }
                                else {
                                    System.out.println("Invalid Input!");
                                }
                                // ID
                                System.out.print("Enter the ID: ");
                                id = sc.nextInt();
                                System.out.print("Are you sure you want to enter ID as "+id+"? (Y/N): ");
                                c = sc.next().charAt(0);
                                if(c == 'Y' || c == 'y') {
                                    // Proceeds ahead
                                }
                                else if(c == 'N' || c == 'n') {
                                    System.out.print("Enter correct ID: ");
                                    id = sc.nextInt();
                                }
                                else {
                                    System.out.println("Invalid Input!");
                                }
                                // Gender
                                System.out.print("Enter the gender (M/F): ");
                                gender = sc.next().charAt(0);
                                // Standard
                                System.out.print("Enter the salary: ");
                                salary = sc.nextDouble();
                                if (salary<0) {
                                    System.out.print("Please enter the salary correctly: ");
                                    salary = sc.nextDouble();
                                }
                                // Object instantiation
                                teacher = new Teacher(id, name, gender, salary);
                                // Adding to List
                                teacherList.add(teacher);
                                break;

                            case 2:
                                System.out.print("Enter Name: ");
                                name=sc.nextLine();
                                name=sc.nextLine();
                                double fee;
                                flag = 0;
                                // Traversing the Teacher List to find the name
                                for(int j=0;j<teacherList.size();j++) {
                                    // Displaying salary if found
                                    if(teacherList.get(j).getName().equalsIgnoreCase(name)) {
                                        System.out.println("Salary: Rs. "+teacherList.get(j).getSalary());
                                        System.out.println("Received Salary: Rs. "+teacherList.get(j).getReceivedSalary());
                                        System.out.println("Remaining Salary: Rs. "+teacherList.get(j).getRemainingSalary());
                                        flag = 1;
                                        break;
                                    }
                                }
                                // Else showing error
                                if(flag==0) {
                                    System.out.println(name+" not found!");
                                }
                                break;

                            default:
                                System.out.println("Invalid Input");
                                break;
                        }
                    } while(choice1!=0);
                    break;

                case 3:
                    System.out.println("\t\t\t\t\t\t\t\tSCHOOL MENU");
                    do {
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.println("Enter 1 to display the list of Teachers");
                        System.out.println("Enter 2 to display the list of Students");
                        System.out.println("Enter 3 to check the total money earned by the school");
                        System.out.println("Enter 4 to check the total money spent by the school");
                        System.out.println("Enter 5 to check the profit of the school");
                        System.out.println("Enter 6 to change the salary of a Teacher");
                        System.out.println("Enter 7 to pay the salary of a Teacher");
                        System.out.println("Enter 0 to exit from School Menu");
                        System.out.print("Enter your choice: ");
                        choice1 = sc.nextInt();
                        System.out.println("------------------------------------------------------------------------------");
                        switch(choice1){
                            case 0:
                                System.out.println("Exiting from School Menu");
                                System.out.println("------------------------------------------------------------------------------");
                                break;
                            case 1:
                                // Creating a list T of Teacher to get the first index of original Teachers list
                                List<Teacher> T = school.getTeachers();
                                // Using C language printing format to understand the table clearly
                                System.out.println("------------------------------------------------------------------------------");
                                System.out.printf("%11s%10s   %3s   %10s   %10s","NAME","ID","GENDER","SALARY","SALARY RECEIVED\n");
                                System.out.println("------------------------------------------------------------------------------");
                                // For each loop to print the contents of table
                                for(Teacher value : T){
                                    System.out.printf("%15s %5d   %4c   %12.1f      %7.1f\n",value.getName(), value.getId(), value.getGender(), value.getSalary(), value.getReceivedSalary());
                                }
                                System.out.println();
                                break;

                            case 2:
                                // Creating a list S of Student to get the first index of original Students list
                                List<Student> S = school.getStudents();
                                // Using C language printing format to understand the table clearly
                                System.out.println("------------------------------------------------------------------------------");
                                System.out.printf("%11s%10s   %3s   %3s   %10s   %10s","NAME","ID","STD","GENDER","TOTAL FEES","FEES PAID\n");
                                System.out.println("------------------------------------------------------------------------------");
                                // For each loop to print the contents of table
                                for(Student value : S){
                                    System.out.printf("%15s %5d   %3d   %4c   %12.1f     %7.1f\n",value.getName(), value.getId(), value.getStd(), value.getGender(), value.getFeesTotal(), value.getFeesPaid());
                                }
                                break;

                            case 3:
                                System.out.println("Total money earned by the school: Rs. " +school.getTotalMoneyEarned());
                                break;

                            case 4:
                                System.out.println("Total money spent by the school: Rs. "+school.getTotalMoneySpent());
                                break;

                            case 5:
                                // Displaying appropriate message if the school is losing money
                                if(school.profitOfSchool() < 0){
                                    System.out.println("The school has incurred a loss of Rs. "+(-school.profitOfSchool()));
                                    System.out.println("The school is in loss. Take some action quickly!");
                                }
                                else {
                                    System.out.println("Profit of the school: Rs. "+school.profitOfSchool());
                                }
                                break;

                            case 6:
                                System.out.print("Enter the name: ");
                                name = sc.nextLine();
                                name = sc.nextLine();
                                List<Teacher> teach = school.getTeachers();
                                flag = 0;
                                for (Teacher value : teach) {
                                    // If teacher is found then changing their salary
                                    if (value.getName().equalsIgnoreCase(name)) {
                                        System.out.println("Current salary: Rs. " +value.getSalary());
                                        System.out.print("Enter the new salary: ");
                                        salary = sc.nextDouble();
                                        value.changeSalary(salary);
                                        System.out.println("Salary successfully updated!");
                                        flag = 1;
                                        break;
                                    }
                                }
                                if(flag == 0) {
                                    System.out.println(name+" not found!");
                                }
                                break;

                            case 7:
                                System.out.print("Enter the name: ");
                                name = sc.nextLine();
                                name = sc.nextLine();
                                List<Teacher> teacher_list = school.getTeachers();
                                flag = 0;
                                for (Teacher value : teacher_list) {
                                    if (value.getName().equalsIgnoreCase(name)) {
                                        // Checks if the salary is already paid or not
                                        if (value.getRemainingSalary()==0) {
                                            System.out.println("Salary already paid.");
                                            flag = 1;
                                        }
                                        else {
                                            System.out.println("Current salary : Rs. " + value.getSalary());
                                            System.out.println("Remaining salary: Rs. " + value.getRemainingSalary());
                                            System.out.print("Enter the amount you want to pay: ");
                                            salary = sc.nextDouble();
                                            value.setReceivedSalary(salary);
                                            System.out.println("Rs. " + salary + " successfully paid.");
                                            System.out.println("Updated remaining salary: " + value.getRemainingSalary());
                                            flag = 1;
                                        }
                                    }
                                }
                                if(flag == 0) {
                                    System.out.println(name+" not found!");
                                }
                                break;

                            default:
                                System.out.println("Invalid Input");
                                break;
                        }
                    } while(choice1!=0);
                    break;

                case 4:

                    System.out.println("Data has been stored successfully in the schoolFunds.txt file");
                    System.out.println("------------------------------------------------------------------------------");
                    FileWriter fileWriter = new FileWriter("schoolFunds.txt");
                    fileWriter.write("==============\n|School Funds|\n==============\n\n");
                    fileWriter.write("Total money earned by the school: Rs. " + school.getTotalMoneyEarned()+"\n");
                    fileWriter.write("Total money spent by the school: Rs. "+school.getTotalMoneySpent()+"\n");

                    if(school.profitOfSchool() < 0){
                        fileWriter.write("The school has incurred a loss of Rs. "+(-school.profitOfSchool())+"\n");
                        fileWriter.write("The school is in loss. Take some action quickly!"+"\n");
                    }
                    else {
                        fileWriter.write("Profit of the school: Rs. "+school.profitOfSchool()+"\n");
                    }

                    fileWriter.close();
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}