package All;

import All.model.Teacher;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewTeacher extends JDialog implements GlobalClass {

    private JTextField tfId;
    private JTextField tfNationalCode;
    private JTextField tfMajor;
    private JTextField tfFirstName;
    private JTextField tfLastName;

    private JTextField tfUserName;
    private JPasswordField tfPassWord;

    private JLabel lbId;
    private JLabel lbNationalCode;
    private JLabel lbMajor;
    private JLabel lbFirstName;
    private JLabel lbLastName;
    private JLabel lbUserName;
    private JLabel lbPassWord;


    Teacher T1;

    private JButton btnRegister;
    private JButton btnCancel;

    private boolean succeeded;

    public AddNewTeacher(Frame parent) {
        super(parent, "Register Teacher", true);



        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        lbId = new JLabel("Teacher Id: ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(lbId, cs);

        tfId = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(tfId, cs);

        lbNationalCode= new JLabel("National Code: ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(lbNationalCode, cs);

        tfNationalCode = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(tfNationalCode, cs);


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


        lbMajor= new JLabel("Major of Teacher: ");
        cs.gridx = 0;
        cs.gridy =4;
        cs.gridwidth = 1;
        panel.add(lbMajor, cs);

        tfMajor = new JTextField(20);
        cs.gridx = 1;
        cs.gridy =4;
        cs.gridwidth = 2;
        panel.add(tfMajor, cs);


        lbUserName= new JLabel("User Name: ");
        cs.gridx = 0;
        cs.gridy =5;
        cs.gridwidth = 1;
        panel.add(lbUserName, cs);

        tfUserName = new JTextField(20);
        cs.gridx = 1;
        cs.gridy =5;
        cs.gridwidth = 2;
        panel.add(tfUserName, cs);


        lbPassWord= new JLabel("  PassWord : ");
        cs.gridx = 0;
        cs.gridy =6;
        cs.gridwidth = 1;
        panel.add(lbPassWord, cs);

        tfPassWord = new JPasswordField(20);
        cs.gridx = 1;
        cs.gridy =6;
        cs.gridwidth = 2;
        panel.add(tfPassWord, cs);



        panel.setBorder(new LineBorder(Color.GRAY));



        btnRegister = new JButton("Register");

        btnRegister.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                GlobalClass.t1.add( new Teacher(getId(),getFirstName(),getLastName() ,getNationalCode(), getMajor(),getUserName(),getPassWord()));

                if ( GlobalClass.t1.get(0).getId()!=0) {
                    JOptionPane.showMessageDialog(AddNewTeacher.this,
                            "! successfully Registered :  "+ GlobalClass.t1.get(0).getFirstName(),
                            "Register",
                            JOptionPane.INFORMATION_MESSAGE);
                    succeeded = true;

                    dispose();
                } else {
                    JOptionPane.showMessageDialog(AddNewTeacher.this,
                            "Invalid ...................",
                            "Register",
                            JOptionPane.ERROR_MESSAGE);
                    // reset username and password
                    tfFirstName.setText("");
                    tfLastName.setText("");
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

    public String getNationalCode() {
        return tfNationalCode.getText().trim();
    }
    public String getMajor() {
        return tfMajor.getText().trim();
    }

    public String getFirstName() {
        return tfFirstName.getText().trim();
    }
    public String getLastName() {
        return tfLastName.getText().trim();
    }
    public String getUserName() {
        return  tfUserName.getText().trim() ;
    }
    public String getPassWord() {
        return  tfPassWord.getText().trim() ;
    }

    public int getId() {
        return  Integer.parseInt(tfId.getText().trim());
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }
}