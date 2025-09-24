package edu.ccrm.domain;

public class Course {
	private int courseId;
    private String name;
    private String description;
    private int creditHours;

    public Course(int courseId, String name, String description, int creditHours) {
        this.courseId = courseId;
        this.name = name;
        this.description = description;
        this.creditHours = creditHours;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course [ID=" + courseId + ", Name=" + name + ", Description=" + description + ", Credit Hours=" + creditHours + "]";
    }
}
