package All;

import All.model.CourseStudent;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewCourseStudent extends JDialog {
    int i;
    private JTextField tfIdCourse;

    private JTextField tfIdStudent;


    private JLabel lbIdCourse;
    private JLabel lbIdStudent;



    CourseStudent CS1;

    private JButton btnRegister;
    private JButton btnCancel;

    private boolean succeeded;

    public AddNewCourseStudent(Frame parent) {
        super(parent, "Register Course Of Student", true);



        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        lbIdCourse = new JLabel("Course Id: ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(lbIdCourse, cs);

        tfIdCourse = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(tfIdCourse, cs);



        panel.setBorder(new LineBorder(Color.GRAY));



        btnRegister = new JButton("Register");

        btnRegister.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (GlobalClass.cs1.size()==0)
                     i=1;
                     else
                         i=GlobalClass.cs1.size()+1;
                    GlobalClass.cs1.add(new CourseStudent(i, getIdCourse(), getIdStudent(), 0));



                if ( GlobalClass.cs1.get(0).getId()!=0) {
                    JOptionPane.showMessageDialog(AddNewCourseStudent.this,
                            "! Successfully Registered :  ",
                            "Register",
                            JOptionPane.INFORMATION_MESSAGE);
                    succeeded = true;

                    dispose();
                } else {
                    JOptionPane.showMessageDialog(AddNewCourseStudent.this,
                            "Invalid ...................",
                            "Register",
                            JOptionPane.ERROR_MESSAGE);
                    // reset username and password
                    tfIdCourse.setText("");
                    tfIdStudent.setText("");
                    succeeded = false;

                }

            }
        });
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        JPanel bp = new JPanel();
        bp.add(btnRegister);
        bp.add(btnCancel);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.PAGE_END);

        pack();
        setResizable(false);
        setLocationRelativeTo(parent);
    }

    public boolean isSucceeded() {
        return succeeded;
    }

    public int getIdStudent() {
        return GlobalClass.studentIdLogedin.get(0);
    }
    public int getIdCourse() {
        return Integer.parseInt(tfIdCourse.getText().trim());
    }




    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }
}