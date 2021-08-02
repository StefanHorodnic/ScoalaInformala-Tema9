import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;

    private String lastName;

    List<Course> courseList;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        courseList = new ArrayList<Course>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Course> getCourseList() {
        List<Course> buffer = new ArrayList<Course>();
        buffer.addAll(courseList);
        return buffer;
    }

    public void submitCourse(Course course){
        if(courseList.contains(course)){
            int courseIndex = courseList.indexOf(course);
            courseList.get(courseIndex).submit();
        }
        else{
            System.out.println("Studentul nu participa la acest curs");
        }
    }

    public void addCourse(Course course){
        courseList.add(course);
    }
}
