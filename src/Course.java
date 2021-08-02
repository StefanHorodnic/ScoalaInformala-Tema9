public class Course {

    private String name;

    private Float passingGrade;

    private Boolean isSubmitted;

    private Float grade;

    private Professor gradedBy;

    public Course(String name, Float passingGrade) {
        this.name = name;
        this.passingGrade = passingGrade;
        this.isSubmitted = false;
    }

    public void submit() {
        isSubmitted = true;
    }

    public void setGrade(Professor professor, Float grade) {
        if(isSubmitted) {
            this.gradedBy = professor;
            this.grade = grade;
        }
    }
}
