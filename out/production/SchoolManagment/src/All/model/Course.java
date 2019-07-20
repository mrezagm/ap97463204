package All.model;

public class Course {

    private    int id;
    private   String name;
    private   int unit;
    private    String firstName;
    private    String lastName;
    private    int teacherId;

    private    String classNumber;
    private    String classTime;

    public Course(int id, String name, int unit, String firstName, String lastName, int teacherId, String classNumber, String classTime) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacherId = teacherId;
        this.classNumber = classNumber;
        this.classTime = classTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }
}
