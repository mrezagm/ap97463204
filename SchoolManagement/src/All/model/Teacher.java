package All.model;

import All.GlobalClass;

public class Teacher {

    private    int id;
    private   String firstName;
    private   String lastName;
    private   String nationalCode;
    private  String major;
    private String  userName;
    private String passWord;

    public Teacher(int id, String firstName, String lastName, String nationalCode, String major, String userName, String passWord) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.major = major;
        this.userName = userName;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public static boolean Auth(String username, String password) {

        for (int i = 0; i<= GlobalClass.t1.size() ; i++)
        {
            if (username.equals(GlobalClass.t1.get(i).getUserName()) && password.equals(GlobalClass.t1.get(i).getPassWord())) {
                GlobalClass.usernameTeacherLogedin.add( GlobalClass.t1.get(i).getUserName());
                GlobalClass.TeacherIdLogedin.add(GlobalClass.t1.get(i).getId());

                return true;
            }
        }
        return false;
    }

}
