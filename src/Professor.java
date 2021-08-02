public class Professor {

    private String firstName;
    private String lastName;
    private Course course;

    public Professor(String firstName, String lastName, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Course getCourse() {
        return course;
    }

    public void gradeCourse(Course course, Float grade){
        course.setGrade(this, grade);
    }
}
