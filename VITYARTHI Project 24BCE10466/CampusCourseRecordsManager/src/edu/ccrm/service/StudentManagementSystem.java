package edu.ccrm.service;

public class StudentManagementSystem {
	private java.util.List<edu.ccrm.domain.Student> students = new java.util.ArrayList<>();

    public void addStudent(edu.ccrm.domain.Student student) {
        students.add(student);
    }

    public void viewStudents() {
        for(edu.ccrm.domain.Student s : students) {
            System.out.println(s);
        }
    }

    public void updateStudent(int id, String newName, String newGrade) {
        for (edu.ccrm.domain.Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setGrade(newGrade);
                break;
            }
        }
    }

    public void deleteStudent(int id) {
        java.util.Iterator<edu.ccrm.domain.Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    public edu.ccrm.domain.Student searchStudentByName(String name) {
        for (edu.ccrm.domain.Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
}
