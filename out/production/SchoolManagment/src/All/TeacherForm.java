package All;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherForm  extends  JDialog {


      JButton btnViewOwnStudent;

      JButton btnNewGrade ;

      JButton btnDeleteStudent  ;


      JButton btnViewOwnCourse ;

    public TeacherForm(Frame parent) {
        super(parent, "Teacher Form", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        btnViewOwnStudent = new JButton("View  My Students");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(btnViewOwnStudent, cs);

        btnNewGrade = new JButton("Submit Grades");
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(btnNewGrade, cs);

        btnDeleteStudent = new JButton("Delete/Remove A Student  ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(btnDeleteStudent, cs);

        btnViewOwnCourse = new JButton("View  My Courses (Classes)");
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(btnViewOwnCourse, cs);
        panel.setBorder(new LineBorder(Color.GRAY));


        btnViewOwnStudent.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        TeacherViewOwnStudent teacherViewOwnStudent= new TeacherViewOwnStudent();
                    }
                });


        btnNewGrade.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        AddNewGrade addNewGrade=new AddNewGrade(parent);
                        addNewGrade.setVisible(true);
                    }
                });

        btnDeleteStudent.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        TeacherDeleteStudentFromClass teacherDeleteStudentFromClass=new TeacherDeleteStudentFromClass(parent);
                        teacherDeleteStudentFromClass.setVisible(true);
                    }
                });


        btnViewOwnCourse.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        ViewOwnTeacherCourse viewOwnTeacherCourse= new ViewOwnTeacherCourse();
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
