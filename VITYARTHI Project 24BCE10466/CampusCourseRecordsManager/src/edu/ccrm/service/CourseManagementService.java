package edu.ccrm.service;

public class CourseManagementService {
	  private java.util.List<edu.ccrm.domain.Course> courses = new java.util.ArrayList<>();

	    public void addCourse(edu.ccrm.domain.Course course) {
	        courses.add(course);
	    }

	    public void viewCourses() {
	        System.out.printf("%-10s %-20s %-30s %-10s%n", "Course ID", "Name", "Description", "Credits");
	        System.out.printf("%-10s %-20s %-30s %-10s%n", "---------", "----", "-----------", "-------");
	        for (edu.ccrm.domain.Course c : courses) {
	            System.out.printf("%-10d %-20s %-30s %-10d%n", c.getCourseId(), c.getName(), c.getDescription(), c.getCreditHours());
	        }
	    }

	    public void updateCourse(int courseId, String newName, String newDescription, int newCreditHours) {
	        for (edu.ccrm.domain.Course c : courses) {
	            if (c.getCourseId() == courseId) {
	                c.setName(newName);
	                c.setDescription(newDescription);
	                c.setCreditHours(newCreditHours);
	                break;
	            }
	        }
	    }

	    public void deleteCourse(int courseId) {
	        java.util.Iterator<edu.ccrm.domain.Course> iterator = courses.iterator();
	        while (iterator.hasNext()) {
	            if (iterator.next().getCourseId() == courseId) {
	                iterator.remove();
	                break;
	            }
	        }
	    }

	    public edu.ccrm.domain.Course searchCourseByName(String name) {
	        for (edu.ccrm.domain.Course c : courses) {
	            if (c.getName().equalsIgnoreCase(name)) {
	                return c;
	            }
	        }
	        return null;
	    }
}
