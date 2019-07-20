package All;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public  static   void main(String[] args) {

        final JFrame frame = new JFrame("School Management");
        final JButton btnLoginManager = new JButton("Click to login Admin");
        final JButton btnLoginStudent = new JButton("Click to login Student");
        final JButton btnLoginTeacher = new JButton("Click to login Teacher");

        btnLoginManager.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {

                        LoginDialogManager loginDlg = new LoginDialogManager(frame);
                        loginDlg.setVisible(true);
                        // if logon successfully
                        if(loginDlg.isSucceeded()){

                            ManagerForm managerForm = new ManagerForm(frame);
                            managerForm.setVisible(true);


                        }
                    }
                });

        btnLoginStudent.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        LoginDialogStudent loginDlg = new LoginDialogStudent(frame);
                        loginDlg.setVisible(true);
                        // if logon successfully
                        if(loginDlg.isSucceeded()){
                            StudentForm studentForm = new StudentForm(frame);
                            studentForm.setVisible(true);





                        }
                    }
                });
        btnLoginTeacher.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        LoginDialogTeacher loginDlg = new LoginDialogTeacher(frame);
                        loginDlg.setVisible(true);
                        // if logon successfully
                        if(loginDlg.isSucceeded()){
                             TeacherForm teacherForm = new TeacherForm(frame);
                            teacherForm.setVisible(true);



                        }
                    }
                });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(btnLoginManager);
        frame.getContentPane().add(btnLoginStudent);
        frame.getContentPane().add(btnLoginTeacher);
        frame.setVisible(true);
    }
}