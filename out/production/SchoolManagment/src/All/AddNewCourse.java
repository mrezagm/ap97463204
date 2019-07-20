package All;

import All.model.Course;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewCourse extends JDialog  implements GlobalClass {

    private JTextField tfId;
    private JTextField tfCourseName;
    private JTextField tfUnit;
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JTextField tfTeacherId;
    private JTextField tfClasstime;
    private JTextField tfClassNumber;


    private JLabel lbId;
    private JLabel lbCourseName;
    private JLabel lbUnit;
    private JLabel lbFirstName;
    private JLabel lbLastName;
    private JLabel lbTeacherId;
    private JLabel lbClasstime;
    private JLabel lbClassNumber;

    Course c1;

    private JButton btnRegister;
    private JButton btnCancel;

    private boolean succeeded;

    public AddNewCourse(Frame parent) {
        super(parent, "Register Course", true);



        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        lbId = new JLabel("Course Id: ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(lbId, cs);

        tfId = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(tfId, cs);

        lbCourseName= new JLabel("Course Name: ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(lbCourseName, cs);

        tfCourseName = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(tfCourseName, cs);


        lbFirstName= new JLabel("First Name of Teacher: ");
        cs.gridx = 0;
        cs.gridy = 2;
        cs.gridwidth = 1;
        panel.add(lbFirstName, cs);

        tfFirstName = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 2;
        cs.gridwidth = 2;
        panel.add(tfFirstName, cs);


        lbLastName= new JLabel("Last Name of Teacher: ");
        cs.gridx = 0;
        cs.gridy =3;
        cs.gridwidth = 1;
        panel.add(lbLastName, cs);

        tfLastName = new JTextField(20);
        cs.gridx = 1;
        cs.gridy =3;
        cs.gridwidth = 2;
        panel.add(tfLastName, cs);

        lbTeacherId= new JLabel("Teacher Id: ");
        cs.gridx = 0;
        cs.gridy =4;
        cs.gridwidth = 1;
        panel.add(lbTeacherId, cs);

        tfTeacherId = new JTextField(20);
        cs.gridx = 1;
        cs.gridy =4;
        cs.gridwidth = 2;
        panel.add(tfTeacherId, cs);


        lbUnit= new JLabel("Unit of Course: ");
        cs.gridx = 0;
        cs.gridy =5;
        cs.gridwidth = 1;
        panel.add(lbUnit, cs);

        tfUnit = new JTextField(20);
        cs.gridx = 1;
        cs.gridy =5;
        cs.gridwidth = 2;
        panel.add(tfUnit, cs);

        tfClasstime = new JTextField(20);
        cs.gridx = 1;
        cs.gridy =6;
        cs.gridwidth = 2;
        panel.add(tfClasstime, cs);


        lbClasstime= new JLabel("Class Time: ");
        cs.gridx = 0;
        cs.gridy =6;
        cs.gridwidth = 1;
        panel.add(lbClasstime, cs);



        lbClassNumber= new JLabel("Class Number: ");
        cs.gridx = 0;
        cs.gridy =7;
        cs.gridwidth = 1;
        panel.add(lbClassNumber, cs);

        tfClassNumber = new JTextField(20);
        cs.gridx = 1;
        cs.gridy =7;
        cs.gridwidth = 2;
        panel.add(tfClassNumber, cs);

        panel.setBorder(new LineBorder(Color.GRAY));



        btnRegister = new JButton("Register");

        btnRegister.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {


              GlobalClass.c1.add( new Course(getId() ,getCourseName(),getUnit(),getFirstName(),getLastName(),getTeacherId(),getClassNumber(),getClassTime()))  ;



                if (GlobalClass.c1.get(0).getId()!=0) {
                    JOptionPane.showMessageDialog(AddNewCourse.this,
                              "! Successfully Registered :  "+ GlobalClass.c1.get(0).getName(),
                            "Register",
                            JOptionPane.INFORMATION_MESSAGE);
                    succeeded = true;

                    dispose();
                } else {
                    JOptionPane.showMessageDialog(AddNewCourse.this,
                            "Invalid ...................",
                            "Register",
                            JOptionPane.ERROR_MESSAGE);
                    // reset username and password
                    tfCourseName.setText("");
                    tfFirstName.setText("");
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

    public String getCourseName() {
        return tfCourseName.getText().trim();
    }

    public String getFirstName() {
        return tfFirstName.getText().trim();
    }
    public String getLastName() {
        return tfLastName.getText().trim();
    }
    public int getUnit() {
        return  Integer.parseInt(tfUnit.getText().trim()) ;
    }
    public int getId() {
        return  Integer.parseInt(tfId.getText().trim());
    }
    public int getTeacherId() {
        return  Integer.parseInt(tfTeacherId.getText().trim());
    }

    public String getClassNumber() {
        return  tfClassNumber.getText().trim();
    }
    public String getClassTime()
    {
        return  tfClasstime.getText().trim();
    }


    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }
}