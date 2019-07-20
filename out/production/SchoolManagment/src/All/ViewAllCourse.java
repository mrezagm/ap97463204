package All;

import All.model.Course;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ViewAllCourse  extends JDialog implements GlobalClass {

    public static void main(String[] args) {
        new ViewAllStudent(   );
    }

    public ViewAllCourse(  ) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }


                ViewAllCourse.ClickTableModel model = new ViewAllCourse.ClickTableModel(GlobalClass.c1);

                JTable table = new JTable(model);

                JFrame frame = new JFrame("View All Course");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }



    public static class ClickTableModel extends AbstractTableModel {

        private List<Course> clicks;

        public ClickTableModel(List<Course> clicks) {
            this.clicks = new ArrayList<>(clicks);
        }

        @Override
        public int getRowCount() {
            return clicks.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public String getColumnName(int column) {
            String name = "??";
            switch (column) {
                case 0:
                    name = "Course Id";
                    break;
                case 1:
                    name = "First Name of Teacher";
                    break;
                case 2:
                    name = "Last Name of Teacher";
                    break;

                case 3:
                    name = "Unit of Course";
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
                    value = click.getFirstName();
                    break;
                case 3:
                    value = click.getLastName();
                    break;
                case 4:
                    value = click.getUnit();
                    break;

            }
            return value;
        }
    }

}
