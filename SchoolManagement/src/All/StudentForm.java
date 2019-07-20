package All;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends  JDialog {
    JButton btnViewAllCourse;
     JButton btnNewCourseStudent;
    JButton btnDeleteCourse;
    JButton btnViewOwnCourse;


    public StudentForm(Frame parent) {
        super(parent, "Student  Form", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        btnViewAllCourse = new JButton("View All The Courses (Classes)");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(btnViewAllCourse, cs);

        btnNewCourseStudent = new JButton("Get A New Course (Class)");
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(btnNewCourseStudent, cs);

        btnDeleteCourse = new JButton("Delete/Remove A Course (Class)  ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(btnDeleteCourse, cs);

        btnViewOwnCourse = new JButton("View  My Courses (Classes)");
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(btnViewOwnCourse, cs);
        panel.setBorder(new LineBorder(Color.GRAY));






        btnNewCourseStudent.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        AddNewCourseStudent addNewCourceStudent = new AddNewCourseStudent(parent);
                        addNewCourceStudent.setVisible(true);

                    }
                });


        btnViewAllCourse.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ViewAllCourse viewAllCourse = new ViewAllCourse();


                    }
                });


        btnDeleteCourse.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        StudentDeleteOwnCourse studentDeleteOwnCourse=new StudentDeleteOwnCourse(parent);
                        studentDeleteOwnCourse.setVisible(true);
                    }
                });


        btnViewOwnCourse.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        ViewOwnStudentCourse viewOwnStudentCourse= new ViewOwnStudentCourse();
                    }
                });
        JPanel bp = new JPanel();


        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.PAGE_END);

        pack();
        setResizable(false);
        setLocationRelativeTo(parent);


    }
}