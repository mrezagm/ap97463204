package All;

import All.model.Course;
import All.model.CourseStudent;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ViewOwnStudentCourse extends JDialog implements GlobalClass {
    ViewOwnStudentCourse.ClickTableModel model;
    List<CourseStudent> cs10 = new ArrayList<CourseStudent>(100);
    List<Course> c10 = new ArrayList<Course>(100);
    public static void main(String[] args) {
        new ViewAllStudent(   );
    }

    public ViewOwnStudentCourse(  ) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                for (int i = 0; i< GlobalClass.cs1.size(); i++){
                    if(GlobalClass.cs1.get(i).getIdStudent() == GlobalClass.studentIdLogedin.get(0)) {
                        cs10.add(GlobalClass.cs1.get(i));

                        if(GlobalClass.cs1.get(i).getIdCourse()==GlobalClass.c1.get(i).getId())
                            c10.add(GlobalClass.c1.get(i));

                    }}
                model = new ViewOwnStudentCourse.ClickTableModel(c10);


                JTable table = new JTable(model);

                JFrame frame = new JFrame("View Your  Course");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }



    public static class ClickTableModel extends AbstractTableModel {

        private java.util.List<Course> clicks;

        public ClickTableModel(List<Course> clicks) {
            this.clicks = new ArrayList<>(clicks);
        }

        @Override
        public int getRowCount() {
            return clicks.size();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public String getColumnName(int column) {
            String name = "??";
            switch (column) {
                case 0:
                    name = "Course Id";
                    break;
                case 1:
                    name = "Course Name";
                    break;
                case 2:
                    name = " Unit Course";
                    break;

                case 3:
                    name = "Teacher Name";

                    break;
                case 4:
                    name = "teacher Last name";
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
            Course click = clicks.get(rowIndex);
            Object value = null;
            switch (columnIndex) {
                case 0:
                    value = click.getId();

                    break;
                case 1:
                    value = click.getName();
                    break;
                case 2:
                    value = click.getUnit();
                    break;

                case 3:
                    value = click.getFirstName();
                    break;
                case 4:
                    value = click.getLastName();
                    break;
            }
            return value;
        }
    }

}
