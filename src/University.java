import java.util.ArrayList;
import java.util.List;

public class University {

    List<Course> courseList;
    List<Student> students;
    List<Professor> professors;

    public University() {
        this.courseList = new ArrayList<Course>();
        this.students = new ArrayList<Student>();
        this.professors = new ArrayList<Professor>();
    }

    public List<Course> getCourseList() {
        List<Course> buffer = new ArrayList<>();
        buffer.addAll(courseList);
        return buffer;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Student> getStudents() {
        List<Student> buffer = new ArrayList<>();
        buffer.addAll(students);
        return buffer;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Professor> getProfessors() {
        List<Professor> buffer = new ArrayList<>();
        buffer.addAll(professors);
        return buffer;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }
}
