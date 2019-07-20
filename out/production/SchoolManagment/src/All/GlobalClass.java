package All;

import All.model.*;

import java.util.ArrayList;
import java.util.List;

public interface GlobalClass {

     static   List<Student> s1 = new ArrayList<Student>(100);
    static   List<Course> c1 = new ArrayList<Course>(100);
    static   List<CourseStudent> cs1 = new ArrayList<CourseStudent>(100);
    static   List<CourseStudentGrade> csg1 = new ArrayList<CourseStudentGrade>(100);

    static   List<Teacher> t1 = new ArrayList<Teacher>(100);
    static   List<String> usernameStudentLogedin = new ArrayList<String>(100);
    static   List<String> usernameTeacherLogedin = new ArrayList<String>(100);
    static   List<Integer> TeacherIdLogedin = new ArrayList<Integer>(100);
    static   List<Integer> studentIdLogedin = new ArrayList<Integer>(100);


    static   List<Course> cofs1 = new ArrayList<Course>(100);
    public static List<Student> getS1() {
        return s1;
    }

    static   List<Integer> selectedClass= new ArrayList<Integer>(100);



}
