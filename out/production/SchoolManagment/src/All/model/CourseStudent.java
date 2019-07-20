package All.model;

public class CourseStudent {

    private  int id;
    private  int idCourse;
    private  int idStudent;
    private  int Grade;

    public CourseStudent(int id, int idCourse, int idStudent, int grade) {
        this.id = id;
        this.idCourse = idCourse;
        this.idStudent = idStudent;
        Grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }
}
