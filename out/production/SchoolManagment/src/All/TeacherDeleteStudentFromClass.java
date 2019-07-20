package All;

import All.model.CourseStudent;
import All.model.Student;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TeacherDeleteStudentFromClass extends JDialog implements GlobalClass {

    List<CourseStudent> cs10 = new ArrayList<CourseStudent>(100);


    private JTextField tfId;
    private JTextField tfCourseId;


    private JLabel lbId;
    private JLabel lbCourseId;




    private JButton btnDelete;
    private JButton btnCancel;

    private boolean succeeded;

    public TeacherDeleteStudentFromClass(Frame parent) {
        super(parent, "Delete Student From Course", true);



        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        lbId = new JLabel("Student Id: ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(lbId, cs);

        tfId = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(tfId, cs);

        lbCourseId = new JLabel("Course Id: ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(lbCourseId, cs);

        tfCourseId  = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(tfCourseId , cs);


        panel.setBorder(new LineBorder(Color.GRAY));



        btnDelete = new JButton("Delete Student From Class");

        btnDelete.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int   m = 0;
                for (int i = 0; i< GlobalClass.cs1.size(); i++){
                    if(GlobalClass.cs1.get(i).getIdStudent() == getId() && GlobalClass.cs1.get(i).getIdCourse() == getCourseId()  ) {
                  m    = (GlobalClass.cs1).indexOf(GlobalClass.cs1.get(i));
                        GlobalClass.cs1.remove(m);
                    }}

             //   GlobalClass.cs1.remove(GlobalClass.cs1.get(i));

                if (true) {
                    JOptionPane.showMessageDialog(TeacherDeleteStudentFromClass.this,
                            "! successfully Deleted :  ",
                            "Register",
                            JOptionPane.INFORMATION_MESSAGE);
                    succeeded = true;

                    dispose();
                } else {
                    JOptionPane.showMessageDialog(TeacherDeleteStudentFromClass.this,
                            "Invalid ...................",
                            "Register",
                            JOptionPane.ERROR_MESSAGE);
                    // reset username and password
                    tfCourseId.setText("");
                    tfId.setText("");
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
        bp.add(btnDelete);
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


    public int getCourseId() {
        return Integer.parseInt(tfCourseId.getText().trim());
    }


    public int getId() {
        return  Integer.parseInt(tfId.getText().trim());
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }
}