package All.model;

public class Manager {
    private String  userName;
    private String passWord;

    public Manager(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
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

        if (username.equals("1") && password.equals("1")) {
            return true;
        }
        return false;
    }


}
