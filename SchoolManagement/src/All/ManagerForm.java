package All;

import All.model.Manager;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerForm  extends  JDialog{

      JButton btnNewCourse;

      JButton btnNewTeacher ;

      JButton btnNewStudent;

      JButton btnAllStudent ;

      JButton btnViewAllCourse;
      JButton btnViewOneCourseAllStudent;


    public ManagerForm(Frame parent) {
        super(parent, "Manager Form", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        btnNewCourse = new JButton("Add A New Course (Class)");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(btnNewCourse, cs);

        btnNewTeacher = new JButton("Employ A New Teacher");
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(btnNewTeacher, cs);

        btnNewStudent = new JButton("Add A New Student ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(btnNewStudent, cs);

        btnAllStudent = new JButton("View All The Students");
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(btnAllStudent, cs);
        panel.setBorder(new LineBorder(Color.GRAY));

        btnViewAllCourse = new JButton(" View All The Courses (Classes)");
        cs.gridx = 0;
        cs.gridy = 2;
        cs.gridwidth = 1;
        panel.add(btnViewAllCourse, cs);
        panel.setBorder(new LineBorder(Color.GRAY));

        btnViewOneCourseAllStudent = new JButton(" Select A Class To View its Students & Grades");
        cs.gridx = 1;
        cs.gridy = 2;
        cs.gridwidth = 1;
        panel.add(btnViewOneCourseAllStudent, cs);
        panel.setBorder(new LineBorder(Color.GRAY));


        btnNewTeacher.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        AddNewTeacher addNewTeacher = new AddNewTeacher(parent);
                        addNewTeacher.setVisible(true);
                        // if logon successfully
                        if(addNewTeacher.isSucceeded()){

                        }
                    }
                });


        btnNewStudent.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        AddNewStudent addNewStudent = new AddNewStudent(parent);
                        addNewStudent.setVisible(true);
                        // if logon successfully
                        if(addNewStudent.isSucceeded()){


                        }
                    }
                });

        btnNewCourse.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        AddNewCourse addNewCourse = new AddNewCourse(parent);
                        addNewCourse.setVisible(true);
                        // if logon successfully
                        if(addNewCourse.isSucceeded()){

                        }
                    }
                });


        btnViewAllCourse.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        ViewAllCourse viewAllStudent= new ViewAllCourse();

                    }
                });


        btnViewOneCourseAllStudent.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        SelectOneCourse addNewCourseStudent = new SelectOneCourse(parent);
                        addNewCourseStudent.setVisible(true);

                    }
                });
        btnAllStudent.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        ViewAllStudent viewAllStudent= new ViewAllStudent();


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
