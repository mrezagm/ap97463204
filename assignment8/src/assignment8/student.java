package assignment8;

public abstract class student implements Comparable<student> {

    public int studentId;
    public String firstName;
    public String lastName;

    public student(){



    }
    public abstract int getStudentId();


    public String toString() {

        return super.toString();
    }
    @Override
    public  int compareTo(student o) {
        if (studentId <o.studentId) {
            return(this.getStudentId());
        }
        return o.studentId;
    }
}