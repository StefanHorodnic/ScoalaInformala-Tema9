import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        University veterinarySchool = new University();

        Course anatomy = new Course("Anatomy", 5.0f);
        Course histology = new Course("Histology", 5.0f);
        Course infectiousDiseases = new Course("Infectious Diseases", 5.0f);

        Professor firstAnatomyProfessor = new Professor("Dumitru", "Popescu", anatomy);
        Professor secondAnatomyProfessor = new Professor("Alex", "Iliescu", anatomy);
        Professor firstHistologyProfessor = new Professor("Paul", "Pop", histology);
        Professor firstInfectiousDiseases = new Professor("Iulia", "Dud", infectiousDiseases);

        Student student1 = new Student("A", "B");
        student1.addCourse(anatomy);
        student1.addCourse(histology);

        Student student2 = new Student("C","D");
        student2.addCourse(infectiousDiseases);
        Student student3 = new Student("E", "F");
        student3.addCourse(infectiousDiseases);

        veterinarySchool.courseList.add(anatomy);
        veterinarySchool.courseList.add(histology);
        veterinarySchool.courseList.add(infectiousDiseases);
        veterinarySchool.professors.add(firstAnatomyProfessor);
        veterinarySchool.professors.add(secondAnatomyProfessor);
        veterinarySchool.professors.add(firstHistologyProfessor);
        veterinarySchool.professors.add(firstInfectiousDiseases);
        veterinarySchool.students.add(student1);
        veterinarySchool.students.add(student2);
        veterinarySchool.students.add(student3);

        student1.submitCourse(anatomy);
        student1.submitCourse(infectiousDiseases);

        firstAnatomyProfessor.gradeCourse(student1.courseList.get(student1.courseList.indexOf(anatomy)),9f);

    }
}
