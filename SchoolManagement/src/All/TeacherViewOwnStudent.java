package All;

import All.model.Course;
import All.model.CourseStudent;
import All.model.Student;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherViewOwnStudent implements GlobalClass {


    public static void main(String[] args) {
        new TeacherViewOwnStudent(   );
    }
    List<CourseStudent> cs10 = new ArrayList<CourseStudent>(100);
    List<Student> s10 = new ArrayList<Student>(100);
    TeacherViewOwnStudent.ClickTableModel model;
    public TeacherViewOwnStudent(  ) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                for (int i = 0; i< GlobalClass.cs1.size(); i++){
                    if(GlobalClass.cs1.get(i).getId() == GlobalClass.TeacherIdLogedin.get(0)) {
                        cs10.add(GlobalClass.cs1.get(i));

                        for (int j = 0; j< cs10.size(); j++){
                            if(GlobalClass.s1.get(i).getId() == cs10.get(j).getIdStudent()) {
                                s10.add(GlobalClass.s1.get(i));
                            }

                        }
                    }
                }

                model = new TeacherViewOwnStudent.ClickTableModel(s10);

                JTable table = new JTable(model);
                table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent event) {
                        // do some actions here, for example
                        // print first column value from selected row
                        System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());

                    }
                });


               /* table.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        int row = table.rowAtPoint(evt.getPoint());
                        int col = table.columnAtPoint(evt.getPoint());
                        if (row >= 0 && col >= 0) {
                            ViewAllStudent viewAllStudent= new ViewAllStudent();

                        }
                    }
                });*/
                /*table.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {

                        int row = table.getSelectedRow();
                        int col = table.getSelectedColumn();



                    }
                });*/

                JFrame frame = new JFrame("View Your Student");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }



    public static class ClickTableModel extends AbstractTableModel {

        private java.util.List<Student> clicks;

        public ClickTableModel(List<Student> clicks) {

            this.clicks = new ArrayList<>(clicks);

        }

        @Override
        public int getRowCount() {
            return clicks.size();
        }



        @Override
        public int getColumnCount() {
            return 6;
        }

        @Override
        public String getColumnName(int column) {
            String name = "??";
            switch (column) {
                case 0:
                    name = "Id";
                    break;
                case 1:
                    name = "FirstName";
                    break;
                case 2:
                    name = "LastName";
                    break;

                case 3:
                    name = "Major";
                    break;
                case 4:
                    name = "Term";
                    break;
                case 5:
                    name = "National Code";
                    break;

            }
            return name;
        }


        @Override
        public Class<?> getColumnClass(int columnIndex) {
            Class type = String.class;
            switch (columnIndex) {
                case 0:
                case 1:
                    type = Integer.class;
                    break;
            }
            return type;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Student click = clicks.get(rowIndex);
            Object value = null;
            switch (columnIndex) {
                case 0:
                    value = click.getId();

                    break;
                case 1:
                    value = click.getFirstName();
                    break;
                case 2:
                    value = click.getLastName();
                    break;
                case 3:
                    value = click.getMajor();
                    break;
                case 4:
                    value = click.getTerm();
                    break;
                case 5:
                    value = click.getNationalCode();
                    break;
            }
            return value;
        }
    }
}
