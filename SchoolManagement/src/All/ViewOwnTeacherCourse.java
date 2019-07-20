package All;

import All.model.Course;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ViewOwnTeacherCourse extends JDialog implements GlobalClass {
    ViewOwnTeacherCourse.ClickTableModel model;
    List<Course> c10 = new ArrayList<Course>(100);
    public static void main(String[] args) {
        new ViewOwnTeacherCourse(   );
    }

    public ViewOwnTeacherCourse(  ) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                for (int i = 0; i< GlobalClass.c1.size(); i++){
                    if(GlobalClass.c1.get(i).getTeacherId() == GlobalClass.TeacherIdLogedin.get(0)) {
                       c10.add(GlobalClass.c1.get(i));



                    }}
                model = new ViewOwnTeacherCourse.ClickTableModel(c10);


                JTable table = new JTable(model);

                JFrame frame = new JFrame("View Your Course");
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
                    name = "Unit Course";
                    break;
                case 3:
                    name = "Class Time";
                    break;
                case 4:
                    name = "Class Number";
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
                    value = click.getClassNumber();
                    break;
                case 4:
                    value = click.getClassTime();
                    break;
            }
            return value;
        }
    }

}
