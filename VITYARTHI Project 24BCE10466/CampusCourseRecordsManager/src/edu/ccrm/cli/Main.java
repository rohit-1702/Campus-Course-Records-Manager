package edu.ccrm.cli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        edu.ccrm.service.StudentManagementSystem sms = new edu.ccrm.service.StudentManagementSystem();
        edu.ccrm.service.CourseManagementService cms = new edu.ccrm.service.CourseManagementService();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n--- Campus Course Records Manager ---");
            System.out.println("1. View All Students");
            System.out.println("2. Add Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. View All Courses");
            System.out.println("6. Add Course");
            System.out.println("7. Update Course");
            System.out.println("8. Delete Course");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nStudents List:");
                    sms.viewStudents();
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    int sid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String sname = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    String sgrade = scanner.nextLine();
                    sms.addStudent(new edu.ccrm.domain.Student(sid, sname, sgrade));
                    System.out.println("Student added.");
                    break;

                case 3:
                    System.out.print("Enter student ID to update: ");
                    int usid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String usname = scanner.nextLine();
                    System.out.print("Enter new grade: ");
                    String usgrade = scanner.nextLine();
                    sms.updateStudent(usid, usname, usgrade);
                    System.out.println("Student updated.");
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int dsid = scanner.nextInt();
                    sms.deleteStudent(dsid);
                    System.out.println("Student deleted (if existed).");
                    break;

                case 5:
                    System.out.println("\nCourses List:");
                    cms.viewCourses();
                    break;

                case 6:
                    System.out.print("Enter course ID: ");
                    int cid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter course name: ");
                    String cname = scanner.nextLine();
                    System.out.print("Enter course description: ");
                    String cdesc = scanner.nextLine();
                    System.out.print("Enter credit hours: ");
                    int credits = scanner.nextInt();
                    cms.addCourse(new edu.ccrm.domain.Course(cid, cname, cdesc, credits));
                    System.out.println("Course added.");
                    break;

                case 7:
                    System.out.print("Enter course ID to update: ");
                    int ucid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new course name: ");
                    String ucname = scanner.nextLine();
                    System.out.print("Enter new description: ");
                    String ucdesc = scanner.nextLine();
                    System.out.print("Enter new credit hours: ");
                    int ucredits = scanner.nextInt();
                    cms.updateCourse(ucid, ucname, ucdesc, ucredits);
                    System.out.println("Course updated.");
                    break;

                case 8:
                    System.out.print("Enter course ID to delete: ");
                    int dcid = scanner.nextInt();
                    cms.deleteCourse(dcid);
                    System.out.println("Course deleted (if existed).");
                    break;

                case 9:
                    running = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();
    }
}

