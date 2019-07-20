package All;

import All.model.Course;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectOneCourse extends JDialog  implements GlobalClass {

    private JTextField tfId;


    private JLabel lbId;

    Course c1;

    private JButton btnSelect;
    private JButton btnCancel;

    private boolean succeeded;

    public SelectOneCourse(Frame parent) {
        super(parent, "Select Class of Course", true);



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





        btnSelect = new JButton("Select Course");

        btnSelect.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {


              GlobalClass.selectedClass.add( getId())  ;


                ViewSelectedOneCourse viewSelectedOneCourse=new ViewSelectedOneCourse();


            }
        });
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        JPanel bp = new JPanel();
        bp.add(btnSelect);
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

    public int getId() {
        return  Integer.parseInt(tfId.getText().trim());
    }


    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }
}